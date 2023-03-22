package com.example.basecomon.service.Impl;


import com.example.basecomon.model.User;
import com.example.basecomon.repository.BaseRepository;
import com.example.basecomon.repository.UserRepository;
import com.example.basecomon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    protected BaseRepository<User> getRepository() {
        return userRepository;
    }
}

