package ru.anovopashin.client.service;

import ru.anovopashin.shared.model.XNodeModel;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public interface PersistenceServiceAsync {
	public void saveNode(XNodeModel model, AsyncCallback<XNodeModel> callback);

}
