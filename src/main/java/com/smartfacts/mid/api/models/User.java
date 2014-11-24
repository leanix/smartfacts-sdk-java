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
public class User
{
	private Integer id = null;
	private String scimId = null;
	private String firstName = null;
	private String lastName = null;
	private String defaultMwhId = null;
	private String company = null;
	private String position = null;
	private String gender = null;
	private String phone = null;
	private String mobile = null;
	private String email = null;
	private String avatarUrl = null;
	private String preferredLanguage = null;
	private Long dateCreated = null;
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

	@JsonProperty("scimId")
	public String getScimId()
	{
		return scimId;
	}
	
	@JsonProperty("scimId")
	public void setScimId(String scimId)
	{
		this.scimId = scimId;
	}

	@JsonProperty("firstName")
	public String getFirstName()
	{
		return firstName;
	}
	
	@JsonProperty("firstName")
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName()
	{
		return lastName;
	}
	
	@JsonProperty("lastName")
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@JsonProperty("defaultMwhId")
	public String getDefaultMwhId()
	{
		return defaultMwhId;
	}
	
	@JsonProperty("defaultMwhId")
	public void setDefaultMwhId(String defaultMwhId)
	{
		this.defaultMwhId = defaultMwhId;
	}

	@JsonProperty("company")
	public String getCompany()
	{
		return company;
	}
	
	@JsonProperty("company")
	public void setCompany(String company)
	{
		this.company = company;
	}

	@JsonProperty("position")
	public String getPosition()
	{
		return position;
	}
	
	@JsonProperty("position")
	public void setPosition(String position)
	{
		this.position = position;
	}

	@JsonProperty("gender")
	public String getGender()
	{
		return gender;
	}
	
	@JsonProperty("gender")
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	@JsonProperty("phone")
	public String getPhone()
	{
		return phone;
	}
	
	@JsonProperty("phone")
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	@JsonProperty("mobile")
	public String getMobile()
	{
		return mobile;
	}
	
	@JsonProperty("mobile")
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	@JsonProperty("email")
	public String getEmail()
	{
		return email;
	}
	
	@JsonProperty("email")
	public void setEmail(String email)
	{
		this.email = email;
	}

	@JsonProperty("avatarUrl")
	public String getAvatarUrl()
	{
		return avatarUrl;
	}
	
	@JsonProperty("avatarUrl")
	public void setAvatarUrl(String avatarUrl)
	{
		this.avatarUrl = avatarUrl;
	}

	@JsonProperty("preferredLanguage")
	public String getPreferredLanguage()
	{
		return preferredLanguage;
	}
	
	@JsonProperty("preferredLanguage")
	public void setPreferredLanguage(String preferredLanguage)
	{
		this.preferredLanguage = preferredLanguage;
	}

	@JsonProperty("dateCreated")
	public Long getDateCreated()
	{
		return dateCreated;
	}
	
	@JsonProperty("dateCreated")
	public void setDateCreated(Long dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  scimId: ").append(scimId).append("\n");
		sb.append("  firstName: ").append(firstName).append("\n");
		sb.append("  lastName: ").append(lastName).append("\n");
		sb.append("  defaultMwhId: ").append(defaultMwhId).append("\n");
		sb.append("  company: ").append(company).append("\n");
		sb.append("  position: ").append(position).append("\n");
		sb.append("  gender: ").append(gender).append("\n");
		sb.append("  phone: ").append(phone).append("\n");
		sb.append("  mobile: ").append(mobile).append("\n");
		sb.append("  email: ").append(email).append("\n");
		sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
		sb.append("  preferredLanguage: ").append(preferredLanguage).append("\n");
		sb.append("  dateCreated: ").append(dateCreated).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

