/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskapp.Models;

import java.util.ArrayList;

/**
 *
 * @author Parasit
 */
public class Database {

    ArrayList<Task> dataTask;

    public Database() {
        dataTask = new ArrayList<Task>();
    }

    public ArrayList<Task> getData() {
        return dataTask;
    }
}
