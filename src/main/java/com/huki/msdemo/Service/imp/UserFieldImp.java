package com.huki.msdemo.Service.imp;




import com.huki.msdemo.Entity.UserField;
import com.huki.msdemo.Service.UserFieldbus;

import com.huki.msdemo.mapper.UserFieldMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFieldImp implements UserFieldbus {

//    @Autowired
//    UserFiledDao userFiledDao;

    @Autowired
    UserFieldMapper userFieldMapper;

    public List<UserField> selectuf() {

        return userFieldMapper.selectField();
    }

}
