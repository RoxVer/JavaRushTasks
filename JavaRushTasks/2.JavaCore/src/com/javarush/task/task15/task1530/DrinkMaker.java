package com.javarush.task.task15.task1530;

/**
 * 03.10.2017
 * 20:57
 * Created by Roxy
 */
public abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
