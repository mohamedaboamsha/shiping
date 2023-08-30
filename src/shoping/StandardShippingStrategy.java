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



public class StandardShippingStrategy implements ShippingStrategy {
    private final double ratePerKg;

    public StandardShippingStrategy(double ratePerKg) {
        this.ratePerKg = ratePerKg;
    }

    @Override
    public double calculateShippingCost(double weight) {
        return ratePerKg * weight;
    }
}