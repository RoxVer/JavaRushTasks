package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int height;
        private int weight;
        private boolean gender;
        private String race = "Caucasian";
        private String skinColor = "White";

        public Human(){
        }

        public Human(String race, String skinColor){
            this.race = race;
            this.skinColor = skinColor;
        }

        public Human(int age, int height, int weight, boolean gender){
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.gender = gender;
        }

        public Human(int age, int height, int weight){
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(int height, int weight){
            this.height = height;
            this.weight = weight;
        }

        public Human(int age){
            this.age = age;
        }

        public Human(int age, String race){
            this.age = age;
            this.race = race;
        }

        public Human(int age, boolean gender){
            this.age = age;
            this.gender = gender;
        }

        public Human(boolean gender){
            this.gender = gender;
        }

        public Human(boolean gender, String race, String skinColor){
            this.gender = gender;
            this.race = race;
            this.skinColor = skinColor;
        }

        // напишите тут ваши переменные и конструкторы
    }
}
