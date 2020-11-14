package ru.geekbrains.homework;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        guessing();
    }
    public static void guessing() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if ( a!=x ) {
                if ( a>x ) {
                    System.out.println("Введенное число больше загаданного");
                } else {
                    System.out.println("Введенное число меньше загадонного");
                }
            } else {
                System.out.println("Вы угадали. Повторить игру еще раз? 1 – да / 0 – нет");
                int b = sc.nextInt();
                if ( b>=0 && b <=1 ) {
                    switch (b) {
                        case 1:
                            guessing();
                            break;
                        case 0:
                            break;
                    }
                } else {
                    System.out.println("Пожалуйста, введите 1 или 0");
                }
                break;
            }
        }
        System.out.println("Вы не угадали. Повторить игру еще раз? 1 – да / 0 – нет");
        int b = sc.nextInt();
        if ( b>=0 && b <=1 ) {
            switch (b) {
                case 1:
                    guessing();
                    break;
                case 0:
                    break;
            }
        } else {
            System.out.println("Пожалуйста, введите 1 или 0");
        }
        sc.close();
    }
}
