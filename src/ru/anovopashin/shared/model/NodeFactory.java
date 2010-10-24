package ru.anovopashin.shared.model;

import java.io.Serializable;

public class NodeFactory implements Serializable {
	private static final long serialVersionUID = 7063213653717069088L;

	public static XNodeModel getRootNode() {
		XNodeModel model = new XNodeModel();
		model.setKind("Root");
		model.setName("Root");
		model.setDescription("This is Root");
		return model;
	}

	public static XNodeModel getInstanceNode() {
		return new XNodeModel();
	}
}
