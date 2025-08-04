package com.orderprocessing.discount;

public class PremiumDiscount implements DiscountCalculator {
    @Override
    public double discount(double originalPrice) {
        return originalPrice * 30 / 100;
    }
}
