package com.jcsanchez;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jsssn on 08-May-17.
 */
@WebServlet(urlPatterns = {"/home", "*.do"}, initParams = {@WebInitParam(name = "ProductName", value = "Welcome Application")})
public class SimpleServlet extends HttpServlet {
    String appName = "My Application";

    @Override
    public void init() throws ServletException {
        appName = getServletContext().getInitParameter("ProductName");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name != null) {
            resp.setContentType("text/xml");
            resp.getWriter().printf("<application>" +
                    "<name>Hello %s</name>" +
                    "<product>%s</product>" +
                    "</application>", name, appName);
        } else {
            resp.getWriter().write("Please enter a name");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name != null && name != "") {
            resp.getWriter().printf("Hello %s", name);
        } else {
            resp.sendRedirect("index.jsp");
        }
    }
}
