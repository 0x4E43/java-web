package TaskManagement.TaskManagement.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import TaskManagement.TaskManagement.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity,Long>{
    
}
