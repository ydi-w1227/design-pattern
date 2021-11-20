package com.multiPizzaShops.pizza;

public class NYCheesePizza extends Pizza {
    String name;

    public NYCheesePizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY style " + name + " Pizza");

    }
}
