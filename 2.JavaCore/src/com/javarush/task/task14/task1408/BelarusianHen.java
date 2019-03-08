package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 3;
    }
    @Override
    public String getDescription() {

       return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " +  this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
