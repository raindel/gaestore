package ru.anovopashin.server;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ru.anovopashin.client.service.PersistenceService;
import ru.anovopashin.server.model.XNode;
import ru.anovopashin.shared.model.XNodeModel;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public class PersistenceServiceImpl extends RemoteServiceServlet implements PersistenceService {

	private static final long serialVersionUID = 5383572699097970490L;

	public XNodeModel saveNode(XNodeModel model) {
		DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();

		Entity entity = new XNode(model).getEntity();
		Key key = datastoreService.put(entity);
		model.setId(KeyFactory.keyToString(key));
		return model;

	}

	public List<XNodeModel> saveNodes(XNodeModel... models) {
		DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();

		List<Entity> entityList = new ArrayList<Entity>();

		for (XNodeModel model : models) {
			Entity entity = new XNode(model).getEntity();
			entityList.add(entity);
		}

		List<Key> keyList = datastoreService.put(entityList);

		for (int i = 0; i < keyList.size(); i++) {
			models[i].setId(KeyFactory.keyToString(keyList.get(i)));
		}

		return Arrays.asList(models);

	}

}
