package com.homework.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int dimensionRow = 0;
    static int dimensionCol = 0;


    public static void main(String[] args) {
        CharGenerator generateRandomString = new CharGenerator();
        int choice = 0;
	    do {
            System.out.println("[1] - Generate Table");
            System.out.println("[2] - Search for Occurrences");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String[][] gridDimension = new String[10][10];

                    System.out.print("Enter Row Size: ");
                    dimensionRow = scanner.nextInt();
                    System.out.print("Enter Column Size: ");
                    dimensionCol = scanner.nextInt();
                    System.out.println();
                    for (int i = 0; i < dimensionRow; i++) {
                        generateRandomString.generateChar();
                        for (int j = 0; j < dimensionCol; j++) {
                            for (Map.Entry<String, String> e : generateRandomString.pairKeyValue.entrySet())
                                System.out.print(e.getKey() + " " + e.getValue() + "\n");
                        }
                        System.out.print("\n");
                    }
                    break;
            }
        } while (choice != 5);
    }
}
