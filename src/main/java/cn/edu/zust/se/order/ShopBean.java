package cn.edu.zust.se.order;

import cn.edu.zust.se.order.util.DBUtil;

import java.sql.ResultSet;
import java.util.ResourceBundle;

import static java.lang.System.out;

public class ShopBean{
    public void Show() throws Exception{
        out.println("<table border=1>");
        out.println("<tr>");
        out.println("<th width=100>"+"id");
        out.println("<th width=100>"+"name");
        out.println("<th width=100>"+"category");
        out.println("<th width=100>"+"seller_id");
        out.println("<th width=100>"+"price");
        out.println("<th width=100>"+"num");
        out.println("<th width=100>"+"up_time");
        out.println("<th width=100>"+"down_time");
        out.println("<th width=100>"+"create_time");
        out.println("<th width=100>"+"status");
out.println("<tr>");
String sql="select * from t_goods where status="+1+"";
        ResultSet rs= DBUtil.select(sql);
        while (rs.next()){
            out.println("<tr>");
            out.print("<td>"+rs.getString(1)+"</td>");
            out.print("<td>"+rs.getString(2)+"</td>");
            out.print("<td>"+rs.getString(3)+"</td>");
            out.print("<td>"+rs.getString(4)+"</td>");
            out.print("<td>"+rs.getString(5)+"</td>");
            out.print("<td>"+rs.getString(6)+"</td>");
            out.print("<td>"+rs.getString(7)+"</td>");
            out.print("<td>"+rs.getString(8)+"</td>");
            out.print("<td>"+rs.getString(9)+"</td>");
            out.println("<tr>");
        }
        out.println("</table>");
    }
}
