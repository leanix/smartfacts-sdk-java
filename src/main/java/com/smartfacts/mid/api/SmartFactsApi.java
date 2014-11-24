/*
 * The MIT License
 *
 * Copyright 2014 leanix GmbH.
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
package com.smartfacts.mid.api;

import com.smartfacts.mid.api.common.ApiException;
import com.smartfacts.mid.api.common.StatefulApiClient;
import com.smartfacts.mid.api.models.ElementInfo;
import com.smartfacts.mid.api.models.SearchResponse;
import com.smartfacts.mid.api.models.Warehouse;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Facade for the single apis.
 *
 * Ensures the user is logged in.
 */
public class SmartFactsApi
{
    private final MwhsApi mwhsApi;

    public SmartFactsApi(String baseUrl, String username, String password, String apiKey)
    {
        mwhsApi = new MwhsApi(new StatefulApiClient(baseUrl, username, password, apiKey));
    }

    public SmartFactsApi(MwhsApi mwhsApi)
    {
        this.mwhsApi = mwhsApi;
    }

    public List<Warehouse> listWarehouses() throws ApiException
    {
        return mwhsApi.listWarehouses();
    }

    public SearchResponse search(String mwhId, Boolean isDiagram, String q, Integer rows, Integer start) throws ApiException
    {
        return mwhsApi.search(mwhId, isDiagram, q, rows, start);
    }

    /**
     * @todo fix this override properly
     * @param mwhId
     * @param diagramId
     * @param versionId
     * @return
     * @throws ApiException 
     */
    public InputStream getDiagram(String mwhId, String diagramId, String versionId) throws ApiException
    {
        // create path and map variables
        String path = "/mwhs/{mwhId}/dias/{diagramId}"
                .replaceAll("\\{" + "mwhId" + "\\}", mwhsApi.getClient().escapeString(mwhId))
                .replaceAll("\\{" + "diagramId" + "\\}", mwhsApi.getClient().escapeString(diagramId));

        StatefulApiClient client = (StatefulApiClient) mwhsApi.getClient();
        
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("versionId", versionId);
        Map<String, String> headerParams = new HashMap<>();
                
        return client.getDiagram(path, queryParams, headerParams);
    }

    public ElementInfo getElementInfo(String mwhId, String elementId, String versionId) throws ApiException
    {
        return mwhsApi.getElementInfo(mwhId, elementId, versionId);
    }
}
