package com.orderprocessing.discount;

public class RegularDiscount implements DiscountCalculator {
    @Override
    public double discount(double originalPrice) {
        return originalPrice * 20 / 100;
    }
}
