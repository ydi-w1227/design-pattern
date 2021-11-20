package com.multiPizzaShops.pizza;

public class NYVeggiePizza extends Pizza {
    String name;

    public NYVeggiePizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY style " + name + " Pizza");

    }
}
