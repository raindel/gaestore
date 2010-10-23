package ru.anovopashin.client.presenter;

import ru.anovopashin.client.Bus;
import ru.anovopashin.client.presenter.view_interface.IRootViewInterface;
import ru.anovopashin.client.view.RootView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = RootView.class)
public class RootPresenter extends BasePresenter<IRootViewInterface, Bus> {
	
	public void onStart() {
		view.getMessage().setText( "Hello event" );
	}
	
}
