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
public class ExpeditedShippingStrategy implements ShippingStrategy {

    private final double baseRate;
    private final double ratePerKg;

    public ExpeditedShippingStrategy(double baseRate, double ratePerKg) {
        this.baseRate = baseRate;
        this.ratePerKg = ratePerKg;
    }

    @Override
    public double calculateShippingCost(double weight) {
        return baseRate + ratePerKg * weight;
    }
}
