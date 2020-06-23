package com.huki.msdemo.Dao;


import com.huki.msdemo.Entity.UserField;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFiledDao {
    List<UserField> selectField();
}
