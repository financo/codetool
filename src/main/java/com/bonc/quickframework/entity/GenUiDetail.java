//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-03-25 15:47:27
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
 
public class GenUiDetail implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//columns START
	private java.lang.Long id;
	private java.lang.String name;
	private java.lang.Long uiId;
	private java.lang.Long uiTypeId;
	private java.lang.String script;
	//columns END

	public GenUiDetail(){
	}

	public GenUiDetail(
		java.lang.Long id
	){
		this.id = id;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setUiId(java.lang.Long value) {
		this.uiId = value;
	}
	
	public java.lang.Long getUiId() {
		return this.uiId;
	}
	public void setUiTypeId(java.lang.Long value) {
		this.uiTypeId = value;
	}
	
	public java.lang.Long getUiTypeId() {
		return this.uiTypeId;
	}
	public void setScript(java.lang.String value) {
		this.script = value;
	}
	
	public java.lang.String getScript() {
		return this.script;
	}
	@JsonIgnore
	private GenUi genUi;
	
	public void setGenUi(GenUi genUi){
		this.genUi = genUi;
	}
	
	public GenUi getGenUi() {
		return genUi;
	}

	public String toString() {
		return new ToStringBuilder(this)
			.append("Id",getId())
			.append("Name",getName())
			.append("UiId",getUiId())
			.append("UiTypeId",getUiTypeId())
			.append("Script",getScript())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getName())
			.append(getUiId())
			.append(getUiTypeId())
			.append(getScript())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GenUiDetail == false) return false;
		if(this == obj) return true;
		GenUiDetail other = (GenUiDetail)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.append(getName(),other.getName())
			.append(getUiId(),other.getUiId())
			.append(getUiTypeId(),other.getUiTypeId())
			.append(getScript(),other.getScript())
			.isEquals();
	}
}
