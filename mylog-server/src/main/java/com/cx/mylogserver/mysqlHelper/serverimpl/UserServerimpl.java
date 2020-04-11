package com.cx.mylogserver.mysqlHelper.serverimpl;

import com.cx.mylogserver.mysqlHelper.Mapper.UserMapper;
import com.cx.mylogserver.mysqlHelper.service.UserService;
import com.cx.mylogserver.mysqlHelper.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserServerimpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        try{
            List<User>users= userMapper.getUserList();
            return users;
        }catch (Exception e){
            throw e;
        }


    }

    @Override
    public String AddUser(User user) {
        try{
            int i =userMapper.AddUser(user);
            return "添加成功"+i+"条数据";
        }catch (Exception e){
            throw e;
        }

    }
}
