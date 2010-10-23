package ru.anovopashin.client.presenter.view_interface;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public interface IRootViewInterface {
	Widget getViewWidget();
	
	HasText getMessage();
}
