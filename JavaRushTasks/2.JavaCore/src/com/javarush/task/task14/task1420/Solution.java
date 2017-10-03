package com.javarush.task.task14.task1420;

/* 
НОД
Наибольший общий делитель
Алгоритм Эвклида
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String oneS = reader.readLine();
        String twoS = reader.readLine();
        int a = Integer.parseInt(oneS);
        int b = Integer.parseInt(twoS);

        if (a <= 0 || b <= 0) throw new Exception();

        int max = Math.max(a, b);
        for (int i = max; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
    /*public static int doNod(int a, int b){
        while (b != 0) {
            int tmp = a % b;   //17 % 13 = 4
            a = b;             //a = 13
            b = tmp;           //b = 4
        }
        return a; //1
    }*/
/*
Надо строить уменьшающуюся последовательность чисел, первое число которой это максимальное
из двух целых, чей НОД мы ищем, второе — соответственно, минимальное из двух целых,
а каждое следующее представляет из себя остаток от деления пред-предыдущего на предыдущее.
Последний ненулевой член последовательности и есть НОД.

Чтобы было легче воспринять, проиллюстрируем это примером. Найдем НОД для чисел 13 и 17.

1 шаг. Сформируем два первых числа последовательности
17, 13

2 шаг. Третье число последовательности — остаток от деления 17 на 13, то есть 4
17, 13, 4

3 шаг. Четвертое число последовательности — остаток от деления 13 на 4, то есть 1
17, 13, 4, 1

4 шаг. Пятое число последовательности — остаток от деления 4 на 1, то есть 0
17, 13, 4, 1, 0

Перед нулем стоит 1 — последний ненулевой член последовательности.
Следовательно, это и есть искомый НОД. С учетом того, что и 13 и 17 — простые числа,
это действительно так.
 */
