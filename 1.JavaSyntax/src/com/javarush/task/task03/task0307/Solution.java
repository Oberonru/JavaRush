package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args)
    {
        Zerg[] zerg = new Zerg[10];
        for (int i = 0; i < 10; i++)
        {
            zerg[i] = new Zerg();
            zerg[i].name = Integer.toString(i);
            System.out.println(zerg.name);
        }

    }

    public static class Zerg
    {
        public String name;
    }

   /* public static class Protoss
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }*/
}
