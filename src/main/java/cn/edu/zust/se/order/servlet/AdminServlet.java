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
        if ("delete".equals(methodName)) {
doDele(req,res);
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
    public void doAdd(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String login_name=req.getParameter("login_name");
        String password=req.getParameter("password");
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        int type= Integer.parseInt(req.getParameter("type"));
        ResultSet rs= DBUtil.select("select * from t_user where id="+id+")");
        if (rs==null){
            DBUtil.update("insert into t_user values("+id+",'"+login_name+"','"+password+"','"+name+"','"+mobile+"','"+email+"',"+type+")");
            out.println("用户添加成功");
            out.println(id);
        }
        else {
            out.println("已有该用户，请勿重复添加");
        }
    }
    public void doDele(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
int id= Integer.parseInt(req.getParameter("id"));
ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
if (rs==null){
    out.println("该用户不存在！");
}else {
    DBUtil.update("delete from t_user where id="+id+"");
    out.println("删除用户成功");
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
                out.println("修改用户信息成功");

            }else {
                out.println("该用户不存在！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doShow(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
ResultSet rs=DBUtil.select("select * from t_user");
        List<UserVo> user1=new ArrayList<>();
        try {
            if (rs.next()) {
                UserVo u = rs2User(rs);
                user1.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user1",user1);
        req.getRequestDispatcher("/WEB-INF/jsp/usershow.jsp").forward(req,res);
    }
    public void dodel1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+" and name='"+name+"'");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                out.println("删除成功");
            }else {
                out.println("该商品不存在");
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
                out.println("修改成功");

            }else {
                out.println("该商品不存在");
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
int num= Integer.parseInt(req.getParameter("num"));
ResultSet rs=DBUtil.select("select * from t_order_item where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("update t_order_item set num="+num+" where id="+id+"" );
                out.println("订单修改成功");
            }else {
                out.println("该订单信息不存在");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dogoods(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void doitems(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/admin/shop").forward(req,res);
    }
    public void doshop(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
            ResultSet rst = DBUtil.select("select * from t_order where id=" + id + ")");
            if (rst == null) {
                String sql1 = "insert into t_order values(" + id + "," + goods_id + "," + buyer_id + "," + seller_id + "," + price + ",'" + order_time + "','" + submit_time + "'," + amount + "," + status + ")";
                DBUtil.update(sql1);
                out.println("添加商品成功");
            } else {
                out.println("购物车中已有该商品，请勿重复添加！");
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
        req.getRequestDispatcher("/WEB-INF/jsp/t_ordershow1.jsp").forward(req,res);
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
        int sum=0;
        List<T_order> list=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i=0;i<list.size();i++){
            sum+=list.get(i).getPrice()*list.get(i).getAmount();
        }
        req.getSession().setAttribute("sum",sum);
        req.getRequestDispatcher("/WEB-INF/jsp/Check.jsp").forward(req,res);
        return sum;
    }
    }

