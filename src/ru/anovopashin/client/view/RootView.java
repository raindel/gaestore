package ru.anovopashin.client.view;

import ru.anovopashin.client.presenter.view_interface.IRootViewInterface;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
public class RootView extends Composite implements IRootViewInterface {

	private Label message = new Label();

	public RootView() {
		VerticalPanel mainPanel = new VerticalPanel();
		message.setStyleName("message");
		mainPanel.add(message);
		initWidget(mainPanel);
	}

	public HasText getMessage() {
		return message;
	}

	public Widget getViewWidget() {
		return this;
	}
}
