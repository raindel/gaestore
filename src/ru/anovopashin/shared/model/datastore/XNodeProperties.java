package ru.anovopashin.shared.model.datastore;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public enum XNodeProperties {
	BASE("base"),
	PARENT_NODE("parentNode"),
	TYPE("type"),
	KIND("kind"),
	NAME("name"),
	DESCRIPTION("description"),
	SORT_CODE("sortCode"),
	OPERATOR_ENTITY("operatorEntity"),
	DATE_ENTRY("dateEntry"),
	OPERATOR_UPDATE("operatorUpdate"),
	UPDATE_ENTRY("updateEntry");

	private String property;

	private XNodeProperties(String property) {
		this.property = property;
	}

	public String getKind() {
		return property;
	}

	public void setKind(String kind) {
		this.property = kind;
	}

}
