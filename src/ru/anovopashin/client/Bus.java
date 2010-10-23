package ru.anovopashin.client;

import ru.anovopashin.client.presenter.RootPresenter;
import ru.anovopashin.client.view.RootView;

import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;

//start view is the view that will be automatically added to the RootPanel/RootLayoutPanel
@Events(startView = RootView.class)
public interface Bus extends EventBus {
	// framework will automatically call onStart method of
	// RootPresenter instance
	// when the event start is fired

	@Start
	@Event(handlers = RootPresenter.class)
	public void start();
}
