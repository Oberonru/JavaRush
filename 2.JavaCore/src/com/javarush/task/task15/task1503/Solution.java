package com.javarush.task.task15.task1503;

/**
 * ООП - машинки
 * 1. Для вывода используй только переменные из класса Constants.
 * 2. В классе Ferrari реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
 * 3. В классе Lanos реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
 * 4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
 * 5. Создайте public static класс CheapCar(ДешеваяМашина).
 * 6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
 * 7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
 * 8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
 * 9. В классах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа
 * так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
 * <p>
 * <p>
 * Требования:
 * 1. Класс Solution должен содержать public static класс LuxuriousCar.
 * 2. Класс Solution должен содержать public static класс CheapCar.
 * 3. Класс Ferrari должен быть потомком класса LuxuriousCar.
 * 4. Класс Lanos должен быть потомком класса CheapCar.
 * 5. Метод printlnDesire в классе LuxuriousCar, должен выводить на экран фразу "Я хочу ездить на роскошной машине".
 * 6. Метод printlnDesire в классе CheapCar, должен выводить на экран фразу "Я хочу ездить на дешевой машине".
 * 7. Метод printlnDesire в классе Ferrari, должен выводить на экран фразу "Я хочу ездить на Феррари".
 * 8. Метод printlnDesire в классе Lanos, должен выводить на экран фразу "Я хочу ездить на Ланосе".
 * 9. Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире, чем в их классах родителях.
 * ООП - машинки
 */

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class LuxuriousCar extends Constants {
        void printlnDesire() {
            StringBuilder sb = new StringBuilder();
            sb.append(WANT_STRING);
            System.out.println(sb.append(LUXURIOUS_CAR));
        }
    }

    public static class CheapCar {
        void printlnDesire() {
            StringBuilder sb = new StringBuilder();
            sb.append(Constants.WANT_STRING);
            System.out.println(sb.append(Constants.CHEAP_CAR));
        }
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            StringBuilder sb = new StringBuilder();
            sb.append(WANT_STRING);
            System.out.println(sb.append(FERRARI_NAME));
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            StringBuilder sb = new StringBuilder();
            sb.append(Constants.WANT_STRING);
            System.out.println(sb.append(Constants.LANOS_NAME));
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}
