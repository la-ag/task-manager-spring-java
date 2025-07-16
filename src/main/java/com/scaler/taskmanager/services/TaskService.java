package com.scaler.taskmanager.services;

import com.scaler.taskmanager.entities.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {

    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskId = 1;

    public TaskEntity addTask(String title, String description, String deadline) {
        TaskEntity task = new TaskEntity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(false);
//        task.setDeadline(new Date(deadline));   //TODO: validate provided deadline is in format YYYY-MM-DD
        tasks.add(task);
        taskId++;
        return task;
    }

    //below method is not needed as it is part of getter/setter that is handled by Lombok
    public ArrayList<TaskEntity> getTasks() {
        return tasks;
    }

    public TaskEntity getTaskById(int id) {
        for(TaskEntity task : tasks) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;

        //TODO: replace/update above old-school method code with Java-8 Stream API --> refer to Add list -> 7:19 under Module-1
    }

}
