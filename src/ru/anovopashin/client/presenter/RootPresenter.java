package ru.anovopashin.client.presenter;

import ru.anovopashin.client.Bus;
import ru.anovopashin.client.presenter.view_interface.IRootViewInterface;
import ru.anovopashin.client.service.PersistenceServiceAsync;
import ru.anovopashin.client.view.RootView;
import ru.anovopashin.shared.model.RootModel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * 
 * @author anovopashin
 * @version 1.0.0.0
 */
@Presenter(view = RootView.class)
public class RootPresenter extends BasePresenter<IRootViewInterface, Bus> {

	private PersistenceServiceAsync persistenceService = null;

	/**
	 * Start Application point
	 */
	public void onStart() {
		AsyncCallback<RootModel> callback = new AsyncCallback<RootModel>() {
			public void onFailure(Throwable caught) {
				String details = caught.getMessage();
				Window.alert("RPC to saveNode() failed.");
				GWT.log(details);

			}

			@Override
			public void onSuccess(RootModel result) {
				view.getMessage().setText(view.getMessage().getText() + "\n" + result.getId());
			}
		};

		RootModel root = new RootModel();
		root.setDescription("This is JDO");
		persistenceService.saveNode(root, callback);

		view.getMessage().setText(view.getMessage().getText() + "\nDONE!");

	}

	@InjectService
	public void setPersistenceService(PersistenceServiceAsync persistenceService) {
		this.persistenceService = persistenceService;
	}

}
