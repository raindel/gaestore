package ru.anovopashin.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

/**
 * 
 * @author anovopashin
 * 
 * @version 1.0.0.0
 */
@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class XNode implements Serializable {

	private static final long serialVersionUID = -2165248894809886215L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private Key parentNode;
	@Persistent
	private Key base;
	@Persistent
	private Key type;
	@Persistent
	private String name;
	@Persistent
	private String description;
	@Persistent
	private Long sortCode;
	@Persistent
	private Key operatorEntity;
	@Persistent
	private Date dateEntry;
	@Persistent
	private Key operatorUpdate;
	@Persistent
	private Date updateEntry;

	public XNode(Key id, Key parentNode, Key base, Key type, String name, String description, Long sortCode,
			Key operatorEntity, Date dateEntry, Key operatorUpdate, Date updateEntry) {
		super();
		this.id = id;
		this.parentNode = parentNode;
		this.base = base;
		this.type = type;
		this.name = name;
		this.description = description;
		this.sortCode = sortCode;
		this.operatorEntity = operatorEntity;
		this.dateEntry = dateEntry;
		this.operatorUpdate = operatorUpdate;
		this.updateEntry = updateEntry;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public Key getParentNode() {
		return parentNode;
	}

	public void setParentNode(Key parentNode) {
		this.parentNode = parentNode;
	}

	public Key getBase() {
		return base;
	}

	public void setBase(Key base) {
		this.base = base;
	}

	public Key getType() {
		return type;
	}

	public void setType(Key type) {
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

	public Long getSortCode() {
		return sortCode;
	}

	public void setSortCode(Long sortCode) {
		this.sortCode = sortCode;
	}

	public Key getOperatorEntity() {
		return operatorEntity;
	}

	public void setOperatorEntity(Key operatorEntity) {
		this.operatorEntity = operatorEntity;
	}

	public Date getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(Date dateEntry) {
		this.dateEntry = dateEntry;
	}

	public Key getOperatorUpdate() {
		return operatorUpdate;
	}

	public void setOperatorUpdate(Key operatorUpdate) {
		this.operatorUpdate = operatorUpdate;
	}

	public Date getUpdateEntry() {
		return updateEntry;
	}

	public void setUpdateEntry(Date updateEntry) {
		this.updateEntry = updateEntry;
	}

	@Override
	public String toString() {
		return "XNode [id=" + id + ", parentNode=" + parentNode + ", base=" + base + ", type=" + type + ", name="
				+ name + ", description=" + description + ", sortCode=" + sortCode + ", operatorEntity="
				+ operatorEntity + ", dateEntry=" + dateEntry + ", operatorUpdate=" + operatorUpdate + ", updateEntry="
				+ updateEntry + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + ((dateEntry == null) ? 0 : dateEntry.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((operatorEntity == null) ? 0 : operatorEntity.hashCode());
		result = prime * result + ((operatorUpdate == null) ? 0 : operatorUpdate.hashCode());
		result = prime * result + ((parentNode == null) ? 0 : parentNode.hashCode());
		result = prime * result + ((sortCode == null) ? 0 : sortCode.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((updateEntry == null) ? 0 : updateEntry.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		XNode other = (XNode) obj;
		if (base == null) {
			if (other.base != null) return false;
		} else if (!base.equals(other.base)) return false;
		if (dateEntry == null) {
			if (other.dateEntry != null) return false;
		} else if (!dateEntry.equals(other.dateEntry)) return false;
		if (description == null) {
			if (other.description != null) return false;
		} else if (!description.equals(other.description)) return false;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		if (operatorEntity == null) {
			if (other.operatorEntity != null) return false;
		} else if (!operatorEntity.equals(other.operatorEntity)) return false;
		if (operatorUpdate == null) {
			if (other.operatorUpdate != null) return false;
		} else if (!operatorUpdate.equals(other.operatorUpdate)) return false;
		if (parentNode == null) {
			if (other.parentNode != null) return false;
		} else if (!parentNode.equals(other.parentNode)) return false;
		if (sortCode == null) {
			if (other.sortCode != null) return false;
		} else if (!sortCode.equals(other.sortCode)) return false;
		if (type == null) {
			if (other.type != null) return false;
		} else if (!type.equals(other.type)) return false;
		if (updateEntry == null) {
			if (other.updateEntry != null) return false;
		} else if (!updateEntry.equals(other.updateEntry)) return false;
		return true;
	}

}