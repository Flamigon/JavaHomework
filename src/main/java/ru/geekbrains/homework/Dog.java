package ru.geekbrains.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Dog extends Animal {
    int x  = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
    double y = ThreadLocalRandom.current().nextDouble(-0.5, 1 + 1);
    double z= ThreadLocalRandom.current().nextDouble(-5, 10);

    public Dog() {
        this.speciesName = "Собака";
        this.name = "Барон";
        this.run = 500 + x;
        this.jump = 0.5 + y;
        this.swim = 10 + z;
    }

}
