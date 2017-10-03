package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        String listGl = "";
        String listSo = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c != ' ') {
                if (isVowel(c) == true) {
                    listGl = listGl + c + " ";
                } else {
                    listSo = listSo + c + " ";
                }
            }
        }

        System.out.println(listGl);
        System.out.println(listSo);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}