/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Arrays;

public class ElementUniqueness {

    public static void checkUniqueness(int[] inputArray) {
        Arrays.sort(inputArray);

        for (int index = 0; index < inputArray.length - 1; index++) {
            if (inputArray[index] == inputArray[index + 1]) {
                System.out.println("Not Unique");
                return;
            }
        }
        System.out.println("All elements are unique");
    }

    public static void main(String[] args) {
        int[] firstArray = {5, 3, 8, 1, 9};
        int[] secondArray = {4, 7, 2, 7, 1};

        System.out.print("Array 1: ");
        checkUniqueness(firstArray);

        System.out.print("Array 2: ");
        checkUniqueness(secondArray);
    }
}