package com.javarush.task.task14.task1417;

/**
 * 28.09.2017
 * 21:57
 * Created by Roxy
 */
public class USD extends Money {
    public USD (double amount){ // джава не создает дефолтный конструктор, если есть параметры, поэтому мы создаем такой
        super(amount);          // конструктор как дефолтный только с параметром
    }

    public String getCurrencyName() {
        return "USD";
    }
}
