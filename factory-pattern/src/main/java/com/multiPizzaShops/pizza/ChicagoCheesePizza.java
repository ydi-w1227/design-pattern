package com.multiPizzaShops.pizza;

public class ChicagoCheesePizza extends Pizza {
    String name;

    public ChicagoCheesePizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style " + name + " Pizza");
    }
}
