package ru.geekbrains.homework;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] mass1 = {1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] == 1) {
                mass1[i] = 0;
            } else {
                mass1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(mass1));
        int[] mass2 = new int[8];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = 3 * i;
        }
        System.out.println(Arrays.toString(mass2));
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] < 6) {
                mass3[i] = mass3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mass3));
        int[][] mass4 = new int[4][4];
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4[i].length; j++) {
                if (i == j) {
                    mass4[i][j] = 1;
                }
                System.out.print(mass4[i][j] + " ");
            }
            System.out.print("\n");
        }
        int[] mass5 = {26, 100, 12, 68, 100, 160, 24};
        int max = mass5[0];
        int min = mass5[1];
        for (int i = 0; i < mass5.length; i++) {
            if (max <= mass5[i]) {
                max = mass5[i];
            }
            if (min >= mass5[i]) {
                min = mass5[i];
            }
        }
        System.out.println(min + " " + max);
        int[] mass6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(mass6));
        int[] mass7 = {4, 5, 6, 7, 8, 9, 10};
        int n = 2;
        System.out.println(-n);
        System.out.println(movebyN(n, mass7));
    }

    public static String checkBalance(int[] mass6) {
        int sumleft = 0;
        int sumright = 0;
        String result = "";
        for (int i = 0; i < mass6.length; i++) {
            sumright = sumright + mass6[i];
        }
        for (int i = 0; i < mass6.length; i++) {
            sumleft = sumleft + mass6[i];
            sumright = sumright - mass6[i];
            if (sumleft == sumright) {
                result = "true";
            }
        }
        return result;
    }
    public static String movebyN(int n, int[] mass7) {
        if ( n >= 0 ) {
            for (int i = 0; i < mass7.length; i++) {
                if (mass7.length-1-i-n >= 0) {
                    mass7[mass7.length-1-i]=mass7[mass7.length-1-i-n];
                } else {
                    mass7[mass7.length-1-i]=0;
                }
            }
        } else {
            for (int i = 0; i < mass7.length; i++) {
                if (i-n < mass7.length) {
                    mass7[i]=mass7[i-n];
                } else {
                    mass7[i]=0;
                }
            }
        }
        System.out.println(Arrays.toString(mass7));
        return "";
    }
}
