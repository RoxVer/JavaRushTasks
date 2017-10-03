package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        int elemNum = Thread.currentThread().getStackTrace().length;
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return elemNum;
    }
}

