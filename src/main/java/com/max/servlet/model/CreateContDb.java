package com.max.servlet.model;

import com.max.servlet.entity.Contctlist;
import com.max.servlet.persistence.HibernateUtil;
import org.hibernate.Session;
import java.util.*;

public class CreateContDb {

    public void setContacts(String fn, String ln, String em, String adr, String tel) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Contctlist user = new Contctlist();

        if (fn!=null) user.setFirstName(fn);
        if (ln!=null) user.setLastName(ln);
        if (em!=null) user.setEmail(em);
        if (adr!=null) user.setAddress(adr);
        if (tel!=null) user.setTelNum(tel);

        session.save(user);
        session.getTransaction().commit();
    }
}