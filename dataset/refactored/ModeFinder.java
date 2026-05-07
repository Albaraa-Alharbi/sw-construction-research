/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Arrays;

public class ModeFinder {

    public static int findMode(int[] numbers) {
        Arrays.sort(numbers);

        int modeValue = numbers[0];
        int currentValue = numbers[0];
        int currentCount = 1;
        int highestCount = 1;

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] == currentValue) {
                currentCount++;
            } else {
                if (currentCount > highestCount) {
                    highestCount = currentCount;
                    modeValue = currentValue;
                }
                currentValue = numbers[index];
                currentCount = 1;
            }
        }

        if (currentCount > highestCount) {
            modeValue = currentValue;
        }

        return modeValue;
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 5, 3, 3, 3, 2, 5, 1, 5};
        int modeValue = findMode(values);

        System.out.println("Mode of array: " + modeValue);
    }
}