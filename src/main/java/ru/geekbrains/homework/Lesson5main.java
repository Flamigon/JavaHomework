package ru.geekbrains.homework;

public class Lesson5main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.info();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan 1", "Engineer", "ivivan@mailbox.com", "892312312", 25000, 25);
        persArray[1] = new Employee("Ivanov Ivan 2", "Engineer", "ivivan@mailbox.com", "892312312", 35000, 35);
        persArray[2] = new Employee("Ivanov Ivan 3", "Engineer", "ivivan@mailbox.com", "892312312", 49000, 49);
        persArray[3] = new Employee("Ivanov Ivan 4", "Engineer", "ivivan@mailbox.com", "892312312", 28000, 28);
        persArray[4] = new Employee("Ivanov Ivan 5", "Engineer", "ivivan@mailbox.com", "892312312", 41000, 41);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 40) {
                persArray[i].info();
                System.out.println();
            }
        }
    }
}
