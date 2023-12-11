package com.thahiba.nimaitest.dao;

import com.thahiba.nimaitest.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, Long> {
}
