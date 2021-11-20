package com.pizzaPrice.pizza;

public class PlainPizza implements Pizza {
    String description = "Plain pizza";

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
