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
import org.joda.time.*;
public class Version
{
	private String id = null;
	private String bagId = null;
	private String name = null;
	private DateTime createdAt = null;
	private String unitId = null;
	private String unitName = null;
	@JsonProperty("id")
	public String getId()
	{
		return id;
	}
	
	@JsonProperty("id")
	public void setId(String id)
	{
		this.id = id;
	}

	@JsonProperty("bagId")
	public String getBagId()
	{
		return bagId;
	}
	
	@JsonProperty("bagId")
	public void setBagId(String bagId)
	{
		this.bagId = bagId;
	}

	@JsonProperty("name")
	public String getName()
	{
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name)
	{
		this.name = name;
	}

	@JsonProperty("createdAt")
	public DateTime getCreatedAt()
	{
		return createdAt;
	}
	
	@JsonProperty("createdAt")
	public void setCreatedAt(DateTime createdAt)
	{
		this.createdAt = createdAt;
	}

	@JsonProperty("unitId")
	public String getUnitId()
	{
		return unitId;
	}
	
	@JsonProperty("unitId")
	public void setUnitId(String unitId)
	{
		this.unitId = unitId;
	}

	@JsonProperty("unitName")
	public String getUnitName()
	{
		return unitName;
	}
	
	@JsonProperty("unitName")
	public void setUnitName(String unitName)
	{
		this.unitName = unitName;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Version {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  bagId: ").append(bagId).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  unitId: ").append(unitId).append("\n");
		sb.append("  unitName: ").append(unitName).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

