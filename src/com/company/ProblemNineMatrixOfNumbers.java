package com.company;

import java.util.Scanner;

public class ProblemNineMatrixOfNumbers {
    public static void main(String[] args) {

//        Problem 9. Matrix of Numbers
//        Write a program that reads from the console a positive integer number n (1 ≤ n ≤ 20) and prints a matrix like in the examples below.
//
//        Use two nested loops.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer number n (1 ≤ n ≤ 20) = ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print(row + col + " ");

            }
            System.out.println();

        }
    }
}
