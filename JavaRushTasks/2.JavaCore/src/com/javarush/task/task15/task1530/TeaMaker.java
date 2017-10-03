package com.javarush.task.task15.task1530;

/**
 * 03.10.2017
 * 21:00
 * Created by Roxy
 */
public class TeaMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    public void pour() {
        System.out.println("Заливаем кипятком");
    }

    @Override
    public void makeDrink() {
        super.makeDrink();
    }
}
