/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Arrays;
import java.util.Random;

public class LoadFactorTest {

    public static void main(String[] args) {

        // Number of keys
        int numberOfKeys = 10;

        // Load factor α = 0.5 → M = 2 × numberOfKeys
        int tableSize = 2 * numberOfKeys;

        // Create empty hash table
        int[] hashTable = new int[tableSize];
        Arrays.fill(hashTable, -1);

        Random randomGenerator = new Random();

        // Insert numberOfKeys random keys
        for (int keyIndex = 0; keyIndex < numberOfKeys; keyIndex++) {
            int randomKey = randomGenerator.nextInt(100) + 1;
            int hashIndex = randomKey % tableSize;

            while (hashTable[hashIndex] != -1) {
                hashIndex = (hashIndex + 1) % tableSize;
            }

            hashTable[hashIndex] = randomKey;
        }

        // Print table
        System.out.println("Hash Table:");
        System.out.println(Arrays.toString(hashTable));

        // Perform 10 random searches
        int totalComparisonCount = 0;

        for (int searchAttempt = 1; searchAttempt <= 10; searchAttempt++) {
            int searchKey = randomGenerator.nextInt(100) + 1;
            int hashIndex = searchKey % tableSize;
            int comparisonCount = 1;

            while (hashTable[hashIndex] != searchKey && hashTable[hashIndex] != -1) {
                hashIndex = (hashIndex + 1) % tableSize;
                comparisonCount++;
            }

            System.out.println(
                searchAttempt + ") Searched Key = " + searchKey +
                ", Comparisons = " + comparisonCount
            );

            totalComparisonCount += comparisonCount;
        }

        // Average comparisons
        double averageComparisonResult = totalComparisonCount / 10.0;
        System.out.println("Average Comparisons: " + averageComparisonResult);
    }
}