package com.example.basecomon.controller;

import com.example.basecomon.model.Test;
import com.example.basecomon.service.BaseService;
import com.example.basecomon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController extends BaseController<Test> {
    @Autowired
    TestService testService;
    @Override
    protected BaseService<Test> getService() {
        return testService;
    }
}
