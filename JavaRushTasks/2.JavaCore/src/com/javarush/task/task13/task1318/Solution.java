package com.javarush.task.task13.task1318;

/*
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

        while (file.ready()) {
            System.out.println(file.readLine());
        }

        file.close();
        reader.close();
    }
}