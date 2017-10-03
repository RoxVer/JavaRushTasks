package com.javarush.task.task12.task1222;

/* 
Больше не Пушистик
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик"); //к строчке Я пушистик не доходит, потому что вызывается переопределенный метод наследника
        //до этого наследовалось поле String name со значением null
        //происходит динамическое определение, какой именно объект на самом деле содержится в переменной и вызывается метод этого типа

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name){
            this.name = "Я - кот";
        }
    }
}
