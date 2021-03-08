package com.company;

import java.util.Scanner;

public class ProblemFourSmallerGreaterOrEqual {
    public static void main(String[] args) {


//        Problem 4. Smaller, greater or equal?
//        Write a program that reads from the console a sequence of n integer numbers
//        and returns these numbers on a single line with the correct sign
//        (<, > or =) between the numbers.

        Scanner scanner = new Scanner(System.in);

        int lowest = 0;
        int highest = 0;
        int input = 0;

        System.out.print("Please enter how many integer values will be entered: ");
        int n = Integer.parseInt(scanner.next());

        System.out.println("Please enter integers - each on new line: ");
        for (int i = 0; i <= n; i++) {
            scanner.nextLine();
            if (i == 0) {
//                lowest == highest == input;
            }
        }
    }
}
