package com.orderprocessing;

import com.orderprocessing.model.*;
import com.orderprocessing.discount.*;
import com.orderprocessing.receipt.*;
import com.orderprocessing.notification.*;
import com.orderprocessing.processor.OrderProcessor;

public class Main {
    public static void main(String[] args) {

        Item poco = new Item("Poco X3 mobile", 101, 17999);
        Item acer = new Item("Acer Swift 3 laptop", 102, 119999);
        Item daikin = new Item("Daikin A/C", 103, 69999);
        Item crocs = new Item("Baya Mens Crocs", 104, 1999);
        Item earphones = new Item("RealMe wired buds 2", 105, 499);

        Customer cust1 = new Customer("Customer 1", 201);
        Customer cust2 = new Customer("Customer 2", 202);
        Customer cust3 = new Customer("Customer 3", 203);

        Order order1 = new Order(new Item[]{poco, acer, crocs}, cust1, 301);
        Order order2 = new Order(new Item[]{acer, earphones}, cust2, 302);
        Order order3 = new Order(new Item[]{daikin, poco, earphones}, cust3, 303);

        OrderProcessor orderProcessor = new OrderProcessor(
                new PremiumDiscount(),
                new ReceiptGenerator(),
                new ReceiptPrinter(),
                new EmailNotification()
        );
        orderProcessor.processOrder(order1);

        orderProcessor = new OrderProcessor(
                new RegularDiscount(),
                new ReceiptGenerator(),
                new ReceiptPrinter(),
                new EmailNotification()
        );
        orderProcessor.processOrder(order2);

        orderProcessor = new OrderProcessor(
                new RegularDiscount(),
                new ReceiptGenerator(),
                new ReceiptPrinter(),
                new SMSNotification()
        );
        orderProcessor.processOrder(order3);
    }
}
