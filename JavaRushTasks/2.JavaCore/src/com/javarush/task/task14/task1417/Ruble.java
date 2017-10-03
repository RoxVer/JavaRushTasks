package com.javarush.task.task14.task1417;

/**
 * 28.09.2017
 * 21:57
 * Created by Roxy
 */
public class Ruble extends Money {
    public Ruble (double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "RUB";
    }
}
