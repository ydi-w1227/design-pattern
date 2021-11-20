package com.pizzaShop.pizza;

public class PepperoniPizza extends Pizza {
    String name;

    public PepperoniPizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " Pizza");
    }
}
