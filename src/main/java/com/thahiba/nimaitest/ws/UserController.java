package com.thahiba.nimaitest.ws;

import com.thahiba.nimaitest.dto.UserDTO;
import com.thahiba.nimaitest.entity.UserEntity;
import com.thahiba.nimaitest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping(path = "/v1/create-user")
    public UserEntity createUser(@RequestBody UserDTO dto){
        return userService.createUser(dto);
    }

    @GetMapping(path = "/v1/get-all")
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping
    public String sayHello(){
        return "Hello";
    }
}
