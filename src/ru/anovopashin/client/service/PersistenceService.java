package ru.anovopashin.client.service;

import ru.anovopashin.shared.model.RootModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
@RemoteServiceRelativePath("users.rpc")
public interface PersistenceService extends RemoteService {

	public RootModel saveNode(RootModel root);
}
