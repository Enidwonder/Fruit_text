package com.example.lenovo.text;

/**
 * Created by lenovo on 2017/5/5.
 */

public class Fruit {
    private String fruit_name;
    private int fruit_imageID;
    Fruit(String name,int id){
        fruit_name = name;
        fruit_imageID = id;
    }
    public String getFruit_name(){return fruit_name;};
    public int getFruit_imageID(){return fruit_imageID;};
}
