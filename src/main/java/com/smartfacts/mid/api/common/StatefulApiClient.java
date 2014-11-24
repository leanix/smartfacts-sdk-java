/*
 * The MIT License
 *
 * Copyright 2014 LeanIX GmbH.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.smartfacts.mid.api.common;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.impl.MultiPartWriter;
import java.io.InputStream;
import java.util.Map;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.NewCookie;

/**
 * This api client reads the cookie from the login response.
 *
 *
 */
public class StatefulApiClient extends ApiClient
{

    private static final String COOKIE_NAME = "PLAY_SESSION";

    private final String username;
    private final String password;
    private final String apiKey;
    private NewCookie cookie;

    public StatefulApiClient(String basePath, String username, String password, String apiKey)
    {
        this.username = username;
        this.password = password;
        this.basePath = basePath;
        this.apiKey = apiKey;
    }

    /**
     * Ensures the api key is set and the user is logged in.
     *
     * @param path
     * @param method
     * @param queryParams
     * @param body
     * @param headerParams
     * @return
     * @throws ApiException
     */
    @Override
    public String invokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams) throws ApiException
    {
        headerParams.put("apikey", apiKey);
        headerParams.put("Csrf-Token", "no-check");
        if (cookie == null)
        {
            login();
        }

        headerParams.put("Cookie", cookie.getValue());
        return super.invokeAPI(path, method, queryParams, body, headerParams);
    }

    /**
     * Returns the input stream for a diagram.
     *
     * @param path
     * @param queryParams
     * @param headerParams
     * @return
     * @throws ApiException
     */
    public InputStream getDiagram(String path, Map<String, String> queryParams, Map<String, String> headerParams) throws ApiException
    {
        headerParams.put("apikey", apiKey);
        headerParams.put("Csrf-Token", "no-check");
        if (cookie == null)
        {
            login();
        }

        String host = this.basePath;
        Client client = getClient(host);

        StringBuilder b = new StringBuilder();

        for (String key : queryParams.keySet())
        {
            String value = queryParams.get(key);
            if (value != null)
            {
                if (b.toString().length() == 0)
                {
                    b.append("?");
                } else
                {
                    b.append("&");
                }
                b.append(escapeString(key)).append("=").append(escapeString(value));
            }
        }
        String querystring = b.toString();

        WebResource.Builder builder = client.resource(host + path + querystring).getRequestBuilder();
        for (String key : headerParams.keySet())
        {
            builder.header(key, headerParams.get(key));
        }

        for (String key : defaultHeaderMap.keySet())
        {
            if (!headerParams.containsKey(key))
            {
                builder.header(key, defaultHeaderMap.get(key));
            }
        }
        
        builder.cookie(cookie.toCookie());

        ClientResponse response = (ClientResponse) builder.get(ClientResponse.class);
        return response.getEntityInputStream();
    }

    public String login() throws ApiException
    {
        if (cookie != null)
        {
            return "";
        }

        String host = this.basePath;

        ClientConfig config = new DefaultClientConfig();
        config.getClasses().add(MultiPartWriter.class);
        Client client = Client.create(config);
        client.addFilter(new LoggingFilter());

        WebResource.Builder builder = client.resource(host + "/login").accept("application/json");

        FormDataMultiPart multiPart = new FormDataMultiPart();
        multiPart.field("email", username);
        multiPart.field("password", password);

        ClientResponse response = builder
                .type(MediaType.MULTIPART_FORM_DATA)
                .accept(MediaType.APPLICATION_JSON)
                .header("Csrf-Token", "nocheck")
                .header("apikey", apiKey)
                .post(ClientResponse.class, multiPart);
        if (response.getStatus() < 400)
        {
            for (NewCookie c : response.getCookies())
            {
                if (COOKIE_NAME.equals(c.getName()))
                {
                    cookie = c;
                    break;
                }
            }

            return (String) response.getEntity(String.class);
        } else
        {
            throw new ApiException(response.getStatus(), response.getEntity(String.class));
        }
    }
}
