package com.example.user.loginimp;

import android.app.Application;

/**
 * Created by user on 13-Jun-18.
 */
public class Globals {

    private static Globals instance;

    // Global variable
    private int data;

    // Restrict the constructor from being instantiated
    private Globals(){}

    public void setData(int d){
        this.data=d;
    }
    public int getData(){
        return this.data;
    }

    public static synchronized Globals getInstance(){
        if(instance==null){
            instance=new Globals();
        }
        return instance;
    }}