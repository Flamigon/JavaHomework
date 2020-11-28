package ru.geekbrains.homework;

public class Lesson7 {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat2 catArray[]= new Cat2[4];
        catArray[0] = new Cat2("Murzik", 12);
        catArray[1] = new Cat2("Barsik", 16);
        catArray[2] = new Cat2("Timur", 28);
        catArray[3] = new Cat2("Vasya", 10);
        plate.info();
        for (int i = 0; i < 4; i++) {
            catArray[i].eat(plate);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(catArray[i].name + ": " + catArray[i].satiety);
        }
        plate.info();
        System.out.println();
        System.out.println("После добавления еды в тарелку:");
        plate.increaseFood(20);
        plate.info();
    }
}
