package com.company;

import java.util.Scanner;

public class ProblemTwoNumbersNotDivisibleByThreeAndSeven {
    public static void main(String[] args) {

//        Problem 2. Numbers Not Divisible by 3 and 7
//        Write a program that enters from the console a positive integer n and prints all the numbers from 1 to n
//        not divisible by 3 or 7, on a single line, separated by a space.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer value: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0) {
                continue;
            } else if (i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
