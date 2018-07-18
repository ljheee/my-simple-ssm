package com.ljheee.app.entity;

/**
 * Created by lijianhua04 on 2018/7/18.
 */
public class User {

    private Integer id;
    private String name;
    private String passwd;
    private String appid;


    public User(Integer id, String name, String passwd, String appid) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.appid = appid;
    }

    public User(String name, String passwd, String appid) {
        this.name = name;
        this.passwd = passwd;
        this.appid = appid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", appid='" + appid + '\'' +
                '}';
    }
}
