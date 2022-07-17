package cn.edu.zust.se.order.servlet;

import cn.edu.zust.se.order.servlet.base.BaseServlet;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.Goods;
import cn.edu.zust.se.order.vo.Report;
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

        if ("update".equals(methodName)) {
            doUpdate(req,res);
        }

        if ("show1".equals(methodName)) {
            doShow1(req,res);
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

        if ("update3".equals(methodName)) {
            doupdate3(req,res);
        }
        if ("admin_users".equals(methodName)) {
            dousers(req,res);
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


        if ("show".equals(methodName)) {
            doshow1(req, res);
        }
        if ("Show".equals(methodName)) {
            doshow(req, res);
        }

        if("search".equals(methodName)){
            dosearch(req,res);
        }
        if("search1".equals(methodName)){
            dosearch1(req,res);
        }
        if("search2".equals(methodName)){
            dosearch2(req,res);
        }
        if("search3".equals(methodName)){
            dosearch3(req,res);
        }
        if("search4".equals(methodName)){
            dosearch4(req,res);
        }
        if("search5".equals(methodName)){
            dosearch5(req,res);
        }
        if("search6".equals(methodName)){
            dosearch6(req,res);
        }
        if("show11".equals(methodName)){
            doshow11(req,res);
        }
        if("shoshow".equals(methodName)){
            doshoshow(req,res);
        }
        if("itemshow".equals(methodName)){
            doitemshow(req,res);
        }
        if("report".equals(methodName)){
            doreport(req,res);
        }
        if("buttondeletereport".equals(methodName)){
            dobuttondeletereport(req,res);
        }
        if("buttondeletereport1".equals(methodName)){
            dobuttondeletereport1(req,res);
        }
        if("buttondeletereport2".equals(methodName)){
            dobuttondeletereport2(req,res);
        }
        if("buttondeletereport3".equals(methodName)){
            dobuttondeletereport3(req,res);
        }
        if("buttondeletereport4".equals(methodName)){
            dobuttondeletereport4(req,res);
        }
        if("buttondeletereport5".equals(methodName)){
            dobuttondeletereport5(req,res);
        }
        if("buttondeletereport6".equals(methodName)){
            dobuttondeletereport6(req,res);
        }
        if("buttondeletereport7".equals(methodName)){
            dobuttondeletereport7(req,res);
        }
        if("buttondeletereport8".equals(methodName)){
            dobuttondeletereport8(req,res);
        }
        if("buttondeletereport9".equals(methodName)){
            dobuttondeletereport9(req,res);
        }
        if("buttondeletereport10".equals(methodName)){
            dobuttondeletereport10(req,res);
        }
        if("buttondeletegoods".equals(methodName)){
            dobuttondeletegoods(req,res);
        }
        if("buttondeletegoods1".equals(methodName)){
            dobuttondeletegoods1(req,res);
        }
        if("buttondeletegoods2".equals(methodName)){
            dobuttondeletegoods2(req,res);
        }
        if("buttondeletegoods3".equals(methodName)){
            dobuttondeletegoods3(req,res);
        }
        if("buttondeletegoods4".equals(methodName)){
            dobuttondeletegoods4(req,res);
        }
        if("buttondeletegoods5".equals(methodName)){
            dobuttondeletegoods5(req,res);
        }
        if("buttondeletegoods6".equals(methodName)){
            dobuttondeletegoods6(req,res);
        }
        if("buttondeletegoods7".equals(methodName)){
            dobuttondeletegoods7(req,res);
        }
        if("buttondeletegoods8".equals(methodName)){
            dobuttondeletegoods8(req,res);
        }
        if("buttondeletegoods9".equals(methodName)){
            dobuttondeletegoods9(req,res);
        }
        if("buttondeletegoods10".equals(methodName)){
            dobuttondeletegoods10(req,res);
        }
    }
    public void dobuttondeletegoods(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(0).getGoods_id();
        int id1=list.get(0).getId();
        out.println(id1);
        out.println(id);
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(1).getGoods_id();
        int id1=list.get(1).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(2).getGoods_id();
        int id1=list.get(2).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(3).getGoods_id();
        int id1=list.get(3).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(4).getGoods_id();
        int id1=list.get(4).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(5).getGoods_id();
        int id1=list.get(5).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(6).getGoods_id();
        int id1=list.get(6).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(7).getGoods_id();
        int id1=list.get(7).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(8).getGoods_id();
        int id1=list.get(8).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(9).getGoods_id();
        int id1=list.get(9).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletegoods10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(10).getGoods_id();
        int id1=list.get(10).getId();
        String sql="delete from t_goods where id="+id+"";
        DBUtil.update(sql);
        String sql1="update t_report set status="+0+" where id="+id1+"";
        DBUtil.update(sql1);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(0).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(1).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(2).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(3).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(4).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(5).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(6).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(7).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(8).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(9).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void dobuttondeletereport10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Report> list= (List<Report>) req.getSession().getAttribute("report");
        int id=list.get(10).getId();
        String sql="delete from t_report where id="+id+"";
        DBUtil.update(sql);
        List<Report> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_report where status="+1+"");
            while (rs.next()){
                Report t=rs10User(rs);
                list1.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",list1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }
    public void doreport(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        ResultSet rs=DBUtil.select("select * from t_report");
        List<Report> report=new ArrayList<>();
        try {
            while(rs.next()) {
                Report r = rs10User(rs);
               report.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("report",report);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_report.jsp").forward(req,res);
    }

    public void doshow11(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        req.getRequestDispatcher("/WEB-INF/jsp/user_search.jsp").forward(req,res);
    }
    public void doshoshow(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        req.getRequestDispatcher("/WEB-INF/jsp/goods_search.jsp").forward(req,res);
    }
    public void doitemshow(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        req.getRequestDispatcher("/WEB-INF/jsp/item_search.jsp").forward(req,res);
    }
    public void dosearch(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> list=new ArrayList<>();
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
            if (rs.next()){
                UserVo g=rs2User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user2",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_search.jsp").forward(req,res);
    }
    public void dosearch1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> list=new ArrayList<>();
        try {
           String name=req.getParameter("name");
            ResultSet rs=DBUtil.select("select * from t_user where login_name="+name+"");
            if (rs.next()){
                UserVo g=rs2User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user2",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_search.jsp").forward(req,res);
    }
    public void dosearch2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> list=new ArrayList<>();
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            ResultSet rs=DBUtil.select("select * from t_user where id="+id+"");
            if (rs.next()){
                UserVo g=rs2User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user2",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/user_search.jsp").forward(req,res);
    }
    public void dosearch3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> list=new ArrayList<>();
        try {
            String name=req.getParameter("name");
            ResultSet rs=DBUtil.select("select * from t_user where login_name="+name+"");
            if (rs.next()){
                UserVo g=rs2User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("user2",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/user_search.jsp").forward(req,res);
    }
    public void dosearch4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            ResultSet rs=DBUtil.select("select * from t_goods where id="+id+"");
            if (rs.next()){
                Goods g=rs6User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/goods_search.jsp").forward(req,res);
    }
    public void dosearch5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> list=new ArrayList<>();
        try {
            String name=req.getParameter("name");
            ResultSet rs=DBUtil.select("select * from t_goods where name="+name+"");
            if (rs.next()){
                Goods g=rs6User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("goods",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/goods_search.jsp").forward(req,res);
    }
    public void dosearch6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list=new ArrayList<>();
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            ResultSet rs=DBUtil.select("select * from t_order where id="+id+"");
            if (rs.next()){
                T_order g=rs7User(rs);
                list.add(g);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/item_search.jsp").forward(req,res);
    }



    public void dobuttonupdate(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(0).getId();
            String sql="delete from t_order where id="+id+"";
            DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
            req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(1).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(2).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(3).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(4).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(5).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(6).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(7).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(8).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(9).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

    }
    public void dobuttonupdate10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<T_order> list= (List<T_order>) req.getSession().getAttribute("t_order");
        int id=list.get(10).getId();
        String sql="delete from t_order where id="+id+"";
        DBUtil.update(sql);
        List<T_order> list1=new ArrayList<>();
        try {
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
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
        req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

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



    public void dobutdown(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(0).getId();
                DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(1).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(2).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(3).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(4).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(5).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(6).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(7).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(8).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(9).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }
    public void dobutdown10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Goods> goods= (List<Goods>) req.getSession().getAttribute("goods");
        int id=goods.get(10).getId();
        DBUtil.update("delete from t_goods where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
    }

    public void dobuttondelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(0).getId();
                DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(1).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(2).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(3).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete4(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(4).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete5(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(5).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete6(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(6).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete7(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(7).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete8(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(8).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete9(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(9).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

    }
    public void dobuttondelete10(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<UserVo> user= (List<UserVo>) req.getSession().getAttribute("user2");
        int id=user.get(10).getId();
        DBUtil.update("delete from t_user where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);

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
    public Report rs10User(ResultSet rs) {
        Report u = new Report();
        try {
            u.setId(rs.getInt("id"));
            u.setEr_id(rs.getInt("er_id"));
            u.setGoods_id(rs.getInt("goods_id"));
            u.setSubmit_time(rs.getString("submit_time"));
            u.setContent(rs.getString("content"));
            u.setStatus(rs.getInt("status"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    public void dousers(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        doShow2(req,res);
        req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);
    }


    public void doUpdate(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String login_name=req.getParameter("login_name");
        String password=req.getParameter("password");
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        int type= Integer.parseInt(req.getParameter("type"));
                DBUtil.update("update t_user set login_name='"+login_name+"',password='"+password+"',name='"+name+"',mobile='"+mobile+"',email='"+email+"',type="+type+" where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                req.getRequestDispatcher("/WEB-INF/jsp/admin_users.jsp").forward(req,res);
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

    public void doupdate1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        int price= Integer.parseInt(req.getParameter("price"));
        int num= Integer.parseInt(req.getParameter("num"));
        int status= Integer.parseInt(req.getParameter("status"));
                DBUtil.update("update t_goods set name='"+name+"',price="+price+",num="+num+",status="+status+" where id="+id+"");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/jsp/admin_goods.jsp").forward(req,res);
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
                DBUtil.update("update t_order set amount="+amount+",price="+price+",status="+status+" where id="+id+"" );
        List<T_order> list=new ArrayList<>();
        try {
            UserVo user= (UserVo) req.getSession().getAttribute("user");
            int id1=user.getId();
            ResultSet rs = DBUtil.select("select * from t_order where status="+1+"");
            while (rs.next()){
                T_order t=rs7User(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("t_order",list);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                req.getRequestDispatcher("/WEB-INF/jsp/admin_item.jsp").forward(req,res);

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

}

