package com.javarush.task.task05.task0527;

/* 
Том и Джерри
Том и Джерри
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.


Требования:
1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog psinka = new Dog ( "Pes", 10, 100);
        Cat barsik = new Cat ( "Barsik" , 1, 12);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public  static  class  Dog
    {
        String name;
        int skill;
        int weight;

        Dog(String name, int skill, int we)
        {
            this.name = name;
            this.skill = skill;
            weight = we;
        }

    }

    public  static class Cat
    {
        String name;
        int skill;
        int weight;

        Cat(String name, int skill, int weight)
        {
            this.name = name;
            this.skill = skill;
            this.weight = weight;
        }
    }

    //напишите тут ваш код
}
