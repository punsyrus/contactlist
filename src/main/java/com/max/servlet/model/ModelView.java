package com.max.servlet.model;
import java.util.*;
public class ModelView {
    public List getContacts() {
        List contacts = new ArrayList();
        contacts.add("one"); //test list
        contacts.add("two");
        contacts.add("three");
        return(contacts);
    }
}