package ru.geekbrains.homework;

import java.util.Arrays;

public class Сотрудник {
    static String ФИО;
    static String должность;
    static String email;
    static String телефон;
    static String зарплата;
    static int возраст;

    public Сотрудник() {
        ФИО = "Иванов Иван Иванович";
        должность = "Системный администратор";
        email = "sample@gmail.com";
        телефон = "+79001234567";
        зарплата = "55 тыс. рублей";
        возраст = 25;
    }

    public Сотрудник(String ФИО, String должность, String email, String телефон, String зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public static String info() {
        System.out.println( ФИО + "\n" + должность + "\n" + email + "\n" + телефон + "\n" + зарплата + " \n" + "Возраст: " + возраст);
        return "";
    }

    public static void main(String[] args) {
        Сотрудник сотрудник1 = new Сотрудник();
        info();

        Сотрудник[] persArray = new Сотрудник[5];
        persArray[0] = new Сотрудник("Ivanov Ivan 1", "Engineer", "ivivan@mailbox.com", "892312312", "30000 тыс. рублей", 31);
        persArray[1] = new Сотрудник("Ivanov Ivan 2", "Engineer", "ivivan@mailbox.com", "892312312", "30000 тыс. рублей", 40);
        persArray[2] = new Сотрудник("Ivanov Ivan 3", "Engineer", "ivivan@mailbox.com", "892312312", "30000 тыс. рублей", 45);
        persArray[3] = new Сотрудник("Ivanov Ivan 4", "Engineer", "ivivan@mailbox.com", "892312312", "30000 тыс. рублей", 48);
        persArray[4] = new Сотрудник("Ivanov Ivan 5", "Engineer", "ivivan@mailbox.com", "892312312", "30000 тыс. рублей", 24);

        System.out.println(persArray[1].возраст);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].возраст > 40) {
                info();
            }
        }
    }
}
