package ru.geekbrains.homework;

public class Cat2 {
    String name;
    int appetite;
    boolean satiety;
    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
        }
    }
}
