package org.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import org.home.client.company.Contact;
import org.home.client.presenter.PersonnelPresenterImpl;
import org.home.client.presenter.Presenter;
import org.home.client.view.PersonnelView;
import org.home.client.view.PersonnelViewImpl;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyEntryPoint implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        Contact cont = new Contact();
        PersonnelView view = new PersonnelViewImpl();
        Presenter presenter = new PersonnelPresenterImpl(cont, view);
        presenter.go(RootLayoutPanel.get());
    }
}
