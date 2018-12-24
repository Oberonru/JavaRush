package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args)
    {

        System.out.println(convertEurToUsd(5,2.2));
        System.out.println(convertEurToUsd(1,4.2));
    }

    public static double convertEurToUsd(int eur, double course)
    {
         double dollar  = eur*course;
        return  dollar;
    }
}
