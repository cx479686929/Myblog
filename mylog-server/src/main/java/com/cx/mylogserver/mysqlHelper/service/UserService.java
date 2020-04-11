package com.cx.mylogserver.mysqlHelper.service;

import com.cx.mylogserver.mysqlHelper.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User>getUserList();
    String AddUser(User user);
}
