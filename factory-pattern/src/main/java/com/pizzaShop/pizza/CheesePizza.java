package com.pizzaShop.pizza;

public class CheesePizza extends Pizza {
    String name;

    public CheesePizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " Pizza");
    }
}
