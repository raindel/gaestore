package ru.anovopashin.shared.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public class XNodeModel implements Serializable {
	private static final long serialVersionUID = -3413514051364720226L;

	private String id;
	private String parentNode;
	private String base;
	private String type;
	private String kind;
	private String name;
	private String description;
	private long sortCode;
	private String operatorEntity;
	private Date dateEntry;
	private String operatorUpdate;
	private Date updateEntry;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentNode() {
		return parentNode;
	}

	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getSortCode() {
		return sortCode;
	}

	public void setSortCode(long sortCode) {
		if (sortCode == 0) {
			sortCode = 1;
		}
		this.sortCode = sortCode;
	}

	public String getOperatorEntity() {
		return operatorEntity;
	}

	public void setOperatorEntity(String operatorEntity) {
		this.operatorEntity = operatorEntity;
	}

	public Date getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(Date dateEntry) {
		if (dateEntry == null) {
			dateEntry = new Date();
		}

		this.dateEntry = dateEntry;
	}

	public String getOperatorUpdate() {
		return operatorUpdate;
	}

	public void setOperatorUpdate(String operatorUpdate) {
		this.operatorUpdate = operatorUpdate;
	}

	public Date getUpdateEntry() {
		return updateEntry;
	}

	public void setUpdateEntry(Date updateEntry) {
		if (updateEntry == null) {
			updateEntry = new Date();
		}

		this.updateEntry = updateEntry;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "XNodeModel [id=" + id + ", parentNode=" + parentNode + ", base=" + base + ", type=" + type + ", kind="
				+ kind + ", name=" + name + ", description=" + description + ", sortCode=" + sortCode
				+ ", operatorEntity=" + operatorEntity + ", dateEntry=" + dateEntry + ", operatorUpdate="
				+ operatorUpdate + ", updateEntry=" + updateEntry + "]";
	}

}
