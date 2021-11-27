/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskapp.Controllers;

import com.mycompany.taskapp.Models.Database;
import com.mycompany.taskapp.Models.Task;
import java.util.ArrayList;

/**
 *
 * @author Parasit
 */
public class TaskController {

    private Database database;

    public TaskController() {
        database = new Database();
    }

    public void save(Task task) {
        database.getData().add(task);
    }

    public void update(Task task) {
        for (int i = 0; i < database.getData().size(); i++) {
            Task oldTask = database.getData().get(i);
            if (oldTask.getId().equals(task.getId())) {
                database.getData().set(i, task);
            }
        }
    }

    public void delete(Task task) {
        for (int i = 0; i < database.getData().size(); i++) {
            Task oldTask = database.getData().get(i);
            if (oldTask.getId().equals(task.getId())) {
                database.getData().remove(i);
            }
        }
    }

    public Task readById(String id) {
        for (int i = 0; i < database.getData().size(); i++) {
            Task oldTask = database.getData().get(i);
            if (oldTask.getId().equals(id)) {
                return oldTask;
            }
        }

        return null;
    }

    public ArrayList<Task> readAll() {
        return database.getData();
    }
}
