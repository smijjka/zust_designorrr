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
    }

    public void dobuttonadd(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try{
            List<Goods> goods = (List<Goods>) req.getSession().getAttribute("goods");
            int id = goods.get(0).getId();
            int seller_id = goods.get(0).getSell_id();
            int price = goods.get(0).getPrice();
            int num = goods.get(0).getNum();
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
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where id=" + idd1 + "");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+6;
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
            int num = goods.get(1).getNum();
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
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where id=" + idd1 + "");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+6;
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
            int num = goods.get(2).getNum();
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
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where id=" + idd1 + "");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+6;
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
            int num = goods.get(3).getNum();
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
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where id=" + idd1 + "");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+6;
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
            int num = goods.get(4).getNum();
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
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where id=" + idd1 + "");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+6;
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
            int num = goods.get(5).getNum();
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
            String submit_time = order_time;
            // String sql="select * from t_order_item where id="+id+"";
            int idd1=id+6;
            ResultSet rst = DBUtil.select("select * from t_order where id=" + idd1 + "");
            if (rst.next()) {
                String str1 = "购物车中已有该商品，请勿重复添加！";
                req.getSession().setAttribute("str1", str1);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req, res);
            } else {
                int idd=id+6;
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
    ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+"");
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
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id+"");
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
        UserVo user= (UserVo) req.getSession().getAttribute("user");
        int id1=user.getId();
        out.println(id1);
        int sum=0;
        List<T_order> list=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where buyer_id="+id1+" and status="+1+"");
            while (rs.next()){
                T_order t=rs4User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
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
        DBUtil.update("update t_order set status="+0+" where buyer_id="+id+"");
        String str="清空购物车成功";
        req.getSession().setAttribute("str1",str);
        req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan1.jsp").forward(req,res);
    }
    public void doback(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/buyerHome.jsp").forward(req,res);
    }
}
