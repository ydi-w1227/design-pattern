package com.multiPizzaShops.pizzaStore;

import com.multiPizzaShops.pizza.*;

import java.util.function.Function;
import java.util.function.Supplier;

public enum PizzaType {
    NYCHEESE(NYCheesePizza::new),
    NYPEPPERONI(NYPepperoniPizza::new),
    NYVEGGIE(NYVeggiePizza::new),
    CHICAGOCHEESE(ChicagoCheesePizza::new),
    CHICAGOPEPPERONI(ChicagoPepperoniPizza::new),
    CHICAGOVEGGIE(ChicagoVeggiePizza::new);

//    private final Function<String, Pizza> constructor;
    private final Supplier<Pizza> constructor;

    PizzaType(Supplier<Pizza> constructor) {
        this.constructor = constructor;
    }
//    private String name;

//    PizzaType(Function<String, Pizza> constructor, String name) {
//        this.constructor = constructor;
//        this.name = name;
//    }
//
//    public Function<String, Pizza> getConstructor() {
//        return constructor;
//    }
//
//    public String getName() {
//        return name;
//    }
}
