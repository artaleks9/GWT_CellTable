package org.home.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;
import org.home.client.company.Contact;
import org.home.client.view.PersonnelView;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by aleks on 30.07.14.
 */
public class PersonnelPresenterImpl implements PersonnelPresenter {

    private static final List<Contact> CONTACTS = Arrays.asList(
            new Contact("A111", "John", "1980/4/12", "1000"),
            new Contact("B333", "Joe", "1983/2/22", "2000"),
            new Contact("C555", "George", "1986/6/8", "3000"));

    private Contact contact;
    private  PersonnelView view;

    public PersonnelPresenterImpl(Contact contact, PersonnelView view){
        this.contact = contact;
        this.view = view;

        bind();
    }

    @Override
    public void bind(){
        view.setPresenter(this);
    }

    @Override
    public void go(HasWidgets widgets){
        widgets.add(view.asWidget());
    }

    @Override
    public void onGetClicked() {
        view.setList(CONTACTS);
    }

    @Override
    public void doClickAdd() {

    }

    @Override
    public void doClickRemove() {

    }

    @Override
    public void doClickEdit() {

    }
}
