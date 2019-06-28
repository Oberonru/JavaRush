package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Знакомство с properties
 * В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
 * Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
 * Реализуй логику записи в файл и чтения из файла для карты properties.
 * <p>
 * <p>
 * Требования:
 * 1. Метод fillInPropertiesMap должен считывать данные с консоли.
 * 2. Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.
 * 3. Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
 * 4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
 * 5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
 * Знакомство с properties
 */
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException, Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        load(fileInputStream);
        reader.close();
        fileInputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        PrintWriter printWriter = new PrintWriter(outputStream);
        for (Map.Entry<String, String> pair : properties.entrySet()) {
            printWriter.println(pair.getKey());
            printWriter.println(pair.getValue());
        }
        printWriter.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (inputStream.available() > 0) {
            properties.put(bufferedReader.readLine(), bufferedReader.readLine());
        }
        bufferedReader.close();
    }

    public static void main(String[] args) {

    }
}
