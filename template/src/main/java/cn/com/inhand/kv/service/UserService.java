/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com.inhand.kv.service;

import cn.com.inhand.kv.dao.UserDAO;
import cn.com.inhand.kv.util.DataSourceImp;
import cn.com.inhand.kv.util.UserMapper;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import shixj.test.model.User;
import shixj.test.service.Collections;

/**
 *
 * @author shixj
 */
@Service
public class UserService implements UserDAO{
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);
    private static final String collectionName = Collections.SHIXJ_TEST_USER;
    
    @Autowired
    private DataSourceImp dataImp;
    private JdbcTemplate jdbcTemplateObject;
    

    public List<User> getAllUser() {
        jdbcTemplateObject = dataImp.getJdbcTemplate();
        List<User> user = null;  
        String sql = "SELECT * FROM user"; 
        user = jdbcTemplateObject.query(sql, new UserMapper());  
        return user;  
    }

    public void addUser(User user) {
        jdbcTemplateObject = dataImp.getJdbcTemplate();
        String sql = "INSERT INTO user(name,password)VALUES(?,?)";  
        jdbcTemplateObject.update(sql, user.getName(),user.getPassword());  
    }

    public User getUserById(int id) {
        jdbcTemplateObject = dataImp.getJdbcTemplate();
        User user=null;
        String sql = "SELECT * FROM user where id=?"; 
        user = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new int[] { java.sql.Types.INTEGER },new UserMapper()); 
        return user;  
    }
    
    
    
}
