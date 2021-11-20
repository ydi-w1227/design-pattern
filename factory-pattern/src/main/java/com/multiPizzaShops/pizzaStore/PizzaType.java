package com.multiPizzaShops.pizzaStore;

import com.multiPizzaShops.pizza.*;

import java.util.function.Function;

public enum PizzaType {
    NYCHEESE(NYCheesePizza::new, "NYCheese"),
    NYPEPPERONI(NYPepperoniPizza::new, "NYPepperoni"),
    NYVEGGIE(NYVeggiePizza::new, "NYVeggie"),
    CHICAGOCHEESE(ChicagoCheesePizza::new, "ChicagoCheese"),
    CHICAGOPEPPERONI(ChicagoPepperoniPizza::new, "ChicagoPepperoni"),
    CHICAGOVEGGIE(ChicagoVeggiePizza::new, "ChicagoVeggie");

    private final Function<String, Pizza> constructor;
    private String name;

    PizzaType(Function<String, Pizza> constructor, String name) {
        this.constructor = constructor;
        this.name = name;
    }

    public Function<String, Pizza> getConstructor() {
        return constructor;
    }

    public String getName() {
        return name;
    }
}
