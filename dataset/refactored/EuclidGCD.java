/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Scanner;

public class EuclidGCD {

    public static int calculateGCD(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("Both numbers cannot be zero.");
            return;
        }

        System.out.println("GCD is: " + calculateGCD(firstNumber, secondNumber));
    }
}