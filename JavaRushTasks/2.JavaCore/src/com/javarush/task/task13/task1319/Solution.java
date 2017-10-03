package com.javarush.task.task13.task1319;

import java.io.IOException;

/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 */
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String input = "";
        String exit = "exit";

        do {
            input = reader.readLine();
            writer.write(input);
            writer.newLine();
        } while (!input.equals(exit));

        reader.close();
        writer.close();
    }
}
