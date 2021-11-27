/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskapp;

import com.mycompany.taskapp.Views.TaskView;

/**
 *
 * @author Parasit
 */
public class Main {

    TaskView taskView;

    void Main() {
        taskView = new TaskView();
        taskView.setVisible(true);
    }
}
