package com.orderprocessing.model;

public class Order {
    private Item[] items;
    private Customer customer;
    private int id;

    public Order(Item[] items, Customer customer, int id) {
        this.items = items;
        this.customer = customer;
        this.id = id;
    }

    public Item[] getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setId(int id) {
        this.id = id;
    }
}
