/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class GradeCalculator {
    String studentName; // Student Name
    int studentId;   // Student ID
    double[] gradesList; // Grades List

    public GradeCalculator(String studentName, int studentId, double[] gradesList) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.gradesList = gradesList;
    }

    public double calculateAverage() { // Calculate Average
        double total = 0;
        for (double grade : gradesList) {
            total += grade;
        }
        return total / gradesList.length;
    }
}