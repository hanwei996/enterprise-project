package com.shadow.ssm.service;


import com.shadow.mybatis.pojo.User;

public interface UserService {
    public User findUserById(long id);
    public int insertUser(User user);

}
