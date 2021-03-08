package com.company;

import java.util.Scanner;

public class ProblemSevenPrintADeckOfFiftyTwoCards {
    public static void main(String[] args) {

//        Problem 7. Print a Deck of 52 Cards
//        Write a program that generates and prints all possible cards from a standard deck of 52 cards (without the jokers).
//
//        The cards should be printed using the classical notation (like 5 of spades, A of hearts, 9 of clubs; and K of diamonds).
//        The card faces should start from 2 to A.
//        Print each card face in its four possible suits: clubs, diamonds, hearts and spades.
//        Use 2 nested for-loops and a switch-case statement.
//        Note: You may use the suit symbols instead of text.

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cardIndex = 0;

        if (input.length() == 2 || Character.isDigit(input.charAt(0))) {
            cardIndex = Integer.parseInt(input);
        } else {
            switch (input) {
                case "J":
                    cardIndex = 11;
                    break;
                case "Q":
                    cardIndex = 12;
                    break;
                case "K":
                    cardIndex = 13;
                    break;
                case "A":
                    cardIndex = 14;
                    break;
            }
        }
        for (int i = 2; i <= cardIndex; i++) {
            String cardSymbol = "";
            if (i > 10) {
                switch (i) {
                    case 11:
                        cardSymbol = "J";
                        break;
                    case 12:
                        cardSymbol = "Q";
                        break;
                    case 13:
                        cardSymbol = "K";
                        break;
                    default:
                        cardSymbol = "A";
                }
            } else {
                cardSymbol = Integer.toString(i);
            }
            System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cardSymbol, cardSymbol, cardSymbol, cardSymbol);
        }

    }
}
