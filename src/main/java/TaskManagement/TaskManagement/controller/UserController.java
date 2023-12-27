package TaskManagement.TaskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import TaskManagement.TaskManagement.dto.UserDto;
import TaskManagement.TaskManagement.entity.UserEntity;
import TaskManagement.TaskManagement.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/create-user")
    public UserEntity createUser(@RequestBody UserDto dto) {
        return userService.createUser(dto);
    }

    @GetMapping(path = "/get-all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

}
