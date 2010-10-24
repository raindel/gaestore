package ru.anovopashin.server.model;

import java.io.Serializable;
import java.util.Date;

import ru.anovopashin.shared.model.XNodeModel;
import ru.anovopashin.shared.model.datastore.XNodeProperties;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public class XNode implements Serializable {

	private static final long serialVersionUID = -2165248894809886215L;

	private Key id;
	private Key parentNode;
	private Key base;
	private Key type;
	private String kind;
	private String name;
	private String description;
	private Long sortCode;
	private Key operatorEntity;
	private Date dateEntry;
	private Key operatorUpdate;
	private Date updateEntry;

	public XNode(XNodeModel nodeModel) {
		if (nodeModel.getId() != null) {
			this.id = KeyFactory.stringToKey(nodeModel.getId());
		}

		if (nodeModel.getParentNode() != null) {
			this.parentNode = KeyFactory.stringToKey(nodeModel.getParentNode());
		}

		if (nodeModel.getBase() != null) {
			this.base = KeyFactory.stringToKey(nodeModel.getBase());
		}

		if (nodeModel.getType() != null) {
			this.type = KeyFactory.stringToKey(nodeModel.getType());
		}
		this.kind = nodeModel.getKind();
		this.name = nodeModel.getName();
		this.description = nodeModel.getDescription();
		this.sortCode = nodeModel.getSortCode();
		this.dateEntry = nodeModel.getDateEntry();

		if (nodeModel.getOperatorEntity() != null) {
			this.operatorEntity = KeyFactory.stringToKey(nodeModel.getOperatorEntity());
		}

		this.updateEntry = nodeModel.getUpdateEntry();

		if (nodeModel.getOperatorUpdate() != null) {
			this.operatorUpdate = KeyFactory.stringToKey(nodeModel.getOperatorUpdate());
		}

	}

	/**
	 * Create persistent GAE Datastore Entity
	 * 
	 * @return Entity
	 */
	public Entity getEntity() {
		if (id == null) {
			if (parentNode == null) {
				id = KeyFactory.createKey(parentNode, kind, name);
			} else {
				id = KeyFactory.createKey(kind, name);
			}
		}

		Entity entity = new Entity(id);
		entity.setProperty(XNodeProperties.BASE.name(), (base != null) ? base : id);
		entity.setProperty(XNodeProperties.PARENT_NODE.name(), (parentNode != null) ? parentNode : id);
		entity.setProperty(XNodeProperties.TYPE.name(), (type != null) ? type : id);
		entity.setProperty(XNodeProperties.DESCRIPTION.name(), description);
		entity.setProperty(XNodeProperties.SORT_CODE.name(), sortCode);
		entity.setProperty(XNodeProperties.OPERATOR_ENTITY.name(), operatorEntity);
		entity.setProperty(XNodeProperties.DATE_ENTRY.name(), dateEntry);
		entity.setProperty(XNodeProperties.OPERATOR_UPDATE.name(), operatorUpdate);
		entity.setProperty(XNodeProperties.UPDATE_ENTRY.name(), updateEntry);
		return entity;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public void setParentNode(Key parentNode) {
		this.parentNode = parentNode;
	}

	public void setBase(Key base) {
		this.base = base;
	}

	public void setType(Key type) {
		this.type = type;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSortCode(long sortCode) {
		this.sortCode = sortCode;
	}

	public void setOperatorEntity(Key operatorEntity) {
		this.operatorEntity = operatorEntity;
	}

	public void setDateEntry(Date dateEntry) {
		this.dateEntry = dateEntry;
	}

	public void setOperatorUpdate(Key operatorUpdate) {
		this.operatorUpdate = operatorUpdate;
	}

	public void setUpdateEntry(Date updateEntry) {
		this.updateEntry = updateEntry;
	}

}