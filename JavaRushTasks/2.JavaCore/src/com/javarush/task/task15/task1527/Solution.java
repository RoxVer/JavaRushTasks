package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        String link = "";

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            link = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        link = link.substring(link.indexOf("?") + 1);
        String[] arr = link.split("&");

        for (String x : arr) {
            String[] arr2 = x.split("=");
            System.out.print(arr2[0] + " ");
        }
        System.out.println();

        //if (Arrays.asList(arr).contains("obj")) {
        for (String x : arr) {
            String[] arr2 = x.split("="); //разделить на две строки между которых =
            if (arr2[0].equals("obj")) {
                if (arr2[1].matches("\\-?\\d*(\\.\\d{0,})?")) { //check if string contains number
                    alert(Double.parseDouble(arr2[1]));
                } else {
                    alert(arr2[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
