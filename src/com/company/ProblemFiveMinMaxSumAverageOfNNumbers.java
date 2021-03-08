package com.company;

import java.util.Scanner;

public class ProblemFiveMinMaxSumAverageOfNNumbers {
    public static void main(String[] args) {

//        Problem 5. Min, Max, Sum and Average of N Numbers
//        Write a program that reads from the console a sequence of n integer numbers and returns the minimal,
//        the maximal number, the sum and the average of all numbers (displayed with 2 digits after the decimal point).

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer value: ");
        int n = Integer.parseInt(scanner.nextLine());
        double a = 0;

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        double average = 0;

        for (int i = 0; i < n; i++) {
            a = Double.parseDouble(scanner.nextLine());
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
            sum += a;
        }

        average = sum / n;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + average);
    }
}
