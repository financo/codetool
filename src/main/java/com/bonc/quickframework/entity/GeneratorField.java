//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-01-28 15:21:45
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.*;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"}) 
public class GeneratorField implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//columns START
	private java.lang.Long id;
	private java.lang.String code;
	private java.lang.String name;
	private java.lang.Long dataTypeId;
	private java.lang.Long length;
	private java.lang.Long pk;
	private java.lang.Long isIncrement;
	private java.lang.Long notNull;
	private java.lang.String defaultValue;
	private java.lang.Long entityId;
	private java.lang.String fkTypeColumn;
	private java.lang.Long isUnique;
	private java.lang.Long mainFk;
	private java.lang.Long showColumnId;
	private java.lang.Long isSearch;
	private java.lang.Long entityTypeId;
	private java.lang.Long filterFieldId;//过滤字段Id
	private java.lang.Long filterTypeId;//过滤字段的类型  的 字段Id
	private java.lang.Long sequence;
	private java.lang.Long uiId;
	private java.lang.String validPattern;
	private java.lang.String validMsg;
	
	
	//columns END

	public GeneratorField(){
	}

	public GeneratorField(
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
	public void setDataTypeId(java.lang.Long value) {
		this.dataTypeId = value;
	}
	
	public java.lang.Long getDataTypeId() {
		return this.dataTypeId;
	}
	public void setLength(java.lang.Long value) {
		this.length = value;
	}
	
	public java.lang.Long getLength() {
		return this.length;
	}
	public void setPk(java.lang.Long value) {
		this.pk = value;
	}
	
	public java.lang.Long getPk() {
		return this.pk;
	}
	public void setIsIncrement(java.lang.Long value) {
		this.isIncrement = value;
	}
	
	public java.lang.Long getIsIncrement() {
		return this.isIncrement;
	}
	public void setNotNull(java.lang.Long value) {
		this.notNull = value;
	}
	
	public java.lang.Long getNotNull() {
		return this.notNull;
	}
	public void setDefaultValue(java.lang.String value) {
		this.defaultValue = value;
	}
	
	public java.lang.String getDefaultValue() {
		return this.defaultValue;
	}
	public void setEntityId(java.lang.Long value) {
		this.entityId = value;
	}
	
	public java.lang.Long getEntityId() {
		return this.entityId;
	}
	public void setFkTypeColumn(java.lang.String value) {
		this.fkTypeColumn = value;
	}
	
	public java.lang.String getFkTypeColumn() {
		return this.fkTypeColumn;
	}
	public void setIsUnique(java.lang.Long value) {
		this.isUnique = value;
	}
	
	public java.lang.Long getIsUnique() {
		return this.isUnique;
	}
	
	public java.lang.Long getMainFk() {
		return mainFk;
	}

	public void setMainFk(java.lang.Long mainFk) {
		this.mainFk = mainFk;
	}

	public java.lang.Long getShowColumnId() {
		return showColumnId;
	}

	public void setShowColumnId(java.lang.Long showColumnId) {
		this.showColumnId = showColumnId;
	}
	
	public java.lang.Long getIsSearch() {
		return isSearch;
	}

	public void setIsSearch(java.lang.Long isSearch) {
		this.isSearch = isSearch;
	}



	public java.lang.Long getEntityTypeId() {
		return entityTypeId;
	}

	public void setEntityTypeId(java.lang.Long entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public java.lang.Long getFilterFieldId() {
		return filterFieldId;
	}

	public void setFilterFieldId(java.lang.Long filterFieldId) {
		this.filterFieldId = filterFieldId;
	}
	
	public java.lang.Long getFilterTypeId() {
		return filterTypeId;
	}

	public void setFilterTypeId(java.lang.Long filterTypeId) {
		this.filterTypeId = filterTypeId;
	}

	public java.lang.Long getSequence() {
		return sequence;
	}

	public void setSequence(java.lang.Long sequence) {
		this.sequence = sequence;
	}


	public java.lang.Long getUiId() {
		return uiId;
	}

	public void setUiId(java.lang.Long uiId) {
		this.uiId = uiId;
	}

	public java.lang.String getValidPattern() {
		return validPattern;
	}

	public void setValidPattern(java.lang.String validPattern) {
		this.validPattern = validPattern;
	}

	public java.lang.String getValidMsg() {
		return validMsg;
	}

	public void setValidMsg(java.lang.String validMsg) {
		this.validMsg = validMsg;
	}

	@JsonIgnore
	private GeneratorUi ui;
	
	public GeneratorUi getUi() {
		return ui;
	}

	public void setUi(GeneratorUi ui) {
		this.ui = ui;
	}

	@JsonIgnore
	private GeneratorField showColumn;
	
	public GeneratorField getShowColumn() {
		return showColumn;
	}

	public void setShowColumn(GeneratorField showColumn) {
		this.showColumn = showColumn;
	}

	@JsonIgnore
	private GeneratorField filterType;

	public GeneratorField getFilterType() {
		return filterType;
	}

	public void setFilterType(GeneratorField filterType) {
		this.filterType = filterType;
	}

	@JsonIgnore
	private GeneratorField filterField;

	public GeneratorField getFilterField() {
		return filterField;
	}

	public void setFilterField(GeneratorField filterField) {
		this.filterField = filterField;
	}

	@JsonIgnore
	private GeneratorEntity generatorEntity;
	
	public void setGeneratorEntity(GeneratorEntity generatorEntity){
		this.generatorEntity = generatorEntity;
	}
	public GeneratorEntity getGeneratorEntity() {
		return generatorEntity;
	}
	
	@JsonIgnore
	private GeneratorDataType dataType;
	public GeneratorDataType getDataType() {
		return dataType;
	}
	public void setDataType(GeneratorDataType dataType) {
		this.dataType = dataType;
	}

	@JsonIgnore
	private GeneratorEntity entityType;

	public GeneratorEntity getEntityType() {
		return entityType;
	}
	public void setEntityType(GeneratorEntity entityType) {
		this.entityType = entityType;
	}

	public String toString() {
		return new ToStringBuilder(this)
			.append("Id",getId())
			.append("Code",getCode())
			.append("Name",getName())
			.append("DataTypeId",getDataTypeId())
			.append("Length",getLength())
			.append("Pk",getPk())
			.append("IsIncrement",getIsIncrement())
			.append("NotNull",getNotNull())
			.append("DefaultValue",getDefaultValue())
			.append("EntityId",getEntityId())
			.append("FkTypeColumn",getFkTypeColumn())
			.append("IsUnique",getIsUnique())
			.append("Inverse",getMainFk())
			.append("ShowColumnId",getShowColumnId())
			.append("IsSearch",getIsSearch())
			.append("EntityTypeId",getEntityTypeId())
			.append("FilterFieldId",getFilterFieldId())
			.append("FilterTypeId",getFilterTypeId())
			.append("Sequence",getSequence())
			.append("UiId",getUiId())
			.append("ValidPattern",getValidPattern())
			.append("ValidMsg",getValidMsg())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getCode())
			.append(getName())
			.append(getDataTypeId())
			.append(getLength())
			.append(getPk())
			.append(getIsIncrement())
			.append(getNotNull())
			.append(getDefaultValue())
			.append(getEntityId())
			.append(getFkTypeColumn())
			.append(getIsUnique())
			.append(getMainFk())
			.append(getShowColumnId())
			.append(getIsSearch())
			.append(getEntityTypeId())
			.append(getFilterFieldId())
			.append(getFilterTypeId())
			.append(getSequence())
			.append(getUiId())
			.append(getValidPattern())
			.append(getValidMsg())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GeneratorField == false) return false;
		if(this == obj) return true;
		GeneratorField other = (GeneratorField)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.append(getCode(),other.getCode())
			.append(getName(),other.getName())
			.append(getDataTypeId(),other.getDataTypeId())
			.append(getLength(),other.getLength())
			.append(getPk(),other.getPk())
			.append(getIsIncrement(),other.getIsIncrement())
			.append(getNotNull(),other.getNotNull())
			.append(getDefaultValue(),other.getDefaultValue())
			.append(getEntityId(),other.getEntityId())
			.append(getFkTypeColumn(),other.getFkTypeColumn())
			.append(getIsUnique(),other.getIsUnique())
			.append(getMainFk(),other.getMainFk())
			.append(getShowColumnId(),other.getShowColumnId())
			.append(getIsSearch(),other.getIsSearch())
			.append(getEntityTypeId(),other.getEntityTypeId())
			.append(getFilterFieldId(),other.getFilterFieldId())
			.append(getFilterTypeId(),other.getFilterTypeId())
			.append(getSequence(),other.getSequence())
			.append(getUiId(),other.getUiId())
			.append(getValidPattern(),other.getValidPattern())
			.append(getValidMsg(),other.getValidMsg())
			.isEquals();
	}
}

