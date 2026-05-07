/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class GrdEvaluator {
    
    public String determineLetterGrade(double score) { // score: value/score
        String letterGrade; // letterGrade: letter grade
        
        if (score >= 95) {
            letterGrade = "A+";
        } else if (score >= 90) {
            letterGrade = "A";
        } else if (score >= 85) {
            letterGrade = "B+";
        } else if (score >= 80) {
            letterGrade = "B";
        } else if (score >= 75) {
            letterGrade = "C+";
        } else if (score >= 70) {
            letterGrade = "C";
        } else if (score >= 65) {
            letterGrade = "D+";
        } else if (score >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        return letterGrade;
    }
}