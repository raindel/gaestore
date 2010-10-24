package ru.anovopashin.server.model;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public interface Operations {
	Entity createEntity();

	Entity getEntitybyKey(Key key);

	Entity getEntitybyNameKind(String name, String kind);
}
