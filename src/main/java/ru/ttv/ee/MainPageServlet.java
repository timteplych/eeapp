package ru.ttv.ee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Timofey Teplykh
 */
public class MainPageServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(MainPageServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("login", req.getSession(false).getAttribute("login"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("about.jsp");
        requestDispatcher.forward(req, resp);
    }
}
