package com.javarush.task.task18.task1815;

import java.util.List;

/**
 * 9
 * Таблица
 * Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
 * Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
 * Метод getHeaderText должен возвращать текст в верхнем регистре - используйте метод toUpperCase().
 * <p>
 * <p>
 * Требования:
 * 1. Класс TableInterfaceWrapper должен реализовывать интерфейс TableInterface.
 * 2. Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа TableInterface.
 * 3. Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
 * 4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
 * 5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
 * Таблица
 */

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}