package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

   public Friend(String year)
    {
        name = year;
    }
    public Friend(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, char se)
    {
        this.name = name;
        this.age = age;
        sex = se;
    }

    public static void main(String[] args) {

    }
}
