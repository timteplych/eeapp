package ru.ttv.ee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Timofey Teplykh
 */
public class OrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("login", req.getSession(false).getAttribute("login"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("order.jsp");
        requestDispatcher.forward(req, resp);
    }
}
