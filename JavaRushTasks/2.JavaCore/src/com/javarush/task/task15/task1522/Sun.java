package com.javarush.task.task15.task1522;

/**
 * 03.10.2017
 * 15:21
 * Created by Roxy
 */
public class Sun implements Planet {
    private static Sun instance;

    private Sun() {}

    public static Sun getInstance(){
        if(instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
