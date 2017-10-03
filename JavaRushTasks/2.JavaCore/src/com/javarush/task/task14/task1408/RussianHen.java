package com.javarush.task.task14.task1408;

/**
 * 27.09.2017
 * 22:24
 * Created by Roxy
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
