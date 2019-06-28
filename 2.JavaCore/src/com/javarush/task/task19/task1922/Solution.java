package com.javarush.task.task19.task1922;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();
    public static Map<String, String> wordsMap = new HashMap<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

        while (reader1.ready()) {
            int sum = 0;
            String currentString = reader1.readLine();
            String[] strings = currentString.split(" ");
            firstList = Arrays.asList(strings);

            for (String element : words) {
                sum += Collections.frequency(firstList, element);
            }
//            for (String el : firstList) {
//                if (wordsMap.get(el) != null) {
//                    sum++;
//                }
            if (sum == 2) {
                secondList.add(currentString);
            }
        }

        for (String element : secondList) {
            System.out.println(element);
        }
        reader.close();
        reader1.close();
    }
}
