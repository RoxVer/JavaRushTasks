package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id;
        String name;
        HashMap<String, Integer> map = new HashMap<>();

        try {
            do {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name, id);
            } while (name != null && !name.isEmpty() && !map.containsValue(name));
        }catch(NumberFormatException e){

        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            id = pair.getValue();
            name = pair.getKey();
            System.out.println(id + " " + name);
        }

    }
}
