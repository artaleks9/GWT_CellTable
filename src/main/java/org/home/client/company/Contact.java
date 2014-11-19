package org.home.client.company;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by aleks on 29.07.14.
 */
public class Contact {

    public static final List<Contact> CONTACTS = Arrays.asList(
            new Contact("A111", "John", "1980/4/12", "1000"),
            new Contact("B333","Joe", "1983/2/22", "2000"),
            new Contact("C555","George", "1986/6/8" , "3000"));

    private String idn;
    private String wages;
    private String birthday;

    private String name;

    public Contact(){
        // TODO probably should be removed
    }

    public Contact(String idn, String name, String birthday, String wages) {
        this.idn = idn;
        this.name = name;
        this.birthday = birthday;
        this.wages = wages;
    }


    public String getIdn() {
        return idn;
    }

    public String getWages() {
        return wages;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
}
