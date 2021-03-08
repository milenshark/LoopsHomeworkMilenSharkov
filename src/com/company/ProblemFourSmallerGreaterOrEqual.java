package com.company;

import java.util.Scanner;

public class ProblemFourSmallerGreaterOrEqual {
    public static void main(String[] args) {

//        Problem 4. Smaller, greater or equal?
//        Write a program that reads from the console a sequence of n integer numbers
//        and returns these numbers on a single line with the correct sign
//        (<, > or =) between the numbers.

        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int n, m = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < lines; i++) {

            n = scanner.nextInt();
            if (i == 0) {
                stringBuilder.append(String.format("%d", n));
            } else {
                if (m < n) {
                    stringBuilder.append(String.format("<%d", n));
                } else if (m > n) {
                    stringBuilder.append(String.format(">%d", n));
                } else {
                    stringBuilder.append(String.format("=%d", n));
                }
            }
            m = n;
        }
        System.out.println(stringBuilder);
    }
}
