package com.javarush.task.task31.task3107;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Исследуем Path
 * Почитай про все методы класса Path.
 * Найди такой, который создает относительный путь между текущим и переданным путем.
 * Реализуй логику метода getDiffBetweenTwoPaths, он должен возвращать относительный путь.
 * Метод main не участвует в тестировании.
 *
 *
 * Требования:
 * 1. Класс Solution должен содержать метод Path getDiffBetweenTwoPaths(Path path1, Path path2).
 * 2. Метод Path getDiffBetweenTwoPaths(Path path1, Path path2) должен быть статическим.
 * 3. Метод getDiffBetweenTwoPaths должен возвращать относительный путь между первым аргументом и вторым.
 * 4. Для реализации метода getDiffBetweenTwoPaths используй правильный метод объекта Path.
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {

            fileData = new ConcreteFileData(Files.isHidden(Paths.get(pathToFile)), Files.isExecutable(Paths.get(pathToFile)),
                    Files.isDirectory(Paths.get(pathToFile)), Files.isWritable(Paths.get(pathToFile)));
        } catch (Exception e) {
            fileData = new NullFileData(new Exception());
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
