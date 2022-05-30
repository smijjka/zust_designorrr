package cn.edu.zust.se.order.service.impl;

import cn.edu.zust.se.order.service.UserService;
import cn.edu.zust.se.order.util.DBUtil;
import cn.edu.zust.se.order.vo.UserVo;

import java.sql.ResultSet;
import java.sql.SQLException;

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
