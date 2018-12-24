package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new
                InputStreamReader(System.in));
        String name = reader.readLine();
        int count = Integer.parseInt(reader.readLine());
        System.out.print(name + "захватит мир через " + count + "лет. Му-ха-ха!");
    }
}
