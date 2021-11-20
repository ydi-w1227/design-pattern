package com.pizzaShop.pizza;

public class VeggiePizza extends Pizza {
    String name;

    public VeggiePizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " Pizza");

    }
}
