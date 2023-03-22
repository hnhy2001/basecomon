package com.example.basecomon.controller;

import com.example.basecomon.model.User;
import com.example.basecomon.service.BaseService;
import com.example.basecomon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    UserService userService;
    @Override
    protected BaseService<User> getService() {
        return userService;
    }
}
