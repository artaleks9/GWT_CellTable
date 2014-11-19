package org.home.client.view;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import org.home.client.presenter.PersonnelPresenterImpl;

import java.util.List;

/**
 *
 * Created by aleks on 30.07.14.
 */
public interface PersonnelView extends IsWidget {

    public void setPresenter(PersonnelPresenterImpl presenter);

    public Widget asWidget();

    public void setList(List list);

}
