//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-03-25 15:47:25
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
 
public class GenTemplate implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//columns START
	private java.lang.Long id;
	private java.lang.String code;
	private java.lang.String name;
	private java.lang.Long uiTypeId;
	private java.lang.String tmpPath;
	//columns END

	public GenTemplate(){
	}

	public GenTemplate(
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
	public void setCode(java.lang.String value) {
		this.code = value;
	}
	
	public java.lang.String getCode() {
		return this.code;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setUiTypeId(java.lang.Long value) {
		this.uiTypeId = value;
	}
	
	public java.lang.Long getUiTypeId() {
		return this.uiTypeId;
	}
	public void setTmpPath(java.lang.String value) {
		this.tmpPath = value;
	}
	
	public java.lang.String getTmpPath() {
		return this.tmpPath;
	}

	public String toString() {
		return new ToStringBuilder(this)
			.append("Id",getId())
			.append("Code",getCode())
			.append("Name",getName())
			.append("UiTypeId",getUiTypeId())
			.append("TmpPath",getTmpPath())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getCode())
			.append(getName())
			.append(getUiTypeId())
			.append(getTmpPath())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GenTemplate == false) return false;
		if(this == obj) return true;
		GenTemplate other = (GenTemplate)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.append(getCode(),other.getCode())
			.append(getName(),other.getName())
			.append(getUiTypeId(),other.getUiTypeId())
			.append(getTmpPath(),other.getTmpPath())
			.isEquals();
	}
}

