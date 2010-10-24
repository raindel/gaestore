package ru.anovopashin.shared.model;

import java.util.Date;

import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;
import com.googlecode.objectify.annotation.Parent;

public class XNode {

	@Id
	Key id;
	@Parent
	Key parentNode;
	Key base;
	Key type;
	String name;
	String description;
	long sortCode;
	Key operatorEntity;
	Date dateEntry;
	Key operatorUpdate;
	Date updateEntry;
}
