package com.multiPizzaShops.pizza;

public class ChicagoVeggiePizza extends Pizza {
    String name;

    public ChicagoVeggiePizza(String s) {
        this.name = s;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style " + name + " Pizza");
    }
}
