package cn.edu.zust.se.order.servlet.base;

import cn.edu.zust.se.order.service.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @author czg
 * @since 2022/5/30 11:48
 */
public class BaseServlet extends HttpServlet {
    protected UserService userService;
    @Override
    public void init(ServletConfig config) throws ServletException {
        userService=(UserService) config.getServletContext().getAttribute("userService");
    }
}
