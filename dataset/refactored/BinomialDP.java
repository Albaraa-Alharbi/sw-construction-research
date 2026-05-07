/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class BinomialDP {

    public static int calculateBinomialCoefficient(int total, int selection) {
        int[][] coefficients = new int[total + 1][selection + 1];

        for (int currentTotal = 0; currentTotal <= total; currentTotal++) {
            for (int currentSelection = 0; currentSelection <= Math.min(currentTotal, selection); currentSelection++) {
                if (currentSelection == 0 || currentSelection == currentTotal) {
                    coefficients[currentTotal][currentSelection] = 1;
                } else {
                    coefficients[currentTotal][currentSelection] = coefficients[currentTotal - 1][currentSelection - 1] + coefficients[currentTotal - 1][currentSelection];
                }
            }
        }
        return coefficients[total][selection];
    }

    public static void main(String[] args) {
        System.out.println("C(5, 2) = " + calculateBinomialCoefficient(5, 2));
        System.out.println("C(6, 3) = " + calculateBinomialCoefficient(6, 3));
    }
}