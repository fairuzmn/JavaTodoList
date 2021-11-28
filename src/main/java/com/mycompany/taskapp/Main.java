/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskapp;

import com.mycompany.taskapp.Controllers.TaskController;
import com.mycompany.taskapp.Controllers.UserController;
import com.mycompany.taskapp.Models.User;
import com.mycompany.taskapp.Views.Task.TaskView;
import com.mycompany.taskapp.Views.User.UserLogin;

/**
 *
 * @author Parasit
 */
public class Main {

    private boolean isLogin;
    private User userLogin;
    private TaskController taskController;
    private UserController userController;
    private UserLogin userLoginView;

    public Main() {
        taskController = new TaskController();
        userController = new UserController();
    }

    public boolean isIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public User getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(User userLogin) {
        this.userLogin = userLogin;
    }

    public TaskController getTaskController() {
        return taskController;
    }

    public void setTaskController(TaskController taskController) {
        this.taskController = taskController;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public UserLogin getUserLoginView() {
        return userLoginView;
    }

    public void setUserLoginView(UserLogin userLoginView) {
        this.userLoginView = userLoginView;
    }

    public void navigateTaskView() {
        TaskView taskView = new TaskView(taskController, this);
        taskView.setVisible(true);
    }

    public void logoutUser() {
        isLogin = false;
        userLogin = null;
        userLoginView.setVisible(true);
        userLoginView.resetData();
    }

    public static void main(String args[]) {
        Main TodoApp = new Main();
        UserLogin userLoginView = new UserLogin(TodoApp);
        TodoApp.setUserLoginView(userLoginView);
        TodoApp.getUserLoginView().setVisible(true);
    }
}
