package com.shadow.ssm.service.impl;

import com.shadow.mybatis.Idao.UserMapper;
import com.shadow.mybatis.pojo.User;
import com.shadow.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 分布式
 */
@Service("productService")
public class UserServiceImpl implements UserService {


    @Autowired(required = false)
    private UserMapper userMapper;

    // 根据id查询

    public User findUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    // 插入用户
    public int insertUser(User user) {
        System.out.println("User="+user.toString());
        return  userMapper.insert(user);
    }
}
