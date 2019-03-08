package ru.ttv.ee;

import ru.ttv.ee.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Timofey Teplykh
 */
public class ProductCatalogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setId(UUID.randomUUID().toString());
            product.setName("Product "+i);
            product.setPrice(1000);
            product.setDescription("Description "+i);
            products.add(product);
        }

        req.setAttribute("login", req.getSession(false).getAttribute("login"));
        req.setAttribute("products", products);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("productcatalog.jsp");
        requestDispatcher.forward(req,resp);
    }

}
