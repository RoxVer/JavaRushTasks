package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 */
/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static List<String> list = new ArrayList<>();

    static {
        addLines();
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }

    public static void addLines() {
        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            while (file.ready()) {
                lines.add(file.readLine());
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
