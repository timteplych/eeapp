package ru.ttv.ee;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author Timofey Teplykh
 */
@javax.servlet.annotation.WebFilter(filterName = "WebFilter", urlPatterns = {"/*"})
public class WebFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html; charset=UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
