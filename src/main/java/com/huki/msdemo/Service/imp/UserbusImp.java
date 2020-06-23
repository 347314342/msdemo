package com.huki.msdemo.Service.imp;

import com.huki.msdemo.Entity.User;
import com.huki.msdemo.Service.Userbus;
import com.huki.msdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserbusImp implements Userbus {


    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> selectbyb(String s) {
        return userMapper.selectAll(s);
    }
}
