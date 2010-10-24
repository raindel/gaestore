package ru.anovopashin.shared.model.datastore;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public enum RegisteredSystemArtifacs {
	ROOT("INSTANCE"),
	LISTS("INSTANCE"),
	NODE_TYPES("INSTANCE"),
	DOUBLE("INSTANCE"),
	INSTANCE("INSTANCE"),
	ACCESS_PERMISSIONS("INSTANCE"),
	FUCTIONAL_SYSTEM_MODULES("INSTANCE"),
	OPERATOR_LIST("INSTANCE"),
	ADMIN("INSTANCE"),
	BUDGET("INSTANCE"),
	PERIODS("INSTANCE");

	private String kind;

	private RegisteredSystemArtifacs(String property) {
		this.kind = property;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
