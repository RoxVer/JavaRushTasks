package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l =  111_1111_111_110L; //-58   -57  0
        int x =  0b1000_1100_1010; //-54     -53  -53
        double m =  110_987_654_6299.123_34; //-1.0
        float f = l++ + 10 + ++x - (float) m; //f = -100 l=-53 -1
        l = (long) f / 1000; //-57 -100    -100
        System.out.println(l); //0
    }
}