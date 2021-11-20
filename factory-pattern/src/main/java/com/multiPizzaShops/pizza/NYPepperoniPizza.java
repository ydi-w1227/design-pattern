package com.multiPizzaShops.pizza;

public class NYPepperoniPizza extends Pizza {
    String name;

    public NYPepperoniPizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY style " + name + " Pizza");

    }
}
