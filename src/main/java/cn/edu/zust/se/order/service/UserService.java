package cn.edu.zust.se.order.service;

import cn.edu.zust.se.order.vo.UserVo;

import java.sql.SQLException;

/**
 * @author czg
 * @since 2022/5/30 11:37
 */
public interface UserService {
    UserVo login(String userName, String password);
}
