/*
* The MIT License (MIT)	 
*
* Copyright (c) 2014 LeanIX GmbH
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of
* this software and associated documentation files (the "Software"), to deal in
* the Software without restriction, including without limitation the rights to
* use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
* the Software, and to permit persons to whom the Software is furnished to do so,
* subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
* FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
* COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
* IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
* CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package com.smartfacts.mid.api;

import com.smartfacts.mid.api.common.ApiException;
import com.smartfacts.mid.api.common.ApiClient;
import com.smartfacts.mid.api.models.ElementInfo;
import com.smartfacts.mid.api.models.SearchResponse;
import com.smartfacts.mid.api.models.Warehouse;
import java.util.*;

public class MwhsApi
{
	private ApiClient apiClient;
	
	public MwhsApi(ApiClient client)
	{
		this.apiClient = client;
	}
	
	public void setClient(ApiClient client)
	{
		this.apiClient = client;
	}

	public ApiClient getClient()
	{
		return this.apiClient;
	}

	public List<Warehouse> listWarehouses () throws ApiException
	{
		// create path and map variables
		String path = "/mwhs".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<Warehouse>) ApiClient.deserialize(response, "Array", Warehouse.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	public SearchResponse search (String mwhId, Boolean isDiagram, String q, Integer rows, Integer start) throws ApiException
	{
		// create path and map variables
		String path = "/mwhs/{mwhId}/search".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mwhId" + "\\}", apiClient.escapeString(mwhId.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(mwhId == null || q == null || isDiagram == null || rows == null || start == null )
		{
			throw new ApiException(400, "missing required params");
		}
		if(!"null".equals(String.valueOf(q)))
			queryParams.put("q", String.valueOf(q));
		if(!"null".equals(String.valueOf(isDiagram)))
			queryParams.put("isDiagram", String.valueOf(isDiagram));
		if(!"null".equals(String.valueOf(rows)))
			queryParams.put("rows", String.valueOf(rows));
		if(!"null".equals(String.valueOf(start)))
			queryParams.put("start", String.valueOf(start));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (SearchResponse) ApiClient.deserialize(response, "", SearchResponse.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
        
	public String getDiagram (String mwhId, String diagramId, String versionId) throws ApiException
	{
		// create path and map variables
		String path = "/mwhs/{mwhId}/dias/{diagramId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mwhId" + "\\}", apiClient.escapeString(mwhId.toString())).replaceAll("\\{" + "diagramId" + "\\}", apiClient.escapeString(diagramId.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(mwhId == null || diagramId == null || versionId == null )
		{
			throw new ApiException(400, "missing required params");
		}
		if(!"null".equals(String.valueOf(versionId)))
			queryParams.put("versionId", String.valueOf(versionId));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (String) ApiClient.deserialize(response, "", String.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	public ElementInfo getElementInfo (String mwhId, String elementId, String versionId) throws ApiException
	{
		// create path and map variables
		String path = "/mwhs/{mwhId}/elements/{elementId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mwhId" + "\\}", apiClient.escapeString(mwhId.toString())).replaceAll("\\{" + "elementId" + "\\}", apiClient.escapeString(elementId.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(mwhId == null || elementId == null || versionId == null )
		{
			throw new ApiException(400, "missing required params");
		}
		if(!"null".equals(String.valueOf(versionId)))
			queryParams.put("versionId", String.valueOf(versionId));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (ElementInfo) ApiClient.deserialize(response, "", ElementInfo.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	}

