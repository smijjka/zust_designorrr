package cn.edu.zust.se.order.service.impl;

import cn.edu.zust.se.order.service.UserService;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.UserVo;

import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.System.out;

/**
 * 
 * @author czg
 * @since 2022/5/30 11:40
 */
public class UserServiceImpl implements UserService {
    @Override
    public UserVo login(String userName, String password) {
        String sql="select * from t_user where login_name='"+userName+"' and password='"+password+"'";
        ResultSet rs=DBUtil.select(sql);
        try {
            if (rs.next()) {
                UserVo user = rs2vo(rs);
                if (rs.next())
                    return null;
                return user;
            } else
                return null;
        }catch (SQLException e){
            return null;
        }
    }
    public UserVo register(int id,String login_name,String name,String password,String mobile,String email,int type){
        String sql="select * from t_user where login_name='"+login_name+"' and password='"+password+"'";
        ResultSet rs=DBUtil.select(sql);
        try{
            if (rs.next()){
               out.println("已有该用户，请前往登录");
               return null;
            }else {
                DBUtil.update("insert into t_user values("+id+",'"+login_name+"','"+password+"','"+name+"','"+mobile+"','"+email+"',"+type+")");
                UserVo user=new UserVo(id,login_name,name,password,mobile,email,type);
                return user;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    private UserVo rs2vo(ResultSet rs) throws SQLException {
        UserVo user=new UserVo();
        user.setId(rs.getInt("id"));
        user.setLoginName(rs.getString("login_name"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setMobile(rs.getString("mobile"));
        user.setType(rs.getInt("type"));
        return user;
    }
}
