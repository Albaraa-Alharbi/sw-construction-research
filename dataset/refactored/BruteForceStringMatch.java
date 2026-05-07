/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Scanner;

public class BruteForceStringMatch {

    public static int bfSearch(String inputText, String searchPattern) {
        int textLength = inputText.length();
        int patternLength = searchPattern.length();

        for (int currentIndex = 0; currentIndex <= textLength - patternLength; currentIndex++) {
            int matchIndex = 0;
            while (matchIndex < patternLength && inputText.charAt(currentIndex + matchIndex) == searchPattern.charAt(matchIndex)) {
                matchIndex++;
            }
            if (matchIndex == patternLength) return currentIndex;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your text: ");
        String inputText = scanner.nextLine();

        System.out.print("Your pattern: ");
        String searchPattern = scanner.nextLine();

        int matchIndex = bfSearch(inputText, searchPattern);

        if (matchIndex != -1) {
            System.out.println("Match found at index: " + matchIndex);
        } else {
            System.out.println("No match found");
        }
    }
}