package com.javarush.task.task32.task3202;

import java.io.*;

/**
 * Читаем из потока
 * Реализуй логику метода getAllDataFromInputStream. Он должен вернуть StringWriter, содержащий все данные из
 * переданного потока.
 * Возвращаемый объект ни при каких условиях не должен быть null.
 * Метод main не участвует в тестировании.
 * <p>
 * <p>
 * Требования:
 * 1. Публичный статический метод getAllDataFromInputStream (InputStream) должен существовать.
 * 2. Метод getAllDataFromInputStream (InputStream) должен возвращать StringWriter.
 * 3. Метод getAllDataFromInputStream (InputStream) должен вернуть StringWriter, который содержит все данные из
 * переданного потока.
 * 4. Возвращаемый объект ни при каких условиях не должен быть null.
 * Читаем из потока
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        if (is == null) {
            return new StringWriter();
        }
        StringWriter stringWriter = new StringWriter();
        InputStreamReader isr = new InputStreamReader(is);
        while (isr.ready()) {
            stringWriter.write(isr.read());
        }
        return stringWriter;
    }
}