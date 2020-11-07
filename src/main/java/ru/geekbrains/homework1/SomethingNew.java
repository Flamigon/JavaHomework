package ru.geekbrains.homework1;

public class SomethingNew {
    public static void main (String[] args) {
        byte by = 2;
        short sh = 10000;
        int in = 200000;
        long lo = 30000L;
        float fl = 3.6f;
        double dou = 19.99d;
        char ch = '*';
        boolean bo = false;
        String sentence = "The numbers, Mason";
        System.out.println(by  + "\n" + sh + "\n" + in + "\n" + lo + "\n" + fl + "\n" + dou + "\n" + ch + "\n" + bo + "\n" + sentence + "\n");
        System.out.println(calc(5, 3, 12, 4));
        System.out.println("\n" + isBetween(5, 9));
        System.out.println("\n" + positive(0));
        System.out.println("\n" + negative(-1));
        System.out.println("\n" + hello("Артем"));
        System.out.println("\n" + year(1100));
    }
    public static int calc(int a, int b, int c, int d) {
        return (a * (b + c/d));
    }
    public static String isBetween(int e, int f) {
        if (10 <= (e + f) && (e + f) <= 20) {
            return "true";
        } else {
            return "false";
        }
    }
    public static String positive(int g) {
        if (g >= 0) {
            return "положительное";
        } else {
            return "отрицательное";
        }
    }
    public static String negative(int h) {
        if (h < 0) {
            return "true";
        } else {
            return "";
        }
    }
    public static String hello(String name) {
        return("Привет, " + name + "!");
    }
    public static String year(int y) {
        if ((y % 4 == 0) && (y % 100 != 0)) {
            return "Високосный год";
        } else {
            if (y % 400 == 0) {
                return "Високосный год";
            }
            else {
                return "Невисокосный год";
            }
        }
    }
}
