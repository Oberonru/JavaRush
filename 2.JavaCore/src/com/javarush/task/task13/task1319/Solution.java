package com.javarush.task.task13.task1319;

import java.io.*;

/**
 * Писатель в файл с консоли
 * 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 *
 *
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Создай и используй объект типа BufferedWriter.
 * 3. Программа не должна ничего читать из файловой системы.
 * 4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 * 5. Программа должна записать абсолютно все введенные строки (включая "exit")
 * в файл, каждую строчку с новой строки.
 * 6. Метод main должен закрывать объект типа BufferedWriter после использования.
 * 7. Метод main не должен выводить данные на экран.
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File fileDirectory = new File(reader.readLine());

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileDirectory));
            String inputText;
            while (!(inputText = reader.readLine()).equals("exit")) {
                fileWriter.write(inputText + "\r\n");
            }
            fileWriter.write("exit");
            reader.close();
            fileWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
