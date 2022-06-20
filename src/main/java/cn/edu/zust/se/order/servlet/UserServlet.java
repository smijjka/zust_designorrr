package cn.edu.zust.se.order.servlet;

import cn.edu.zust.se.order.servlet.base.BaseServlet;
import cn.edu.zust.se.order.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.out;

/**
 * 
 * @author czg
 * @since 2022/5/30 11:19
 */
@WebServlet(name = "userServlet",urlPatterns = "/users/*")
public class UserServlet extends BaseServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri=req.getRequestURI();
        int index=uri.lastIndexOf("/");
        String methodName=uri.substring(index+1);
        out.println("uri:"+uri.substring(index+1));
        out.println(req.getMethod());
        if("login".equals(methodName)){
            if(req.getMethod().equals("GET"))
                doLoginPage(req,res);
            else
                doLogin(req,res);
        }
        if("register".equals(methodName)){
            if(req.getMethod().equals("GET"))
                doRegisterPage(req,res);
            else
                doRegister(req,res);
        }

    }
    private void doLoginPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,res);
        out.println("这是GET方法");
    }
    private void doLogin(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        out.println("userName:"+userName+",password:"+password);
        UserVo user=userService.login(userName,password);
        if(user==null){
            req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,res);
        }else{
            req.getSession().setAttribute("user",user);
            if(user.getType()==0)
                req.getRequestDispatcher("/WEB-INF/jsp/adminHome.jsp").forward(req,res);
            if(user.getType()==1)
                req.getRequestDispatcher("/WEB-INF/jsp/sellerHome.jsp").forward(req,res);
            if(user.getType()==2)
                req.getRequestDispatcher("/WEB-INF/jsp/buyerHome.jsp").forward(req,res);

        }
    }
    protected void doRegisterPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(req,res);
    }
    protected void doRegister(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String login_name=req.getParameter("login_name");
        String pwd=req.getParameter("password");
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        int type= Integer.parseInt(req.getParameter("type"));
        UserVo user=userService.register(id,login_name,name,pwd,mobile,email,type);
        if (user==null){
            req.getRequestDispatcher("/users/login").forward(req,res);
        }
        else {
            req.getRequestDispatcher("/users/login").forward(req,res);
        }
    }

}

