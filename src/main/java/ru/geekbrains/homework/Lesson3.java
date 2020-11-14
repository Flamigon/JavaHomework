package ru.geekbrains.homework;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
        int a = sc.nextInt();                                 // чтение целого числа в переменную a
        String b = sc.nextLine();                        // чтение введенной строки
        String c = sc.next();                               // слово до следующего пробела
        sc.close();    // после завершения работы со сканером его необходимо закрыть,
    }
}
