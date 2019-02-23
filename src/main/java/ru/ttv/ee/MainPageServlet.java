package ru.ttv.ee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Timofey Teplykh
 */
public class MainPageServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(MainPageServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New get request");
        PrintWriter printWriter = resp.getWriter();
        printWriter.append("<h1> Главная </h1>");
        printWriter.append("<ul>");
        printWriter.append("<li><a href='"+req.getContextPath()+"/main'>Главная</a></li>");
        printWriter.append("<li><a href='"+req.getContextPath()+"/catalog'>Каталог</a></li>");
        printWriter.append("<li><a href='"+req.getContextPath()+"/product'>Товар</a></li>");
        printWriter.append("<li><a href='"+req.getContextPath()+"/cart'>Корзина</a></li>");
        printWriter.append("<li><a href='"+req.getContextPath()+"/order'>Заказ</a></li>");
        printWriter.append("</ul>");
    }
}
