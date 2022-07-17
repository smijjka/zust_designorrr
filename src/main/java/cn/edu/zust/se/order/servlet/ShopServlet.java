package cn.edu.zust.se.order.servlet;

import cn.edu.zust.se.order.servlet.base.BaseServlet;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.Goods;
import cn.edu.zust.se.order.vo.Order;
import cn.edu.zust.se.order.vo.T_order;
import cn.edu.zust.se.order.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

@WebServlet(name = "buyerServlet",urlPatterns = "/buyer/*")
public class ShopServlet extends BaseServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri = req.getRequestURI();
        int index = uri.lastIndexOf("/");
        String methodName = uri.substring(index + 1);
        out.println("uri:" + uri.substring(index + 1));
        out.println(req.getMethod());
        if ("shoppingjsp".equals(methodName)) {
            doshoppingjsp(req, res);
        }
        if ("showjsp".equals(methodName)) {
            doshow(req, res);
        }
        if ("show".equals(methodName)) {
            doshow1(req, res);
        }
        if ("buy3".equals(methodName)) {
            doshow3(req, res);
        }
        if ("update".equals(methodName)) {
            doupdate(req, res);
        }
        if ("money".equals(methodName)) {
            domoney(req, res);
        }
        if ("buy4".equals(methodName)) {
            domoney(req, res);
        }

        if ("buttonadd".equals(methodName)) {
            dobuttonadd(req, res);
        }
        if ("buttonadd1".equals(methodName)) {
            dobuttonadd1(req, res);
        }
        if ("buttonadd2".equals(methodName)) {
            dobuttonadd2(req, res);
        }
        if ("buttonadd3".equals(methodName)) {
            dobuttonadd3(req, res);
        }
        if ("buttonadd4".equals(methodName)) {
            dobuttonadd4(req, res);
        }
        if ("buttonadd5".equals(methodName)) {
            dobuttonadd5(req, res);
        }
        if ("buttonadd6".equals(methodName)) {
            dobuttonadd6(req, res);
        }
        if ("buttonadd7".equals(methodName)) {
            dobuttonadd7(req, res);
        }
        if ("buttonadd8".equals(methodName)) {
            dobuttonadd8(req, res);
        }
        if ("buttonadd9".equals(methodName)) {
            dobuttonadd9(req, res);
        }
        if ("buttonadd10".equals(methodName)) {
            dobuttonadd10(req, res);
        }
        if("search".equals(methodName)){
            dosearch(req,res);
        }
        if("search1".equals(methodName)){
            dosearch1(req,res);
        }

        if ("buttonupdate".equals(methodName)) {
            dobuttonupdate(req, res);
        }
        if ("buttonupdate1".equals(methodName)) {
            dobuttonupdate1(req, res);
        }
        if ("buttonupdate2".equals(methodName)) {
            dobuttonupdate2(req, res);
        }
        if ("buttonupdate3".equals(methodName)) {
            dobuttonupdate3(req, res);
        }
        if ("buttonupdate4".equals(methodName)) {
            dobuttonupdate4(req, res);
        }
        if ("buttonupdate5".equals(methodName)) {
            dobuttonupdate5(req, res);
        }
        if ("buttonupdate6".equals(methodName)) {
            dobuttonupdate6(req, res);
        }
        if ("buttonupdate7".equals(methodName)) {
            dobuttonupdate7(req, res);
        }
        if ("buttonupdate8".equals(methodName)) {
            dobuttonupdate8(req, res);
        }
        if ("buttonupdate9".equals(methodName)) {
            dobuttonupdate9(req, res);
        }
        if ("buttonupdate9".equals(methodName)) {
            dobuttonupdate9(req, res);
        }
        if ("report".equals(methodName)) {
            doreport(req, res);
        }
    }
    public void doreport(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String content=req.getParameter("content");
        int goods_id= Integer.parseInt(req.getParameter("goods_id"));
        int status= Integer.parseInt(req.getParameter("status"));
        Date d = new Date();// new Date()为获取当前系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
        //需要导入java.text.*包
        String time = sdf.format(d);
        UserVo user= (UserVo) req.getSession().getAttribute("user");
        int er_id=user.getId();
        ResultSet rs=DBUtil.select("select * from t_report where id="+id+"");
        try {
            if (!rs.next()){
                DBUtil.update("insert into t_report values("+id+","+er_id+","+goods_id+",'"+time+"','"+content+"',"+status+")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dosearch(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
            if (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/buyer_search.jsp").forward(req,res);
    }
    public void dosearch1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try {
            String name = req.getParameter("name");
            ResultSet rs=DBUtil.select("select * from t_goods where name='"+name+"'");
            if (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/buyer_search.jsp").forward(req,res);
    }
    public void dobuttonupdate(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(0).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(1).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(2).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(3).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(4).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(5).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(6).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(7).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(8).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonupdate9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(9).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void dobuttonadd(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(0).getId();
            int seller_id = goods.get(0).getSell_id();
            int price = goods.get(0).getPrice();
            int num = 1;
            int status = goods.get(0).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(1).getId();
            int seller_id = goods.get(1).getSell_id();
            int price = goods.get(1).getPrice();
            int num = 1;
            int status = goods.get(1).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(2).getId();
            int seller_id = goods.get(2).getSell_id();
            int price = goods.get(2).getPrice();
            int num = 1;
            int status = goods.get(2).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(3).getId();
            int seller_id = goods.get(3).getSell_id();
            int price = goods.get(3).getPrice();
            int num = 1;
            int status = goods.get(3).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(4).getId();
            int seller_id = goods.get(4).getSell_id();
            int price = goods.get(4).getPrice();
            int num = 1;
            int status = goods.get(4).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(5).getId();
            int seller_id = goods.get(5).getSell_id();
            int price = goods.get(5).getPrice();
            int num = 1;
            int status = goods.get(5).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(6).getId();
            int seller_id = goods.get(6).getSell_id();
            int price = goods.get(6).getPrice();
            int num = 1;
            int status = goods.get(6).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(7).getId();
            int seller_id = goods.get(7).getSell_id();
            int price = goods.get(7).getPrice();
            int num = 1;
            int status = goods.get(7).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(8).getId();
            int seller_id = goods.get(8).getSell_id();
            int price = goods.get(8).getPrice();
            int num = 1;
            int status = goods.get(8).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(9).getId();
            int seller_id = goods.get(9).getSell_id();
            int price = goods.get(9).getPrice();
            int num = 1;
            int status = goods.get(9).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dobuttonadd10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(10).getId();
            int seller_id = goods.get(10).getSell_id();
            int price = goods.get(10).getPrice();
            int num = 1;
            int status = goods.get(10).getStatus();
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs = DBUtil.select("select * from t_goods where id=" + id + "");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd=id+100;
            String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
            DBUtil.update(sql1);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ResultSet rst=DBUtil.select("select * from t_goods");
        List<Goods> list=new ArrayList<>();
        try {
            while (rst.next()){
                Goods g=rs3User(rst);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }

    public Order rs2User(ResultSet rs) throws SQLException {
        Order u=new Order();
        u.setId(rs.getInt("id"));
        u.setOrder_id(rs.getInt("order_id"));
        u.setGoods_id(rs.getInt("goods_id"));
        u.setNum(rs.getInt("num"));
        return u;
    }




    public void doshoppingjsp(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void doshow(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs3User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/show1.jsp").forward(req,res);
    }
    public Goods rs3User(ResultSet rs) throws SQLException {
        Goods u=new Goods();
        u.setId(rs.getInt("id"));
        u.setName(rs.getString("name"));
        u.setCategory(rs.getString("category"));
        u.setSell_id(rs.getInt("seller_id"));
        u.setPrice((rs.getInt("price")));
        u.setNum(Integer.parseInt(rs.getString("num")));
        u.setUp_time(rs.getString("up_time"));
        u.setDown_time(rs.getString("down_time"));
        u.setCreate_time(rs.getString("create_time"));
        u.setStatus(rs.getInt("status"));
        return u;
    }
    public void doshow1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void doshow3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow1.jsp").forward(req,res);
    }
    public void doshow2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
    }
    public T_order rs4User(ResultSet rs) throws SQLException {
        T_order u=new T_order();
        u.setId(rs.getInt("id"));
        u.setGoods_id(rs.getInt("goods_id"));
        u.setBuyer_id(rs.getInt("buyer_id"));
        u.setSell_id(rs.getInt("seller_id"));
        u.setPrice(rs.getInt("price"));
        u.setOrder_time(rs.getString("order_time"));
        u.setSubmit_time((rs.getString("submit_time")));
        u.setAmount(Integer.parseInt(rs.getString("amount")));
        u.setStatus(rs.getInt("status"));
        return u;
    }
    public void doupdate(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        int amount= Integer.parseInt(req.getParameter("amount"));
                DBUtil.update("update t_order set amount="+amount+" where id="+id+"");
        List<T_order> list1=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow1.jsp").forward(req,res);

    }

    public int domoney(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        Date d = new Date();// new Date()为获取当前系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
        //需要导入java.text.*包
        String time = sdf.format(d);
        UserVo user= (UserVo) req.getSession().getAttribute("user");
        int id1=user.getId();
        out.println(id1);
        int sum=0;
        List<T_order> list=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                DBUtil.update("update t_order set submit_time='"+time+"' where buyer_id="+id1+"");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + id1 + " and status=" + 1 + "");
            while (rst.next()) {
                T_order t = rs4User(rst);
                out.println(t);
                list.add(t);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);

        for (int i=0;i<list.size();i++){
            int order_id=list.get(i).getId();
            int goods_id=list.get(i).getGoods_id();
            int num=list.get(i).getAmount();
            int id=order_id;
            ResultSet rs=DBUtil.select("select * from t_order_item where order_id="+id+"");
            try {
                if (rs != null ? rs.next() : false) {
                    out.println("已有该订单");
                }else {
                    DBUtil.update("insert into t_order_item values(" + id + "," + order_id + "," + goods_id + "," + num + ")");
                    out.println("插入成功");
                    DBUtil.update("update t_order set status="+0+" where buyer_id="+id1+"");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        req.getRequestDispatcher("/WEB-INF/jsp/Check.jsp").forward(req,res);
        return sum;
    }


}
