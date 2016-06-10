package com.max.servlet;

import com.max.servlet.persistence.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.hibernate.Session;
import com.max.servlet.entity.Contctlist;
import com.max.servlet.persistence.HibernateUtil;

public class MainServ extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //Session session = HibernateUtil.getSessionFactory()..
        String c = req.getParameter("name");
        req.setAttribute("customparam", c);
        req.getRequestDispatcher("mainjsp.jsp").forward(req, resp);

    }


}