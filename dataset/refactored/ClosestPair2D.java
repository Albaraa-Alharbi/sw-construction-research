/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class ClosestPair2D {

    public static double calculateDistance(int[] point1, int[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }

    public static void main(String[] args) {
        int[][] pointArray = { {10, 20}, {15, 25}, {30, 5}, {12, 18}, {25, 30} };

        int totalPoints = pointArray.length;
        double minimumDistance = Double.MAX_VALUE;
        int closestPointIndex1 = -1, closestPointIndex2 = -1;

        for (int outerIndex = 0; outerIndex < totalPoints; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < totalPoints; innerIndex++) {
                double distance = calculateDistance(pointArray[outerIndex], pointArray[innerIndex]);
                if (distance < minimumDistance) {
                    minimumDistance = distance;
                    closestPointIndex1 = outerIndex;
                    closestPointIndex2 = innerIndex;
                }
            }
        }

        System.out.println(
            "Closest points: " + closestPointIndex1 + "(" + pointArray[closestPointIndex1][0] + "," + pointArray[closestPointIndex1][1] + ") and "
            + closestPointIndex2 + "(" + pointArray[closestPointIndex2][0] + "," + pointArray[closestPointIndex2][1] + ")"
            + " the distance = " + minimumDistance
        );
    }
}