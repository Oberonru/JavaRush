package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat grandfather = new Cat(grandfatherName, null, null);

        String grandmotherName = reader.readLine();
        Cat grandmother = new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,grandmother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, catMother, father);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, father);

        System.out.println(grandfather.toString());
        System.out.println(grandmother.toString());
        System.out.println(father.toString());
        System.out.println(catMother.toString());
        System.out.println(son.toString());
        System.out.println(catDaughter.toString());
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent == null && parent2 == null) {
                return "The cat's name is " + name + ", no mother" + ", no father";
            }
            if (parent == null) {
                return "The cat's name is " + name + ", no mother" + ", father is " + parent2.name ;
            }
            if (parent2 == null) {
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father" ;
            }
            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;
        }
    }
}
