package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while(true){
            }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while(true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }
    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
            try {
                this.join();
            } catch (InterruptedException e) {
            }
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 0;
            String string = "";
            try {
                while (true) {
                    string = reader.readLine();
                    if (string.equals("N")) {
                        break;
                    }
                    if (string.matches("\\-?\\d*")) { //if it is a number
                        number = number + Integer.parseInt(string);
                    }
                }
            } catch (IOException e){
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
    }
}