package com.javarush.task.task14.task1408;

/**
 * 27.09.2017
 * 22:24
 * Created by Roxy
 */
public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
