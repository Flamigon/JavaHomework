package ru.geekbrains.homework;

import java.util.Scanner;

public class Lesson6main {
    public static void main(String[] args) {
        AnimalStats();
    }

    public static void AnimalStats() {
        System.out.println("Выберите животное:");
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Пожалуйста введите 'Кот' или 'Собака'");
            choice = sc.nextLine();
        } while (!choice.equals("Кот") && !choice.equals("Собака"));
        if (choice.equals("Кот")) {
            Cat cat1 = new Cat();
            cat1.animalInfo();
            System.out.println("Бег: " + cat1.run + " метров" + "\n" + "Прыжок: " + cat1.jump + " метров" + "\n" + "Плавание: не умеет");
            cat1.animalRun();
            cat1.animalJump();
            cat1.animalSwim();
        } else {
            Dog dog1 = new Dog();
            dog1.animalInfo();
            System.out.println("Бег: " + dog1.run + " метров" + "\n" + "Прыжок: " + dog1.jump + " метров" + "\n" + "Плавание: "+ dog1.swim + " метров");
            dog1.animalRun();
            dog1.animalJump();
            dog1.animalSwim();
        }
    }
}
