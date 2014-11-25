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
public class DiagramOccurrence
{
	private String id = null;
	private String elementId = null;
	private String versionId = null;
	private String name = null;
	private String description = null;
	private String type = null;
	private Boolean isAttachment = null;
	private Boolean isDiagram = null;
	private Boolean hasAttachmentPreview = null;
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

	@JsonProperty("versionId")
	public String getVersionId()
	{
		return versionId;
	}
	
	@JsonProperty("versionId")
	public void setVersionId(String versionId)
	{
		this.versionId = versionId;
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

	@JsonProperty("isAttachment")
	public Boolean getIsAttachment()
	{
		return isAttachment;
	}
	
	@JsonProperty("isAttachment")
	public void setIsAttachment(Boolean isAttachment)
	{
		this.isAttachment = isAttachment;
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

	@JsonProperty("hasAttachmentPreview")
	public Boolean getHasAttachmentPreview()
	{
		return hasAttachmentPreview;
	}
	
	@JsonProperty("hasAttachmentPreview")
	public void setHasAttachmentPreview(Boolean hasAttachmentPreview)
	{
		this.hasAttachmentPreview = hasAttachmentPreview;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class DiagramOccurrence {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  elementId: ").append(elementId).append("\n");
		sb.append("  versionId: ").append(versionId).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  type: ").append(type).append("\n");
		sb.append("  isAttachment: ").append(isAttachment).append("\n");
		sb.append("  isDiagram: ").append(isDiagram).append("\n");
		sb.append("  hasAttachmentPreview: ").append(hasAttachmentPreview).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

