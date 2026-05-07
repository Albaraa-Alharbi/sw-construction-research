/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Arrays;

public class LinearProbing {

    public static void main(String[] args) {

        // Keys to insert
        int[] keysToInsert = {15, 28, 19, 20, 33};

        // Hash table size
        int hashTableSize = 10;

        // Create table and mark empty cells with -1
        int[] hashTable = new int[hashTableSize];
        Arrays.fill(hashTable, -1);

        // Insert each key using linear probing
        for (int keyToInsert : keysToInsert) {
            int index = keyToInsert % hashTableSize;

            while (hashTable[index] != -1) {
                index = (index + 1) % hashTableSize;
            }

            hashTable[index] = keyToInsert;
        }

        // Print final table
        System.out.println("Final Hash Table:");
        System.out.println(Arrays.toString(hashTable));
    }
}