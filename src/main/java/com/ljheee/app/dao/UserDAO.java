package com.ljheee.app.dao;

import com.ljheee.app.entity.User;

import java.util.List;

/**
 * Created by lijianhua04 on 2018/7/18.
 */
public interface UserDAO {



    Integer addUser(User user);


    List<User> getUserList();

    Integer getUserCount();

    void deleteById(Integer id);
}
