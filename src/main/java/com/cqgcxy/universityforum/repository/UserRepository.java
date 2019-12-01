package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUserEmailAndUserPassword(String email, String password);
}
