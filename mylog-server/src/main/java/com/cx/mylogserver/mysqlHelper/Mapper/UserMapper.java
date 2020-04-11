package com.cx.mylogserver.mysqlHelper.Mapper;

import com.cx.mylogserver.mysqlHelper.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper{

    @Select("select * from student")
    List<User> getUserList();

    @Insert("insert into student(name) values(#{name})")
    int AddUser(User user);
}
