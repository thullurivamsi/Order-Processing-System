package com.orderprocessing.notification;

import com.orderprocessing.model.Order;

public class SMSNotification implements Notifier {
    @Override
    public void send(Order order) {
        System.out.println("\n\nSMS Notification:");
        System.out.println("Dear " + order.getCustomer().getName() + ", " +
                "your order with order id " + order.getId() + " has been placed.");
        System.out.println("Thank you.");
    }
}
