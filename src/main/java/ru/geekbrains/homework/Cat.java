package ru.geekbrains.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Animal {
    int x  = ThreadLocalRandom.current().nextInt(-50, 50 + 1);
    double y = ThreadLocalRandom.current().nextDouble(-1, 2 + 1);

    public Cat() {
        this.speciesName = "Кот";
        this.name = "Барсик";
        this.run = 200 + x;
        this.jump = 2 + y;
        this.swim = -1;
    }
}
