package cn.edu.zust.se.order.listener;

import cn.edu.zust.se.order.service.UserService;
import cn.edu.zust.se.order.service.impl.UserServiceImpl;
import cn.edu.zust.se.order.util.DBUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 
 * @author czg
 * @since 2022/5/30 11:43
 */
@WebListener
public class OrderAppListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DBUtil.openConnection("jdbc:mysql://localhost:3306/order?characterEncoding=utf-8","root","123456");
        UserService userService=new UserServiceImpl();
        sce.getServletContext().setAttribute("userService",userService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DBUtil.closeConnection();
    }
}
