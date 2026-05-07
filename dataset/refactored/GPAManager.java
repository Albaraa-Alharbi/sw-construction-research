/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class GPAManager {
    double[] gradesList; // Grades list (points: 4.0, 3.5, etc.)
    int[] creditHours;    // Credit hours list

    public GPAManager(double[] grades, int[] credits) {
        this.gradesList = grades;
        this.creditHours = credits;
    }

    public double calculateFinalGPA() { 
        double totalQualityPoints = 0; // Total quality points
        int totalCreditHours = 0;   // Total credit hours
        
        for (int index = 0; index < gradesList.length; index++) {
            totalQualityPoints += gradesList[index] * creditHours[index];
            totalCreditHours += creditHours[index];
        }
        
        if (totalCreditHours == 0) return 0;
        
        return totalQualityPoints / totalCreditHours;
    }
}