package cn.edu.zust.se.order.servlet;

import cn.edu.zust.se.order.servlet.base.BaseServlet;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.Goods;
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

import static java.lang.System.*;

@WebServlet(name = "adminServlet",urlPatterns = "/admin/*")
public class AdminServlet extends BaseServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri = req.getRequestURI();
        int index = uri.lastIndexOf("/");
        String methodName = uri.substring(index + 1);
        out.println("uri:" + uri.substring(index + 1));
        out.println(req.getMethod());
        if ("add_user".equals(methodName)) {
            doAdd(req,res);
        }
        if ("admin_shopping".equals(methodName)) {
            doadmin_shopping(req,res);
        }
        if ("delete".equals(methodName)) {
            doDele(req,res);
        }
        if ("zhongzhuan3".equals(methodName)) {
            dozhongzhuan3(req,res);
        }
        if ("zhongzhuan6".equals(methodName)) {
            dozhongzhuan6(req,res);
        }
        if ("zhongzhuan4".equals(methodName)) {
            dozhongzhuan4(req,res);
        }
        if ("update".equals(methodName)) {
            doUpdate(req,res);
        }
        if ("show".equals(methodName)) {
            doShow(req,res);
        }
        if ("show1".equals(methodName)) {
            doShow1(req,res);
        }
        if ("delete1".equals(methodName)) {
            dodel1(req,res);
        }
        if ("update1".equals(methodName)) {
            doupdate1(req,res);
        }
        if ("order_add".equals(methodName)) {
            doAdd1(req,res);
        }
        if ("order_update".equals(methodName)) {
            doupdate2(req,res);
        }
        if ("admin_goods".equals(methodName)) {
            dogoods(req,res);
        }
        if ("admin_item".equals(methodName)) {
            doitems(req,res);
        }
        if ("shop".equals(methodName)) {
            doshop(req,res);
        }
        if ("add_sho".equals(methodName)) {
            doshopping(req,res);
        }
        if ("update3".equals(methodName)) {
            doupdate3(req,res);
        }
        if ("money1".equals(methodName)) {
            domoney1(req,res);
        }
        if ("admin_users".equals(methodName)) {
            dousers(req,res);
        }
        if ("back4".equals(methodName)) {
            doback4(req,res);
        }
        if ("back5".equals(methodName)) {
            doback5(req,res);
        }
        if ("zhongzhuan5".equals(methodName)) {
            dozhongzhuan5(req,res);
        }
        if ("buttondelete".equals(methodName)) {
            dobuttondelete(req,res);
        }
        if ("buttondelete1".equals(methodName)) {
            dobuttondelete1(req,res);
        }
        if ("buttondelete2".equals(methodName)) {
            dobuttondelete2(req,res);
        }
        if ("buttondelete3".equals(methodName)) {
            dobuttondelete3(req,res);
        }
        if ("buttondelete4".equals(methodName)) {
            dobuttondelete4(req,res);
        }
        if ("buttondelete5".equals(methodName)) {
            dobuttondelete5(req,res);
        }
        if ("buttondelete6".equals(methodName)) {
            dobuttondelete6(req,res);
        }
        if ("buttondelete7".equals(methodName)) {
            dobuttondelete7(req,res);
        }
        if ("buttondelete8".equals(methodName)) {
            dobuttondelete8(req,res);
        }
        if ("buttondelete9".equals(methodName)) {
            dobuttondelete9(req,res);
        }
        if ("buttondelete10".equals(methodName)) {
            dobuttondelete10(req,res);
        }
        if ("buttondelete11".equals(methodName)) {
            dobuttondelete11(req,res);
        }
        if ("buttondelete12".equals(methodName)) {
            dobuttondelete12(req,res);
        }
        if ("buttondelete13".equals(methodName)) {
            dobuttondelete13(req,res);
        }
        if ("buttondelete14".equals(methodName)) {
            dobuttondelete14(req,res);
        }
        if ("buttondelete15".equals(methodName)) {
            dobuttondelete15(req,res);
        }
        if ("buttondelete16".equals(methodName)) {
            dobuttondelete16(req,res);
        }
        if ("buttondelete17".equals(methodName)) {
            dobuttondelete17(req,res);
        }
        if ("buttondelete18".equals(methodName)) {
            dobuttondelete18(req,res);
        }
        if ("buttondelete19".equals(methodName)) {
            dobuttondelete19(req,res);
        }
        if ("buttondelete20".equals(methodName)) {
            dobuttondelete20(req,res);
        }
        if ("butdown".equals(methodName)) {
            dobutdown(req,res);
        }
        if ("butdown1".equals(methodName)) {
            dobutdown1(req,res);
        }
        if ("butdown2".equals(methodName)) {
            dobutdown2(req,res);
        }
        if ("butdown3".equals(methodName)) {
            dobutdown3(req,res);
        }
        if ("butdown4".equals(methodName)) {
            dobutdown4(req,res);
        } if ("butdown5".equals(methodName)) {
            dobutdown5(req,res);
        }
        if ("butdown6".equals(methodName)) {
            dobutdown6(req,res);
        }
        if ("butdown7".equals(methodName)) {
            dobutdown7(req,res);
        }
        if ("butdown8".equals(methodName)) {
            dobutdown8(req,res);
        }
        if ("butdown9".equals(methodName)) {
            dobutdown9(req,res);
        }
        if ("butdown10".equals(methodName)) {
            dobutdown10(req,res);
        } if ("butdown11".equals(methodName)) {
            dobutdown11(req,res);
        }
        if ("butdown12".equals(methodName)) {
            dobutdown12(req,res);
        }
        if ("butdown13".equals(methodName)) {
            dobutdown13(req,res);
        }
        if ("butdown14".equals(methodName)) {
            dobutdown14(req,res);
        }
        if ("butdown15".equals(methodName)) {
            dobutdown15(req,res);
        }
        if ("butdown16".equals(methodName)) {
            dobutdown16(req,res);
        } if ("butdown17".equals(methodName)) {
            dobutdown17(req,res);
        }
        if ("butdown18".equals(methodName)) {
            dobutdown18(req,res);
        } if ("butdown19".equals(methodName)) {
            dobutdown19(req,res);
        }
        if ("butdown20".equals(methodName)) {
            dobutdown20(req,res);
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
        if ("back100".equals(methodName)) {
            doback100(req, res);
        }
        if ("back2".equals(methodName)) {
            doback2(req, res);
        }
        if ("show".equals(methodName)) {
            doshow1(req, res);
        }
        if ("Show".equals(methodName)) {
            doshow(req, res);
        }
    }
    public void doshow(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+" and status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow1.jsp").forward(req,res);
    }
    public void doshow1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+" and status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow1.jsp").forward(req,res);
    }
    public void dozhongzhuan6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/admin_shopping.jsp").forward(req,res);
    }
    public void doback100(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);
    }
    public void doback2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/admin_shopping.jsp").forward(req,res);
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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time ="0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            String submit_time = "0001-1-1 0:00:00";
            // String sql="select * from t_order_item where id="+id+"";
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

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
            ResultSet rst = DBUtil.select("select * from t_order where buyer_id=" + buyer_id + " and goods_id="+id+"");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);
            } else {
                int idd=id+10;
                String sql1 = "insert into t_order values(" + idd + "," + id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + num + "," + status + ")";
                DBUtil.update(sql1);
                String str1 = "添加商品成功";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan6.jsp").forward(req, res);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally{

        }
    }
    public void dobutdown(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(0).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(1).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(2).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(3).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(4).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(5).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(6).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(7).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(8).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(9).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(10).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown11(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(11).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown12(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(12).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown13(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(13).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown14(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(14).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown15(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(15).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown16(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(16).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown17(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(17).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown18(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(18).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown19(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(19).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobutdown20(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(20).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(0).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(1).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(2).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(3).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(4).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(5).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(6).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(7).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(8).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(9).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(10).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete11(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(11).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete12(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(12).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete13(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(13).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete14(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(14).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete15(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(15).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete16(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(16).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete17(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(17).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete18(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(18).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete19(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(19).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dobuttondelete20(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(20).getId();
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doadmin_shopping(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs6User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_shopping.jsp").forward(req,res);
    }
    public UserVo rs2User(ResultSet rs) {
        UserVo u = new UserVo();
        try {
            u.setId(rs.getInt("id"));
            u.setLoginName(rs.getString("login_name"));
            u.setPassword(rs.getString("password"));
            u.setName(rs.getString("name"));
            u.setMobile(rs.getString("mobile"));
            u.setEmail(rs.getString("email"));
            u.setType(rs.getInt("type"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    public void doback4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        req.getRequestDispatcher("/WEB-INF/jsp/adminHome.jsp").forward(req,res);
    }
    public void doback5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/adminHome.jsp").forward(req,res);
    }
    public void dozhongzhuan3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        doShow2(req,res);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);
    }
    public  void dozhongzhuan4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        dogoodss(req,res);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dozhongzhuan5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);
    }
    public void dousers(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        doShow2(req,res);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);
    }
    public void doAdd(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String login_name=req.getParameter("login_name");
        String password=req.getParameter("password");
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        int type= Integer.parseInt(req.getParameter("type"));
        ResultSet rs= DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                String str3="已有该用户，请勿重复添加";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }
            else {
                DBUtil.update("insert into t_user values("+id+",'"+login_name+"','"+password+"','"+name+"','"+mobile+"','"+email+"',"+type+")");
                String str3="用户添加成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doDele(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_user where id="+id+"");
                String str3="删除用户成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doUpdate(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String login_name=req.getParameter("login_name");
        String password=req.getParameter("password");
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        int type= Integer.parseInt(req.getParameter("type"));
        ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("update t_user set login_name='"+login_name+"',password='"+password+"',name='"+name+"',mobile='"+mobile+"',email='"+email+"',type="+type+" where id="+id+"");
                String str3="修改用户信息成功";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);

            }else {
                String str3="该用户不存在";
                req.getSession().setAttribute("str3",str3);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan3.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doShow(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ResultSet rs=DBUtil.select("select * from t_user");
        List<UserVo> user1=new ArrayList<>();
        try {
            while(rs.next()) {
                UserVo u = rs2User(rs);
                user1.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user1",user1);
        req.getRequestDispatcher("/WEB-INF/jsp/usershow.jsp").forward(req,res);
    }
    public void doShow2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ResultSet rs=DBUtil.select("select * from t_user");
        List<UserVo> user1=new ArrayList<>();
        try {
            while(rs.next()) {
                UserVo u = rs2User(rs);
                user1.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user2",user1);
    }
    public void dodel1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+" and name='"+name+"'");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doupdate1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        int price= Integer.parseInt(req.getParameter("price"));
        int num= Integer.parseInt(req.getParameter("num"));
        int status= Integer.parseInt(req.getParameter("status"));
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("update t_goods set name='"+name+"',price="+price+",num="+num+",status="+status+" where id="+id+"");
                String str4="修改商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);

            }else {
                String str4="该商品不存在。请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doAdd1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        int order_id= Integer.parseInt(req.getParameter("order_id"));
        int goods_id= Integer.parseInt(req.getParameter("goods_id"));
        int num= Integer.parseInt(req.getParameter("num"));
        ResultSet rs=DBUtil.select("select * from t_order_item where id="+id+"");
        if (rs==null){
            DBUtil.update("insert into t_order_item values("+id+","+order_id+","+goods_id+","+num+")");
            out.println("添加订单成功");
        }
    }
    public void doupdate2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        int amount= Integer.parseInt(req.getParameter("amount"));
        int status= Integer.parseInt(req.getParameter("status"));
        int price= Integer.parseInt(req.getParameter("price"));
        ResultSet rs=DBUtil.select("select * from t_order where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("update t_order set amount="+amount+",price="+price+",status="+status+" where id="+id+"" );
                String str5="订单修改成功";
                req.getSession().setAttribute("str4",str5);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan5.jsp").forward(req,res);
            }else {
                String str5="该订单信息不存在";
                req.getSession().setAttribute("str4",str5);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan5.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dogoods(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs6User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dogoodss(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try{
            String sql="select * from t_goods where status="+1+"";
            ResultSet rs=DBUtil.select(sql);
            while (rs.next()){
                Goods g=rs6User(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
    }
    public void doitems(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/admin/shop").forward(req,res);
    }
    public void doshop(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);
    }
    public Goods rs6User(ResultSet rs) throws SQLException {
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
    public void doshopping(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
                req.getSession().setAttribute("str5",str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);
            } else {
                String sql1 = "insert into t_order values(" + id + "," + goods_id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + amount + "," + status + ")";
                DBUtil.update(sql1);
                String str1="添加商品成功";
                req.getSession().setAttribute("str5",str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan4.jsp").forward(req,res);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

    }
    public void doShow1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow.jsp").forward(req,res);
    }
    public T_order rs7User(ResultSet rs) throws SQLException {
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
    public void doupdate3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        int amount= Integer.parseInt(req.getParameter("amount"));
        ResultSet rs=DBUtil.select("select * from t_order where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("update t_order set amount="+amount+" where id="+id+"");
            }else {
                out.println("输入信息不存在");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int domoney1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
                T_order t = rs7User(rst);
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

