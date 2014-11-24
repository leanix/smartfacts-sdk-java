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

package com.smartfacts.mid.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
import com.smartfacts.mid.api.models.Element;
public class SearchResponse
{
	private Integer numFound = null;
	private Integer start = null;
	private List<Element> results = new ArrayList<Element>();
	@JsonProperty("numFound")
	public Integer getNumFound()
	{
		return numFound;
	}
	
	@JsonProperty("numFound")
	public void setNumFound(Integer numFound)
	{
		this.numFound = numFound;
	}

	@JsonProperty("start")
	public Integer getStart()
	{
		return start;
	}
	
	@JsonProperty("start")
	public void setStart(Integer start)
	{
		this.start = start;
	}

	@JsonProperty("results")
	public List<Element> getResults()
	{
		return results;
	}
	
	@JsonProperty("results")
	public void setResults(List<Element> results)
	{
		this.results = results;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class SearchResponse {\n");
		sb.append("  numFound: ").append(numFound).append("\n");
		sb.append("  start: ").append(start).append("\n");
		sb.append("  results: ").append(results).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

