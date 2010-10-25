package ru.anovopashin.server;

import java.util.Arrays;
import java.util.List;

import javax.jdo.PersistenceManager;

import ru.anovopashin.client.service.PersistenceService;
import ru.anovopashin.server.datastore.PMF;
import ru.anovopashin.server.model.Root;
import ru.anovopashin.shared.model.RootModel;
import ru.anovopashin.shared.model.XNodeModel;

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

	public RootModel saveNode(RootModel root) {
		PersistenceManager manager = PMF.get().getPersistenceManager();
		Root rootJDO = getRootJDO(root);
		try {
			manager.makePersistent(rootJDO);
			root.setId(KeyFactory.keyToString(rootJDO.getId()));
		} finally {
			manager.close();
		}
		return root;
	}

	private Root getRootJDO(RootModel model) {
		Key key = KeyFactory.createKey(Root.class.getSimpleName(), Root.class.getSimpleName());
		Root rootJDO = new Root(key, key, key, null, model.getName(), model.getDescription(), model.getSortCode(),
				null, model.getDateEntry(), null, model.getUpdateEntry());
		return rootJDO;
	}

	public List<XNodeModel> saveNodes(XNodeModel... models) {

		return Arrays.asList(models);
	}
}
