package ru.geekbrains.homework;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee() {
        name = "Иванов Иван Иванович";
        position = "Системный администратор";
        email = "sample@gmail.com";
        phone = "+79001234567";
        salary = 55000;
        age = 25;
    }

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String info() {
        System.out.println( name + "\n" + position + "\n" + email + "\n" + phone + "\n" + salary + " \n" + "Возраст: " + age);
        return "";
    }
}
