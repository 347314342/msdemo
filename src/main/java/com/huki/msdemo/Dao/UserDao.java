package com.huki.msdemo.Dao;


import com.huki.msdemo.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> selectAll();
}
