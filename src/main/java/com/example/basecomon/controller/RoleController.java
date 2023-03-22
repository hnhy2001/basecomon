package com.example.basecomon.controller;

import com.example.basecomon.model.Role;
import com.example.basecomon.service.BaseService;
import com.example.basecomon.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleController extends BaseController<Role> {
    @Autowired
    RoleService roleService;
    @Override
    protected BaseService<Role> getService() {
        return roleService;
    }
}
