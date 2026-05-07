/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

public class Store {
    
    public double calculateTotalPrice(P item, int quantity, double discountPercentage) { // quantity: amount to buy, discountPercentage: discount percentage
        double totalPrice = 0;
        
        // Checks availability
        if (item.q >= quantity) {
            totalPrice = item.p * quantity;
            
            // Perform discount
            if (discountPercentage > 0) {
                totalPrice = totalPrice - (totalPrice * (discountPercentage / 100));
            }
        } else {
            System.out.println("No stock");
        }
        
        return totalPrice;
    }
}