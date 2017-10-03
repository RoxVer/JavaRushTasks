package com.javarush.task.task15.task1522;

/**
 * 03.10.2017
 * 15:21
 * Created by Roxy
 */
public class Moon implements Planet {
    private static Moon instance;

    private Moon() {}

    public static Moon getInstance(){
        if(instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
