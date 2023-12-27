package TaskManagement.TaskManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TaskManagement.TaskManagement.dao.UserDao;
import TaskManagement.TaskManagement.dto.UserDto;
import TaskManagement.TaskManagement.entity.UserEntity;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity createUser(UserDto dto) {
        try {
            UserEntity entity = new UserEntity();
            entity.setId(dto.getId());
            entity.setUsername(dto.getUsername());
            entity.setPassword(dto.getPassword());
            entity = userDao.save(entity);
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<UserEntity> getAllUsers() {
        try {
            // This function will return list of all users
            List<UserEntity> userEntityList = userDao.findAll();
            return userEntityList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
