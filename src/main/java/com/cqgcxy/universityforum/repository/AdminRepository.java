package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findAdminByAdminLoginNameAndAdminLoginPassword(String username,String password);
}
