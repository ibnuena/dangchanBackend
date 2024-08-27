package com.dangchan.dangchan.user.repository;

import com.dangchan.dangchan.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Boolean existsByEmail(String email);

    User findByEmail(String email);
}
