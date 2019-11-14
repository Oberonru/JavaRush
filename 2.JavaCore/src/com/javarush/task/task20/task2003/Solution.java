package com.javarush.task.task20.task2003;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
 * Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
 * Реализуй логику записи в файл и чтения из файла для карты properties.
 * <p>
 * Требования:
 * •	Метод fillInPropertiesMap должен считывать данные с консоли.
 * •	Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.
 * •	Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
 * •	Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
 * •	Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
 */
public class Solution {
    public static Map<String, String> properties = new HashMap<>();


    public void fillInPropertiesMap() throws IOException, Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        load(fis);
        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties pr = new Properties();
        pr.putAll(properties);
        pr.save(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties pr = new Properties();
        pr.load(inputStream);
        properties.putAll((Map)pr);
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
