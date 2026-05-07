/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class FibDP {

    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        int[] fibonacciValues = new int[number + 1];
        fibonacciValues[0] = 0;
        fibonacciValues[1] = 1;

        for (int index = 2; index <= number; index++) {
            fibonacciValues[index] = fibonacciValues[index - 1] + fibonacciValues[index - 2];
        }

        return fibonacciValues[number];
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("F(" + number + ") = " + fibonacci(number));
    }
}