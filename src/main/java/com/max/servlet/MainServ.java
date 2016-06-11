package com.max.servlet;

import com.max.servlet.model.ModelView;
import com.max.servlet.persistence.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import com.max.servlet.entity.Contctlist;
import com.max.servlet.persistence.HibernateUtil;

public class MainServ extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //Session session = HibernateUtil.getSessionFactory()..
        ModelView be = new ModelView();
        List result = be.getContacts();

        req.setAttribute("customparam", result);
        req.getRequestDispatcher("mainjsp.jsp").forward(req, resp);

    }


}