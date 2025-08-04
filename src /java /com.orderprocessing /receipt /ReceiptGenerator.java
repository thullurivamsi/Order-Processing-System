package com.orderprocessing.receipt;

import com.orderprocessing.model.Order;

public class ReceiptGenerator {
    public StringBuilder generateReceipt(Order order, double total, double discount) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("\n\n\t\t*** ORDER RECEIPT ***");
        receipt.append("\nORDER ID: ").append(order.getId());
        receipt.append("\nCustomer Name : ").append(order.getCustomer().getName());
        receipt.append("\nCustomer Id : ").append(order.getCustomer().getId());
        receipt.append("\nITEMS : ");

        for (int i = 0; i < order.getItems().length; i++) {
            String itemDetails = "\nItem - " + (i + 1) + " : " +
                    order.getItems()[i].getName() + " : " + order.getItems()[i].getPrice();
            receipt.append(itemDetails);
        }

        receipt.append("\nTotal Price : ").append(total);
        receipt.append("\nDiscount : ").append(discount);
        receipt.append("\nFinal Price : ").append(total - discount);

        return receipt;
    }
}
