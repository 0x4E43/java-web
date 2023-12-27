package TaskManagement.TaskManagement.dto;

import java.util.Date;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;


public class TaskDto {
    private Long tid;
    private String title;
    private String description;
    private Date duedate;
    private Integer priority;
    private User assignedUser;

    public Long getId() {
        return tid;
    }
    public void setId(Long tid) {
        this.tid = tid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
  
    public User getAssignedUser() {
        return assignedUser;
    }
    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
    public Long getTid() {
        return tid;
    }
    public void setTid(Long tid) {
        this.tid = tid;
    }
    public Date getDuedate() {
        return duedate;
    }
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
