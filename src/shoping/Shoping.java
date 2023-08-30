/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoping;

/**
 *
 * @author WAFAco
 */
public class Shoping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShippingCostCalculator calculator = new ShippingCostCalculator();
calculator.setShippingStrategy(new StandardShippingStrategy(1.5));
double cost = calculator.calculateShippingCost(10);
System.out.println("Standard shipping cost for a 10kg package: " + cost);

calculator.setShippingStrategy(new ExpeditedShippingStrategy(5, 2.0));
cost = calculator.calculateShippingCost(10);
System.out.println("Expedited shipping cost for a 10kg package: " + cost);

calculator.setShippingStrategy(new OvernightShippingStrategy(10, 3.0));
cost = calculator.calculateShippingCost(10);
System.out.println("Overnight shipping cost for a 10kg package: " + cost);

    }
    
}
