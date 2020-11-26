package ru.geekbrains.homework;

import java.util.Scanner;

public class Animal {
    String speciesName;
    String name;
    int run;
    double jump;
    double swim;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();
        System.out.println(speciesName + " " + name + ":");
        System.out.println();
    }

    public void animalRun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Бег: введите длину");
        int a = sc.nextInt();
        if ( a <= run  && a >= 0 ) {
            System.out.println("run: true");
        } else {
            System.out.println("run: false");
        }
        System.out.println();
    }

    public void animalJump() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Прыжок: введите высоту препятствия");
        double a = sc.nextDouble();
        if ( a <= jump  && a >= 0 ) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
        System.out.println();
    }

    public void animalSwim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Плавание: введите длину");
        double a = sc.nextDouble();
        if ( a <= swim  && a >= 0 ) {
            System.out.println("swim: true");
        } else {
            System.out.println("swim: false");
        }
        System.out.println();
    }


}
