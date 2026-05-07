/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Arrays;

public class BruteForceKnapsack {

    public static class Result {
        int[] pickedItems;
        int totalValue;
        int totalWeight;
    }

    public static Result bruteKnapsack(int knapsackCapacity, int[] itemWeights, int[] itemValues) {
        int itemCount = itemWeights.length;

        int optimalValue = 0;
        int optimalWeight = 0;
        int[] optimalPickedItems = new int[itemCount];

        int subsetLimit = 1 << itemCount; // 2^n subsets

        for (int subsetMask = 0; subsetMask < subsetLimit; subsetMask++) {
            int currentWeight = 0, currentValue = 0;
            int[] pickedItems = new int[itemCount];

            for (int index = 0; index < itemCount; index++) {
                if ((subsetMask & (1 << index)) != 0) {
                    currentWeight += itemWeights[index];
                    currentValue += itemValues[index];
                    pickedItems[index] = 1;
                }
            }

            if (currentWeight <= knapsackCapacity && currentValue > optimalValue) {
                optimalValue = currentValue;
                optimalWeight = currentWeight;
                optimalPickedItems = Arrays.copyOf(pickedItems, itemCount);
            }
        }

        Result r = new Result();
        r.pickedItems = optimalPickedItems;
        r.totalValue = optimalValue;
        r.totalWeight = optimalWeight;
        return r;
    }

    public static void main(String[] args) {
        // Lab test case (C=10)
        int knapsackCapacity = 10;
        int[] itemWeights = {1, 1, 5, 3, 4, 1, 3, 3, 5, 3};
        int[] itemValues = {8, 10, 10, 4, 6, 9, 8, 8, 10, 7};

        Result r = bruteKnapsack(knapsackCapacity, itemWeights, itemValues);

        System.out.println("Picked vector: " + Arrays.toString(r.pickedItems));
        System.out.println("Total value: " + r.totalValue);
        System.out.println("Total weight: " + r.totalWeight);
    }
}