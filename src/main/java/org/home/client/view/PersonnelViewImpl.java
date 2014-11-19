package org.home.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.*;
import com.google.gwt.user.cellview.client.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import org.home.client.PersonnelWidgetResources;
import org.home.client.company.Contact;
import org.home.client.presenter.PersonnelPresenterImpl;
import java.util.List;
import static org.home.client.PersonnelWidgetResources.impl;

/**
 *
 * Created by Alex on 19.07.2014.
 */
public class PersonnelViewImpl extends Composite implements PersonnelView {

    interface PersonnelUiBinder extends UiBinder <Widget, PersonnelViewImpl> {
    }

    private static PersonnelUiBinder binder = GWT.create(PersonnelUiBinder.class);

    @UiField(provided = true)
    PersonnelWidgetResources res;

    @UiField(provided = true)
    CellTable cellTable;

    @UiField
    Button buttonGetList;

    @UiField
    Button buttonAdd;

    @UiField
    Button buttonRemove;

    @UiField
    Button buttonEdit;

    private PersonnelPresenterImpl presenter;

    public PersonnelViewImpl() {
        this.res = impl;
        res.style().ensureInjected();

        cellTable = createTable();

        initWidget(binder.createAndBindUi(this));
    }

    private CellTable createTable() {
        // Create a CellTable.
        CellTable<Contact> table = new CellTable<Contact>();
//        table.setKeyboardSelectionPolicy(HasKeyboardSelectionPolicy.KeyboardSelectionPolicy.ENABLED);

        // Add a text column to show the name.
        TextColumn<Contact> nameColumn = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact object) {
                return object.getName();
            }
        };
        table.addColumn(nameColumn, "Name");

        // Add a date column to show the birthday.
        TextColumn<Contact> dateColumn = new TextColumn<Contact>(){
            @Override
            public String getValue(Contact object) {
                return object.getBirthday();
            }
        };
        table.addColumn(dateColumn, "Birthday");

        // Add a text column to show the address.
        TextColumn<Contact> addressColumn = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact object) {
                return object.getWages();
            }
        };
        table.addColumn(addressColumn, "AvrSalary");

        TextColumn<Contact> idnColumn = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact object) {
                return object.getIdn();
            }
        };
        table.addColumn(idnColumn, "IDN");

        return table;
    }

    @Override
    public void setPresenter(PersonnelPresenterImpl presenter) {
        this.presenter = presenter;
    }

    public void setList(List list){
        cellTable.setRowData(list);
    }

    @UiHandler("buttonGetList")
    void doClickGet(ClickEvent event) {
        if (presenter != null) {
            presenter.onGetClicked();
        }

        Window.alert("That OK! Push button Get List! ");
    }

    @UiHandler("buttonAdd")
    void doClickAdd(ClickEvent event) {
        Window.alert("That OK! Push button Add! ");
    }

    @UiHandler("buttonRemove")
    void doClickRemove(ClickEvent event) {
        Window.alert("That OK! Push button Remove! ");
    }

    @UiHandler("buttonEdit")
    void doClickEdit(ClickEvent event) {
        Window.alert("That OK! Push button Add! ");
    }
}