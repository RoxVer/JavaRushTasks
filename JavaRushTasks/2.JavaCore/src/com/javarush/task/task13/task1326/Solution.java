package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String locname = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(locname)));
        ArrayList<Integer> list = new ArrayList<>();

        while(fileReader.ready()){
           list.add(Integer.parseInt(fileReader.readLine()));
        }

        sort(list);

        for (Integer number : list) {
            if(number % 2 == 0){
                System.out.println(number);
            }
        }

        fileReader.close();
    }
    public static void sort(ArrayList<Integer> xlist){
        int swap = 0;
        for (int i = 0; i < xlist.size() - 1; i++) {
            for (int j = 0; j < xlist.size() - 1 - i; j++) {
                int a = xlist.get(j);
                int b = xlist.get(j + 1);
                if(xlist.get(j) > xlist.get(j + 1)){
                    swap = xlist.get(j + 1);
                    xlist.set(j + 1, xlist.get(j));
                    xlist.set(j, swap);
                }
            }
        }
    }
}
