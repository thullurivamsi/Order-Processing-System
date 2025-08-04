package com.orderprocessing.notification;

import com.orderprocessing.model.Order;

public interface Notifier {
    void send(Order order);
}
