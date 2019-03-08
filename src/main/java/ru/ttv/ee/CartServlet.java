package ru.ttv.ee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Timofey Teplykh
 */
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        req.setAttribute("login", session.getAttribute("login"));
        if(session.getAttribute("login") == null){
            resp.sendRedirect(req.getContextPath()+"/auth");
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("cartview.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
