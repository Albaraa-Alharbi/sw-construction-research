/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class QuickSort {

    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivotIndex = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, highIndex);
        }
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int pivotValue = array[highIndex];
        int i = lowIndex - 1;

        for (int j = lowIndex; j < highIndex; j++) {
            if (array[j] < pivotValue) {
                i++;
                int temporaryValue = array[i];
                array[i] = array[j];
                array[j] = temporaryValue;
            }
        }

        int temporaryValue = array[i + 1];
        array[i + 1] = array[highIndex];
        array[highIndex] = temporaryValue;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {45, 68, 90, 29, 34, 89, 17};

        System.out.print("Before sorting: ");
        for (int element : array) System.out.print(element + " ");

        quickSort(array, 0, array.length - 1);

        System.out.println();
        System.out.print("After sorting: ");
        for (int element : array) System.out.print(element + " ");
    }
}