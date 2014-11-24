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
import java.util.*;
public class Element
{
	private String id = null;
	private String name_de = null;
	private String type_de = null;
	private String type_en = null;
	private Boolean isDiagram = null;
	private List<String> occuresInDiagramNames = new ArrayList<String>();
	private List<String> occuresInDiagramIds = new ArrayList<String>();
	private DateTime createdAt = null;
	private String createdBy = null;
	private DateTime lastModifiedAt = null;
	private String lastModifiedBy = null;
	private DateTime checkInAt = null;
	private String checkInById = null;
	private String unitId = null;
	private String unitName = null;
	private String versionId = null;
	private String versionName = null;
	private String modelingToolName = null;
	private Integer changeStatus = null;
	private Boolean isNewestUnitVersion = null;
	private String mwhBagId = null;
	private String mwhElementId = null;
	private String mwhId = null;
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

	@JsonProperty("name_de")
	public String getName_de()
	{
		return name_de;
	}
	
	@JsonProperty("name_de")
	public void setName_de(String name_de)
	{
		this.name_de = name_de;
	}

	@JsonProperty("type_de")
	public String getType_de()
	{
		return type_de;
	}
	
	@JsonProperty("type_de")
	public void setType_de(String type_de)
	{
		this.type_de = type_de;
	}

	@JsonProperty("type_en")
	public String getType_en()
	{
		return type_en;
	}
	
	@JsonProperty("type_en")
	public void setType_en(String type_en)
	{
		this.type_en = type_en;
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

	@JsonProperty("occuresInDiagramNames")
	public List<String> getOccuresInDiagramNames()
	{
		return occuresInDiagramNames;
	}
	
	@JsonProperty("occuresInDiagramNames")
	public void setOccuresInDiagramNames(List<String> occuresInDiagramNames)
	{
		this.occuresInDiagramNames = occuresInDiagramNames;
	}

	@JsonProperty("occuresInDiagramIds")
	public List<String> getOccuresInDiagramIds()
	{
		return occuresInDiagramIds;
	}
	
	@JsonProperty("occuresInDiagramIds")
	public void setOccuresInDiagramIds(List<String> occuresInDiagramIds)
	{
		this.occuresInDiagramIds = occuresInDiagramIds;
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

	@JsonProperty("createdBy")
	public String getCreatedBy()
	{
		return createdBy;
	}
	
	@JsonProperty("createdBy")
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	@JsonProperty("lastModifiedAt")
	public DateTime getLastModifiedAt()
	{
		return lastModifiedAt;
	}
	
	@JsonProperty("lastModifiedAt")
	public void setLastModifiedAt(DateTime lastModifiedAt)
	{
		this.lastModifiedAt = lastModifiedAt;
	}

	@JsonProperty("lastModifiedBy")
	public String getLastModifiedBy()
	{
		return lastModifiedBy;
	}
	
	@JsonProperty("lastModifiedBy")
	public void setLastModifiedBy(String lastModifiedBy)
	{
		this.lastModifiedBy = lastModifiedBy;
	}

	@JsonProperty("checkInAt")
	public DateTime getCheckInAt()
	{
		return checkInAt;
	}
	
	@JsonProperty("checkInAt")
	public void setCheckInAt(DateTime checkInAt)
	{
		this.checkInAt = checkInAt;
	}

	@JsonProperty("checkInById")
	public String getCheckInById()
	{
		return checkInById;
	}
	
	@JsonProperty("checkInById")
	public void setCheckInById(String checkInById)
	{
		this.checkInById = checkInById;
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

	@JsonProperty("versionName")
	public String getVersionName()
	{
		return versionName;
	}
	
	@JsonProperty("versionName")
	public void setVersionName(String versionName)
	{
		this.versionName = versionName;
	}

	@JsonProperty("modelingToolName")
	public String getModelingToolName()
	{
		return modelingToolName;
	}
	
	@JsonProperty("modelingToolName")
	public void setModelingToolName(String modelingToolName)
	{
		this.modelingToolName = modelingToolName;
	}

	@JsonProperty("changeStatus")
	public Integer getChangeStatus()
	{
		return changeStatus;
	}
	
	@JsonProperty("changeStatus")
	public void setChangeStatus(Integer changeStatus)
	{
		this.changeStatus = changeStatus;
	}

	@JsonProperty("isNewestUnitVersion")
	public Boolean getIsNewestUnitVersion()
	{
		return isNewestUnitVersion;
	}
	
	@JsonProperty("isNewestUnitVersion")
	public void setIsNewestUnitVersion(Boolean isNewestUnitVersion)
	{
		this.isNewestUnitVersion = isNewestUnitVersion;
	}

	@JsonProperty("mwhBagId")
	public String getMwhBagId()
	{
		return mwhBagId;
	}
	
	@JsonProperty("mwhBagId")
	public void setMwhBagId(String mwhBagId)
	{
		this.mwhBagId = mwhBagId;
	}

	@JsonProperty("mwhElementId")
	public String getMwhElementId()
	{
		return mwhElementId;
	}
	
	@JsonProperty("mwhElementId")
	public void setMwhElementId(String mwhElementId)
	{
		this.mwhElementId = mwhElementId;
	}

	@JsonProperty("mwhId")
	public String getMwhId()
	{
		return mwhId;
	}
	
	@JsonProperty("mwhId")
	public void setMwhId(String mwhId)
	{
		this.mwhId = mwhId;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Element {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  name_de: ").append(name_de).append("\n");
		sb.append("  type_de: ").append(type_de).append("\n");
		sb.append("  type_en: ").append(type_en).append("\n");
		sb.append("  isDiagram: ").append(isDiagram).append("\n");
		sb.append("  occuresInDiagramNames: ").append(occuresInDiagramNames).append("\n");
		sb.append("  occuresInDiagramIds: ").append(occuresInDiagramIds).append("\n");
		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  createdBy: ").append(createdBy).append("\n");
		sb.append("  lastModifiedAt: ").append(lastModifiedAt).append("\n");
		sb.append("  lastModifiedBy: ").append(lastModifiedBy).append("\n");
		sb.append("  checkInAt: ").append(checkInAt).append("\n");
		sb.append("  checkInById: ").append(checkInById).append("\n");
		sb.append("  unitId: ").append(unitId).append("\n");
		sb.append("  unitName: ").append(unitName).append("\n");
		sb.append("  versionId: ").append(versionId).append("\n");
		sb.append("  versionName: ").append(versionName).append("\n");
		sb.append("  modelingToolName: ").append(modelingToolName).append("\n");
		sb.append("  changeStatus: ").append(changeStatus).append("\n");
		sb.append("  isNewestUnitVersion: ").append(isNewestUnitVersion).append("\n");
		sb.append("  mwhBagId: ").append(mwhBagId).append("\n");
		sb.append("  mwhElementId: ").append(mwhElementId).append("\n");
		sb.append("  mwhId: ").append(mwhId).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

