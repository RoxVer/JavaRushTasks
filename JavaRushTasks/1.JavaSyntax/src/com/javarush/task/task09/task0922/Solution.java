package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat formatting = new SimpleDateFormat(pattern);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dating = reader.readLine();
        Date date = formatting.parse(dating);

        String patternTwo = "MMM dd, yyyy";
        SimpleDateFormat formatTwo = new SimpleDateFormat(patternTwo);

        System.out.println(formatTwo.format(date).toUpperCase());

    }
}
