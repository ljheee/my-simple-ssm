package com.ljheee.app.controller;

import com.ljheee.app.dao.UserDAO;
import com.ljheee.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lijianhua04 on 2018/7/18.
 */

@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired(required = false)
    private UserDAO userDAO;

    @GetMapping(value = "/test")
    public String test(){
        return "ok";
    }


    /**
     * http://localhost:8080/my-simple-ssm/user/add?name=abc&passwd=123&appid=95955542783
     * 添加用户
     * @param name
     * @param passwd
     * @param appid
     * @return
     */
    @GetMapping(value = "/add")
    public User save(@RequestParam(value = "name") String name,
                     @RequestParam(value = "passwd",defaultValue = "0") String passwd,
                     @RequestParam(value = "appid",defaultValue = "0") String appid){

        User user = new User(name,passwd,appid);

        //执行插入，返回主键ID
        int userId = userDAO.addUser(user);
        user.setId(userId);

        return user;
    }


    /**
     * http://localhost:8080/my-simple-ssm/user/list
     *
     * @return
     */
    @GetMapping(value = "/list")
    public List<User> getUserList(){
        return userDAO.getUserList();
    }

    @GetMapping(value = "/list/count")
    public int getUserCount(){
        return userDAO.getUserCount();
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delete(@RequestParam("id") Integer id) {
        userDAO.deleteById(id);
    }




}
