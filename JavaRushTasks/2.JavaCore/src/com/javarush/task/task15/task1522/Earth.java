package com.javarush.task.task15.task1522;

/**
 * 03.10.2017
 * 15:21
 * Created by Roxy
 */
public class Earth implements Planet {
    private static Earth instance;

    private Earth() {}

    public static Earth getInstance(){
        if(instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
