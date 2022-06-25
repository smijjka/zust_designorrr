package cn.edu.zust.se.order.servlet;

import cn.edu.zust.se.order.servlet.base.BaseServlet;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.Goods;
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

import static java.lang.System.out;

@WebServlet(name = "sellerServlet",urlPatterns = "/seller/*")
public class SellerServlet extends BaseServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri=req.getRequestURI();
        int index=uri.lastIndexOf("/");
        String methodName=uri.substring(index+1);
        out.println("uri:"+uri.substring(index+1));
        out.println(req.getMethod());
        if("up_sho".equals(methodName)){
                doup_sho(req,res);
        }
        if("back2".equals(methodName)){
            doback2(req,res);
        }
        if("down_sho".equals(methodName)){
            dodown_shoe(req,res);
        }
        if("update_sho".equals(methodName)){
            doupdate_sho(req,res);
        }
        if("selljsp".equals(methodName)){
            doselljsp(req,res);
        }
        if("zhongzhuan".equals(methodName)){
            dozhongzhuan(req,res);
        }
        if("back".equals(methodName)){
            doback(req,res);
        }
        if("butdown".equals(methodName)){
            dobutdown(req,res);
        }
        if("butdown1".equals(methodName)){
            dobutdown1(req,res);
        }

        if("butdown2".equals(methodName)){
            dobutdown2(req,res);
        }

        if("butdown3".equals(methodName)){
            dobutdown3(req,res);
        }

        if("butdown4".equals(methodName)){
            dobutdown4(req,res);
        }

        if("butdown5".equals(methodName)){
            dobutdown5(req,res);
        }
        if("butdown6".equals(methodName)){
            dobutdown6(req,res);
        }
        if("butdown7".equals(methodName)){
            dobutdown7(req,res);
        }
        if("butdown8".equals(methodName)){
            dobutdown8(req,res);
        }
        if("butdown9".equals(methodName)){
            dobutdown9(req,res);
        }
        if("butdown10".equals(methodName)){
            dobutdown10(req,res);
        }
        if("butdown11".equals(methodName)){
            dobutdown11(req,res);
        }
        if("butdown12".equals(methodName)){
            dobutdown12(req,res);
        }
        if("butdown13".equals(methodName)){
            dobutdown13(req,res);
        }
        if("butdown14".equals(methodName)){
            dobutdown14(req,res);
        }
        if("butdown15".equals(methodName)){
            dobutdown15(req,res);
        }
        if("butdown16".equals(methodName)){
            dobutdown16(req,res);
        }
        if("butdown17".equals(methodName)){
            dobutdown17(req,res);
        }
        if("butdown18".equals(methodName)){
            dobutdown18(req,res);
        }
        if("butdown19".equals(methodName)){
            dobutdown19(req,res);
        }
        if("butdown20".equals(methodName)){
            dobutdown20(req,res);
        }
    }
    public void doback2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        req.getRequestDispatcher("/WEB-INF/jsp/sell.jsp").forward(req,res);
    }
    public void dobutdown(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(0).getId();
        out.println(id);
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }public void dobutdown17(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(17).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }public void dobutdown18(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(18).getId();
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                DBUtil.update("delete from t_goods where id="+id+"");
                String str4="删除商品信息成功";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
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
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }else {
                String str4="该商品不存在，请重新输入";
                req.getSession().setAttribute("str4",str4);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan7.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void doup_sho(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String category = req.getParameter("category");
            UserVo user = (UserVo) req.getSession().getAttribute("user");
            int sell_id =user.getId();
            int price = Integer.parseInt(req.getParameter("price"));
            int num = Integer.parseInt(req.getParameter("num"));
            int status = Integer.parseInt(req.getParameter("status"));
            Date d = new Date();// new Date()为获取当前系统时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
            //需要导入java.text.*包
            String create_time = sdf.format(d);
            String up_time = create_time;
            String down_time="0001-1-1 0:00:00";
            ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
            if (rs.next()){
                String str="已有该商品，请勿重复添加";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
            else {
                String sql="insert into t_goods values("+id+",'"+name+"','"+category+"',"+sell_id+","+price+","+num+",'"+up_time+"','"+down_time+"','"+create_time+"',"+status+")";
                DBUtil.update(sql);
                out.println("数据插入成功");
                String str="上架商品成功";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dodown_shoe(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
int id= Integer.parseInt(req.getParameter("id"));
String name=req.getParameter("name");
ResultSet rs=DBUtil.select("select * from t_goods where id="+id+" and name='"+name+"'");
        try {
            if (rs.next()){
                Date d = new Date();// new Date()为获取当前系统时间
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM，HH，SSS要大写
                //需要导入java.text.*包
                String down_time = sdf.format(d);
                int status=0;
                String sql="update t_goods set down_time='"+down_time+"',status="+status+" where id="+id+" and name='"+name+"'";
                DBUtil.update(sql);
                String str="下架商品成功";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }else{
                String str="您输入的信息与已有商品信息不匹配！";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doupdate_sho(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String category = req.getParameter("category");
        int price = Integer.parseInt(req.getParameter("price"));
        int num = Integer.parseInt(req.getParameter("num"));
        int status = Integer.parseInt(req.getParameter("status"));
        ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
        try {
            if (rs.next()){
                String sql="update t_goods set name='"+name+"',category='"+category+"',price="+price+",num="+num+",status="+status+" where id="+id+"";
                DBUtil.update(sql);
                String str="更新商品信息成功";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
            else {
                String str="输入信息错误";
                req.getSession().setAttribute("str",str);
                req.getRequestDispatcher("/WEB-INF/jsp/zhongzhuan.jsp").forward(req,res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void doselljsp(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        req.getRequestDispatcher("/WEB-INF/jsp/sell.jsp").forward(req,res);
    }
    public void dozhongzhuan(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        req.getRequestDispatcher("/WEB-INF/jsp/sell.jsp").forward(req,res);
    }
    public  void doback(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/jsp/sellerHome.jsp").forward(req,res);
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
}
