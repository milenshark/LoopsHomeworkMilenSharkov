package com.company;

import java.util.Scanner;

public class ProblemEightCalculateTheSum {
    public static void main(String[] args) {

//        Problem 8. Calculate 1 + 1!/X + 2!/X^2 + … + N!/X^N
//        Write a program that, for a given two integer numbers n and x,
//        calculates the sum S = 1 + 1!/x + 2!/x2 + … + n!/x^n.
//
//        Use only one loop. Print the result with 5 digits after the decimal point.
////      Note that each element can be calculated from the previous by this "formula": (previous_element) * i / x

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number N: ");
        double n = Double.parseDouble(scanner.next());
        System.out.print("Please enter integer number X: ");
        double x = Double.parseDouble(scanner.next());

        double result = 1;
        int ifac = 1;

        for (int i = 1; i <= n ; i++) {
            ifac = 1;
            for (int j = i; j >= 1; j--) {
                ifac *=j;
            }
            result += ifac / Math.pow(x, i);
        }
        System.out.println(result);
    }
}
