package com.example.basecomon.service.Impl;


import com.example.basecomon.model.Role;
import com.example.basecomon.repository.BaseRepository;
import com.example.basecomon.repository.RoleRepository;
import com.example.basecomon.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    protected BaseRepository<Role> getRepository() {
        return roleRepository;
    }
}

