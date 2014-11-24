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
public class Warehouse
{
	private Integer id = null;
	private Integer accountId = null;
	private String title = null;
	private String description = null;
	@JsonProperty("id")
	public Integer getId()
	{
		return id;
	}
	
	@JsonProperty("id")
	public void setId(Integer id)
	{
		this.id = id;
	}

	@JsonProperty("accountId")
	public Integer getAccountId()
	{
		return accountId;
	}
	
	@JsonProperty("accountId")
	public void setAccountId(Integer accountId)
	{
		this.accountId = accountId;
	}

	@JsonProperty("title")
	public String getTitle()
	{
		return title;
	}
	
	@JsonProperty("title")
	public void setTitle(String title)
	{
		this.title = title;
	}

	@JsonProperty("description")
	public String getDescription()
	{
		return description;
	}
	
	@JsonProperty("description")
	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Warehouse {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  accountId: ").append(accountId).append("\n");
		sb.append("  title: ").append(title).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

