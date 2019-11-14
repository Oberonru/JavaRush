package com.javarush.task.task32.task3210;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Используем RandomAccessFile
 * В метод main приходят три параметра:
 * 1) fileName - путь к файлу;
 * 2) number - число, позиция в файле;
 * 3) text - текст.
 * <p>
 * Считать текст с файла начиная с позиции number, длинной такой же как и длинна переданного текста в третьем параметре.
 * Если считанный текст такой же как и text, то записать в конец файла строку 'true', иначе записать 'false'.
 * Используй RandomAccessFile и его методы seek(long pos), read(byte[] b, int off, int len), write(byte[] b).
 * Используй один из конструкторов класса String для конвертации считанной строчки в текст.
 * <p>
 * <p>
 * Требования:
 * 1. В методе main класса Solution необходимо использовать RandomAccessFile, который должен использовать файл,
 * который приходит первым параметром.
 * 2. В методе main класса Solution программа должна устанавливать позицию в файле, которая передана во втором параметре.
 * 3. В методе main класса Solution программа должна считывать данные с файла при помощи метода
 * read(byte[] b, int off, int len).
 * 4. Запись должна происходить в конец файла.
 * 5. Если считанный текст такой же как и text, то программа должна записать в конец переданного файла строку 'true'.
 * 6. Если считанный текст НЕ такой же как и text, то программа должна записать в конец переданного файла строку 'false'.
 * Используем RandomAccessFile
 */

public class Solution {
    public static void main(String... args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        File file = new File(args[0]);
        byte[] bytes = new byte[args[2].getBytes().length];
        raf.seek(Integer.parseInt(args[1]));
        raf.read(bytes, 0, args[2].getBytes().length);

        String readText = new String(bytes);
        raf.seek(raf.length());

        String booleanString = readText.equals(args[2]) ? "true" : "false";
        raf.write(booleanString.getBytes());
        raf.close();
    }
}
