/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com.inhand.kv.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import shixj.test.model.User;

/**
 *
 * @author shixj
 */
public class UserMapper implements RowMapper<User>{

    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();  
        user.setId(rs.getInt("id"));  
        user.setName(rs.getString("name"));  
        user.setPassword(rs.getString("password"));  
          
        return user;       
    }
    
}
