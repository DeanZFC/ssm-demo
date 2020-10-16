package com.zfc.service.impl;

import com.zfc.mapper.UserMapper;
import com.zfc.pojo.User;
import com.zfc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list(){
        List<User> list = new ArrayList<>();
        User user1 = new User(1, "zs");
        User user2 = new User(2, "ls");
        list.add(user1);
        list.add(user2);
        return list;
        //return UserMapper.list();
    }
 
}