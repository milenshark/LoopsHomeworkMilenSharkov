package com.company;

import java.util.Scanner;

public class ProblemOneNumbersFromOneToN {
    public static void main(String[] args) {

//        Problem 1. Numbers from 1 to N
//        Write a program that enters from the console a positive integer n and prints all the numbers from 1 to n,
//        on a single line, separated by a space.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer value: ");
        int n = Integer.parseInt(scanner.nextLine());

        while (n <= 0) {
            System.out.print("Please enter a positive integer value: ");
            scanner.nextLine();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
