package com.huki.msdemo.mapper;


import com.huki.msdemo.Entity.UserField;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
public interface UserFieldMapper {

    List<UserField> selectField();


//    //@Select("select COLUMN_NAME from information_schema.COLUMNS where table_name ='user'and TABLE_SCHEMA='oa'")
//    List<UserField> getByAll();
}
