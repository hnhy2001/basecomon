package com.example.basecomon.service.Impl;

import com.example.basecomon.model.Test;
import com.example.basecomon.repository.BaseRepository;
import com.example.basecomon.repository.TestRepository;
import com.example.basecomon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends BaseServiceImpl<Test> implements TestService {
    @Autowired
    TestRepository testRepository;
    @Override
    protected BaseRepository<Test> getRepository() {
        return testRepository;
    }
}
