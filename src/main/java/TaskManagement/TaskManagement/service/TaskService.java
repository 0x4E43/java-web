package TaskManagement.TaskManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import TaskManagement.TaskManagement.dao.TaskDao;
import TaskManagement.TaskManagement.dto.TaskDto;
import TaskManagement.TaskManagement.entity.TaskEntity;

import java.util.List;
import java.util.concurrent.CompletableFuture;


@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    @Async("customTaskExecutor")
    public CompletableFuture<TaskEntity> createTaskAsync(TaskDto tdto) {
        try {
            simulateTimeConsumingTask();

            TaskEntity t_entity = new TaskEntity();
            t_entity.setTid(tdto.getId());
            t_entity.setTitle(tdto.getTitle());
            t_entity.setDescription(tdto.getDescription());
            t_entity.setDuedate(tdto.getDuedate());
            t_entity.setPriority(tdto.getPriority());

            t_entity = taskDao.save(t_entity);
            return CompletableFuture.completedFuture(t_entity);
        } catch (Exception e) {
            e.printStackTrace();
            return CompletableFuture.completedFuture(null);
        }
    }

    public List<TaskEntity> getAllTasks() {
        try {
            // This function will return a list of all Tasks
            List<TaskEntity> taskEntityList = taskDao.findAll();
            return taskEntityList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public TaskEntity saveTask(Task task) {
        return null;
    }

    public TaskEntity getTaskById(Long taskId) {
        return null;
    }

    public void deleteTask(Long taskId) {
    }

    private void simulateTimeConsumingTask() {
        try {
            // Simulate a time-consuming task (e.g., database save) by sleeping for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
