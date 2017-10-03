package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            StackTraceElement element = stackTraceElements[2];
            int el = element.getLineNumber();
            System.out.println("method1 = " + Integer.toString(el));
        return el;/*напишите тут ваш код*/
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        int el = element.getLineNumber();
        System.out.println("method2 = " + Integer.toString(el));
        return el /*напишите тут ваш код*/ ;
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        int el = element.getLineNumber();
        System.out.println("method3 = " + Integer.toString(el));
        return el /*напишите тут ваш код*/ ;
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        int el = element.getLineNumber();
        System.out.println("method4 = " + Integer.toString(el));
        return el /*напишите тут ваш код*/ ;
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        int el = element.getLineNumber();
        System.out.println("method5 = " + Integer.toString(el));
        return el /*напишите тут ваш код*/ ;
    }
}
