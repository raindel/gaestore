package ru.anovopashin.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;


import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Root extends XNode implements Serializable {

	private static final long serialVersionUID = -4501386191606638771L;

	public Root(Key id, Key parentNode, Key base, Key type, String name, String description,
			Long sortCode, Key operatorEntity, Date dateEntry, Key operatorUpdate, Date updateEntry) {
		super(id, parentNode, base, type, name, description, sortCode, operatorEntity, dateEntry, operatorUpdate,
				updateEntry);
	}

}
