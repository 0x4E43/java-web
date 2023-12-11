package com.thahiba.nimaitest.service;

import com.thahiba.nimaitest.dao.UserDAO;
import com.thahiba.nimaitest.dto.UserDTO;
import com.thahiba.nimaitest.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;
    public UserEntity createUser(UserDTO dto){
        try{
            UserEntity entity = new UserEntity();
            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setPassword(dto.getPassword());
            entity = userDAO.save(entity);
            return entity;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<UserEntity> getAllUsers() {
        try{
            List<UserEntity> userEntityList = userDAO.findAll();
            return userEntityList;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}