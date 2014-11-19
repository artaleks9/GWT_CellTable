package org.home.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Button;

/**
 *
 * Created by aleks on 25.07.14.
 */
public interface PersonnelWidgetResources extends ClientBundle {

    PersonnelWidgetResources impl = GWT.create(PersonnelWidgetResources.class);

    @Source("PersonnelWidget.css")
    MyCss style();

    @Source("SomePhoto.jpg")
    ImageResource imagePhoto();


    public interface MyCss extends CssResource {

        String nButton();

        String image();

    }
}
