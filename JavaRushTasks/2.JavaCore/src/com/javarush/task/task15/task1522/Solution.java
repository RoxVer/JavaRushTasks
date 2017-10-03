package com.javarush.task.task15.task1522;

/*
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
            readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = "";

        try {
            param = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(param.equals("sun") || param.equals("moon") || param.equals("earth")) {
            if (param.equals("sun")) {
                thePlanet = Sun.getInstance();
            } else if (param.equals("moon")) {
                thePlanet = Moon.getInstance();
            } else if (param.equals("earth")) {
                thePlanet = Earth.getInstance();
            }
        } else {
            thePlanet = null;
        }
    }
}
