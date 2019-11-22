package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.Admin;
import com.cqgcxy.universityforum.repository.AdminRepository;
import com.cqgcxy.universityforum.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public boolean adminLogin(String username, String password) {
        Admin admin = adminRepository.findAdminByAdminLoginNameAndAdminLoginPassword(username, password);
        return admin != null;
    }
}
