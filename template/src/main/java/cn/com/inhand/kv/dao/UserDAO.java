/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com.inhand.kv.dao;

import java.util.List;
import shixj.test.model.User;

/**
 *
 * @author shixj
 */
public interface UserDAO {

    public List<User> getAllUser();

    public void addUser(User user);

    public User getUserById(int parseInt);


    
}
