package com.huki.msdemo.mapper;


import com.huki.msdemo.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Mapper
public interface UserMapper {


    List<User> selectAll(@Param("s") String s);
}
