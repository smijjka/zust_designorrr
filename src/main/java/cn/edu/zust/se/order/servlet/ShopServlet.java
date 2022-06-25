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
        if ("add_sho".equals(methodName)) {
            add_sho(req, res);
        }
        if ("delete_sho".equals(methodName)) {
            delete_sho(req, res);
        }
        if ("shoppingjsp".equals(methodName)) {
            doshoppingjsp(req, res);
        }
        if ("showjsp".equals(methodName)) {
            doshow(req, res);
        }
        if ("show".equals(methodName)) {
            doshow1(req, res);
        }
        if ("update".equals(methodName)) {
            doupdate(req, res);
        }
        if ("money".equals(methodName)) {
            domoney(req, res);
        }
        if ("empty".equals(methodName)) {
            doempty(req, res);
        }
        if ("back".equals(methodName)) {
            doback(req, res);
        }
        if ("back1".equals(methodName)) {
            doback1(req, res);
        }
        if ("back2".equals(methodName)) {
            doback2(req, res);
        }
        if ("zhongzhuan1".equals(methodName)) {
            dozhongzhuan1(req, res);
        }
        if ("zhongzhuan2".equals(methodName)) {
            dozhongzhuan2(req, res);
        }
        if ("back3".equals(methodName)) {
            doback3(req, res);
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
        if ("buttonadd11".equals(methodName)) {
            dobuttonadd11(req, res);
        }
        if ("buttonadd12".equals(methodName)) {
            dobuttonadd12(req, res);
        }
        if ("buttonadd13".equals(methodName)) {
            dobuttonadd13(req, res);
        }
        if ("buttonadd14".equals(methodName)) {
            dobuttonadd14(req, res);
        }
        if ("buttonadd15".equals(methodName)) {
            dobuttonadd15(req, res);
        }
        if ("buttonadd16".equals(methodName)) {
            dobuttonadd16(req, res);
        }
        if ("buttonadd17".equals(methodName)) {
            dobuttonadd17(req, res);
        }
        if ("buttonadd18".equals(methodName)) {
            dobuttonadd18(req, res);
        }
        if ("buttonadd19".equals(methodName)) {
            dobuttonadd19(req, res);
        }
        if ("buttonadd20".equals(methodName)) {
            dobuttonadd20(req, res);
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
        if ("buttonupdate10".equals(methodName)) {
            dobuttonupdate10(req, res);
        }
        if ("buttonupdate11".equals(methodName)) {
            dobuttonupdate11(req, res);
        }
        if ("buttonupdate12".equals(methodName)) {
            dobuttonupdate12(req, res);
        }
        if ("buttonupdate13".equals(methodName)) {
            dobuttonupdate13(req, res);
        }
        if ("buttonupdate14".equals(methodName)) {
            dobuttonupdate14(req, res);
        }
        if ("buttonupdate15".equals(methodName)) {
            dobuttonupdate15(req, res);
        }
        if ("buttonupdate16".equals(methodName)) {
            dobuttonupdate16(req, res);
        }
        if ("buttonupdate17".equals(methodName)) {
            dobuttonupdate17(req, res);
        }
        if ("buttonupdate18".equals(methodName)) {
            dobuttonupdate18(req, res);
        }
        if ("buttonupdate19".equals(methodName)) {
            dobuttonupdate19(req, res);
        }
        if ("buttonupdate20".equals(methodName)) {
            dobuttonupdate20(req, res);
        }
    }
    public void dobuttonupdate(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(0).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(1).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(2).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(3).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(4).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(5).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(6).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(7).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(8).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(9).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(10).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate11(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(11).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate12(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(12).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate13(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(13).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate14(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(14).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate15(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(15).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate16(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(16).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate17(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(17).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate18(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(18).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate19(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(19).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dobuttonupdate20(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(20).getId();
        try{
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
            String str2="删除成功";
            req.getSession().setAttribute("str2",str2);
            req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);


        } catch (Exception e) {
            e.printStackTrace();
        }
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
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            int idd1=id+100;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+7;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+100;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+7;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd11(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(11).getId();
            int seller_id = goods.get(11).getSell_id();
            int price = goods.get(11).getPrice();
            int num = 1;
            int status = goods.get(11).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd12(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(12).getId();
            int seller_id = goods.get(12).getSell_id();
            int price = goods.get(12).getPrice();
            int num = 1;
            int status = goods.get(12).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd13(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(13).getId();
            int seller_id = goods.get(13).getSell_id();
            int price = goods.get(13).getPrice();
            int num = 1;
            int status = goods.get(13).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd14(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(14).getId();
            int seller_id = goods.get(14).getSell_id();
            int price = goods.get(14).getPrice();
            int num = 1;
            int status = goods.get(14).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd15(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(15).getId();
            int seller_id = goods.get(15).getSell_id();
            int price = goods.get(15).getPrice();
            int num = 1;
            int status = goods.get(15).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd16(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(16).getId();
            int seller_id = goods.get(16).getSell_id();
            int price = goods.get(16).getPrice();
            int num = 1;
            int status = goods.get(16).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd17(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(17).getId();
            int seller_id = goods.get(17).getSell_id();
            int price = goods.get(17).getPrice();
            int num = 1;
            int status = goods.get(17).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd18(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(18).getId();
            int seller_id = goods.get(18).getSell_id();
            int price = goods.get(18).getPrice();
            int num = 1;
            int status = goods.get(18).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd19(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(19).getId();
            int seller_id = goods.get(19).getSell_id();
            int price = goods.get(19).getPrice();
            int num = 1;
            int status = goods.get(19).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobuttonadd20(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(20).getId();
            int seller_id = goods.get(20).getSell_id();
            int price = goods.get(20).getPrice();
            int num = 1;
            int status = goods.get(20).getStatus();
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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id;
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+100;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public Order rs2User(ResultSet rs) throws SQLException {
        Order u=new Order();
        u.setId(rs.getInt("id"));
        u.setOrder_id(rs.getInt("order_id"));
        u.setGoods_id(rs.getInt("goods_id"));
        u.setNum(rs.getInt("num"));
        return u;
    }
    public void dozhongzhuan1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void dozhongzhuan2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        doshow2(req,res);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void doback1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/buyerHome.jsp").forward(req,res);
    }
    public void doback2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req,res);
    }
    public void doback3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        doshow2(req,res);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public void delete_sho(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        int seller_id= Integer.parseInt(req.getParameter("seller_id"));
        int buyer_id= Integer.parseInt(req.getParameter("buyer_id"));
        try{
            String sql="select * from t_order where id="+id+"";
            ResultSet rs=DBUtil.select(sql);
            if (rs.next()){
                String sql1="delete from t_order where id="+id+"";
                DBUtil.update(sql1);
                String str2="删除成功";
                req.getSession().setAttribute("str2",str2);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);
            }else {
                String str2="当前购物车中没有该商品";
                req.getSession().setAttribute("str2",str2);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void add_sho(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            int price=0;
            int seller_id = Integer.parseInt(req.getParameter("seller_id"));
            int id = Integer.parseInt(req.getParameter("id"));
            int goods_id = Integer.parseInt(req.getParameter("goods_id"));
            int amount = Integer.parseInt(req.getParameter("amount"));
            int status = Integer.parseInt(req.getParameter("status"));
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int buyer_id = user.getId();
            ResultSet rs=DBUtil.select("select * from t_goods where id="+goods_id+"");
            if (rs.next()) {
                price = rs.getInt("price");
            }
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String order_time = sdf.format(d);
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where id=" + id + "");
            if (rst.next()) {
                String str1="购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1",str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req,res);
            } else {
                String sql1 = "insert into t_order values(" + id + "," + goods_id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + amount + "," + status + ")";
                DBUtil.update(sql1);
                String str1="添加商品成功";
                req.getSession().setAttribute("str1",str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req,res);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

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
        req.getRequestDispatcher("/WEB-INF/jsp/show.jsp").forward(req,res);
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
        ResultSet rs=DBUtil.select("select * from t_order where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("update t_order set amount="+amount+" where id="+id+"");
                String str2="修改商品数量成功";
                req.getSession().setAttribute("str2",str2);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);
            }else {
                String str2="输入信息不存在";
                req.getSession().setAttribute("str2",str2);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan2.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        public void doempty(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        UserVo user= (UserVo) req.getSession().getAttribute("user");
        int id=user.getId();
        DBUtil.update("delete from t_order where buyer_id="+id+"");
        String str="清空购物车成功";
        req.getSession().setAttribute("str1",str);
        req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req,res);
    }
    public void doback(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/buyerHome.jsp").forward(req,res);
    }
}
