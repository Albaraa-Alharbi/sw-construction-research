/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Scanner;

public class FindGCD {

    public static int calculateGCD(int firstNumber, int secondNumber) {
        int minimumValue = Math.min(firstNumber, secondNumber);
        int greatestCommonDivisor = 1;

        for (int currentDivisor = 1; currentDivisor <= minimumValue; currentDivisor++) {
            if (firstNumber % currentDivisor == 0 && secondNumber % currentDivisor == 0) {
                greatestCommonDivisor = currentDivisor;
            }
        }
        return greatestCommonDivisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("Do not enter zero");
            return;
        }

        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + calculateGCD(firstNumber, secondNumber));
    }
}