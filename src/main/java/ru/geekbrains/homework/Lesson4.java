package ru.geekbrains.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static final int SIZE = 5;
    public static final char[][] BOARD = new char[SIZE][SIZE];
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void init() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(BOARD[i], DOT_EMPTY);
        }
    }

    public static void print() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(BOARD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void UserTurn() {
        int x, y;
        do {
            System.out.println("Input coordinates");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            System.out.println();
        } while (!isValid(x,y));
        BOARD[x][y] = DOT_X;
    }

    public static boolean isValid(int x, int y) {
        if (x<0 || x>= SIZE || y < 0 || y >= SIZE) return false;
        return BOARD[x][y] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isValid(x, y));
        BOARD[x][y] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < 2; j++) {
                if (BOARD[i][j] == symb && BOARD[i][j+1] == symb && BOARD[i][j+2] == symb && BOARD[i][j+3] == symb) return true;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[i][j] == symb && BOARD[i+1][j] == symb && BOARD[i+2][j] == symb && BOARD[i+3][j] == symb) return true;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (BOARD[i][j] == symb && BOARD[i+1][j+1] == symb && BOARD[i+2][j+2] == symb && BOARD[i+3][j+3] == symb) return true;
                if (BOARD[i][SIZE-1-j] == symb && BOARD[i+1][SIZE-2-j] == symb && BOARD[i+2][SIZE-3-j] == symb && BOARD[i+3][SIZE-4-j] == symb) return true;
            }
        }
        return false;
    }

    public static boolean full() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        init();
        print();
        while (true) {
            UserTurn();
            System.out.println("User turn:");
            print();
            if (checkWin(DOT_X)) {
                System.out.println("Victory");
                break;
            }
            if (full()) {
                System.out.println("Draw");
                break;
            }
            System.out.println("AI turn:");
            aiTurn();
            print();
            if (checkWin(DOT_O)) {
                System.out.println("Defeat");
                break;
            }
            if (full()) {
                System.out.println("Draw");
                break;
            }
        }
    }
 }

