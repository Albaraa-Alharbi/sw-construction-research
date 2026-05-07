/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class RecursiveBinarySearch {

    public static int binarySearch(int[] sortedArray, int leftIndex, int rightIndex, int searchKey) {
        if (leftIndex > rightIndex) return -1;

        int midIndex = (leftIndex + rightIndex) / 2;

        if (sortedArray[midIndex] == searchKey)
            return midIndex;
        else if (searchKey < sortedArray[midIndex])
            return binarySearch(sortedArray, leftIndex, midIndex - 1, searchKey);
        else
            return binarySearch(sortedArray, midIndex + 1, rightIndex, searchKey);
    }

    public static void main(String[] args) {
        int[] sortedArray = {3, 5, 9, 12, 20, 34, 50};

        int existingKey = 20;
        int nonExistingKey = 7;

        int foundIndex = binarySearch(sortedArray, 0, sortedArray.length - 1, existingKey);
        int notFoundIndex = binarySearch(sortedArray, 0, sortedArray.length - 1, nonExistingKey);

        if (foundIndex != -1)
            System.out.println("Element " + existingKey + " found at index " + foundIndex);
        else
            System.out.println("Element " + existingKey + " not found.");

        if (notFoundIndex != -1)
            System.out.println("Element " + nonExistingKey + " found at index " + notFoundIndex);
        else
            System.out.println("Element " + nonExistingKey + " not found.");
    }
}