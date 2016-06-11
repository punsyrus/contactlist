package com.max.servlet;

import com.max.servlet.model.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateContact extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List result = new ArrayList();
        result.add("First name"); //test list
        result.add("Last Name");
        result.add("Email");
        result.add("TelNum");
        result.add("Address");
        req.setAttribute("name", result);
        req.getRequestDispatcher("create.jsp").forward(req, resp);

    }
}
