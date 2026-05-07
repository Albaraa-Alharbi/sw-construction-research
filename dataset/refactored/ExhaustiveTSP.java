/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

import java.util.Arrays;

public class ExhaustiveTSP {

    static class Result {
        int[] route;
        int distance;
    }

    public static Result solveTSP(int[][] distanceMatrix) {
        int numberOfNodes = distanceMatrix.length;

        boolean[] isVisited = new boolean[numberOfNodes];
        int[] route = new int[numberOfNodes + 1];

        route[0] = 0;
        isVisited[0] = true;

        Result optimalResult = new Result();
        optimalResult.distance = Integer.MAX_VALUE;
        optimalResult.route = new int[numberOfNodes + 1];

        backtrack(distanceMatrix, isVisited, route, 1, 0, optimalResult);
        return optimalResult;
    }

    private static void backtrack(int[][] distanceMatrix, boolean[] isVisited, int[] route, int currentPosition, int currentDistance, Result optimalResult) {
        int numberOfNodes = distanceMatrix.length;

        if (currentPosition == numberOfNodes) {
            int totalDistance = currentDistance + distanceMatrix[route[currentPosition - 1]][0];
            if (totalDistance < optimalResult.distance) {
                optimalResult.distance = totalDistance;
                optimalResult.route = Arrays.copyOf(route, numberOfNodes + 1);
                optimalResult.route[numberOfNodes] = 0;
            }
            return;
        }

        for (int nextNode = 1; nextNode < numberOfNodes; nextNode++) {
            if (!isVisited[nextNode]) {
                isVisited[nextNode] = true;
                route[currentPosition] = nextNode;

                backtrack(distanceMatrix, isVisited, route, currentPosition + 1, currentDistance + distanceMatrix[route[currentPosition - 1]][nextNode], optimalResult);

                isVisited[nextNode] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] distanceMatrix = {
            {0, 4, 10, 10, 3},
            {4, 0, 9, 9, 6},
            {10, 9, 0, 9, 10},
            {10, 9, 9, 0, 6},
            {3, 6, 10, 6, 0}
        };
        
        Result optimalRoute = solveTSP(distanceMatrix);
        
        System.out.print("Best route (1-based): ");
        for (int node : optimalRoute.route) {
            System.out.print((node + 1));
        }
        System.out.println();
        
        System.out.println("Minimum distance: " + optimalRoute.distance);
        
    }
}