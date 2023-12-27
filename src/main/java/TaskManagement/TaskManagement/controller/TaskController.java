package TaskManagement.TaskManagement.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TaskManagement.TaskManagement.dto.TaskDto;
import TaskManagement.TaskManagement.entity.TaskEntity;
import TaskManagement.TaskManagement.service.TaskService;


@RestController
@RequestMapping(path = "/task")
public class TaskController {

    @Autowired
    TaskService taskService;
    
    @PostMapping(path = "/v1/create-task")
    public CompletableFuture<TaskEntity> createTask(@RequestBody TaskDto dto){
        return taskService.createTaskAsync(dto);
    }
    @DeleteMapping("/{tid}")
    public void deleteTask(Long taskId) {
        taskService.deleteTask(taskId);
    }

    @GetMapping(path = "/v1/get-all")
    public List<TaskEntity> getAllUsers(){
        return taskService.getAllTasks();
    }

    @GetMapping
    public String sayHello(){
        return "Hello";
    }
}

