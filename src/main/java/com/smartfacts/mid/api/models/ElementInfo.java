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
import com.smartfacts.mid.api.models.ElementProperty;
import com.smartfacts.mid.api.models.Version;
public class ElementInfo
{
	private String id = null;
	private String elementId = null;
	private String name = null;
	private String type = null;
	private Boolean isDiagram = null;
	private List<ElementProperty> properties = new ArrayList<ElementProperty>();
	private List<Version> versions = new ArrayList<Version>();
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

	@JsonProperty("elementId")
	public String getElementId()
	{
		return elementId;
	}
	
	@JsonProperty("elementId")
	public void setElementId(String elementId)
	{
		this.elementId = elementId;
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

	@JsonProperty("type")
	public String getType()
	{
		return type;
	}
	
	@JsonProperty("type")
	public void setType(String type)
	{
		this.type = type;
	}

	@JsonProperty("isDiagram")
	public Boolean getIsDiagram()
	{
		return isDiagram;
	}
	
	@JsonProperty("isDiagram")
	public void setIsDiagram(Boolean isDiagram)
	{
		this.isDiagram = isDiagram;
	}

	@JsonProperty("properties")
	public List<ElementProperty> getProperties()
	{
		return properties;
	}
	
	@JsonProperty("properties")
	public void setProperties(List<ElementProperty> properties)
	{
		this.properties = properties;
	}

	@JsonProperty("versions")
	public List<Version> getVersions()
	{
		return versions;
	}
	
	@JsonProperty("versions")
	public void setVersions(List<Version> versions)
	{
		this.versions = versions;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class ElementInfo {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  elementId: ").append(elementId).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  type: ").append(type).append("\n");
		sb.append("  isDiagram: ").append(isDiagram).append("\n");
		sb.append("  properties: ").append(properties).append("\n");
		sb.append("  versions: ").append(versions).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

