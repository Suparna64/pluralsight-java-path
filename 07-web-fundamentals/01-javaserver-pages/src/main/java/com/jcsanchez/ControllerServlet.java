package com.jcsanchez;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jsssn on 10-May-17.
 */
@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ApplicationSettings applicationSettings = new ApplicationSettings();
        CssClass cssClass = new CssClass();
        cssClass.setName("redUser");
        String[] tabNames = {"SignIn", "Home", "Profile", "Settings"};
        applicationSettings.setTabNames(tabNames);
        applicationSettings.setFormCssClass(cssClass);
        getServletContext().setAttribute("app", applicationSettings);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("Jesus");
        user.setEmail("email@email.com");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");

        request.setAttribute("user", user);
        dispatcher.forward(request, response);
    }
}
