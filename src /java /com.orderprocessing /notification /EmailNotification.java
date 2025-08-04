package com.orderprocessing.notification;

import com.orderprocessing.model.Order;

public class EmailNotification implements Notifier {
    @Override
    public void send(Order order) {
        System.out.println("\n\nEMAIL Notification");
        System.out.println("Sub: Your Order of order id " + order.getId() + " has been placed");
        System.out.println("\nDear " + order.getCustomer().getName() + ",");
        System.out.println("ORDER STATUS: PLACED");
        System.out.println("PRODUCT DETAILS:");

        for (int i = 0; i < order.getItems().length; i++) {
            System.out.println("Item - " + (i + 1) + " : " +
                    order.getItems()[i].getName() + " : " + order.getItems()[i].getPrice());
        }

        System.out.println("Thank you for your time shopping");
    }
}
