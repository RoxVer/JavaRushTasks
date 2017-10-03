package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] arr = new int[] {5, 2, 4, 7, 0};
        ArrayList<int[]> myList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int[] a = new int[arr[i]];
            myList.add(a);
            for (int j = 0; j < a.length; j++) {
                a[j] = j;
            }
        }

        return myList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
