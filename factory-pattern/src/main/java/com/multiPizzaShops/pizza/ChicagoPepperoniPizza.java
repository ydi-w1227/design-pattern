package com.multiPizzaShops.pizza;

public class ChicagoPepperoniPizza extends Pizza {
    String name;

    public ChicagoPepperoniPizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style " + name + " Pizza");
    }
}
