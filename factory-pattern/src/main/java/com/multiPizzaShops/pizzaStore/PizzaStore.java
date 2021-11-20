package com.multiPizzaShops.pizzaStore;

import com.multiPizzaShops.pizza.Pizza;

/**
 * Could make this class abstract to have more pizza factory
 * i.e. different type of store might have same pizza makign in different way
 */
// creator
public abstract class PizzaStore {

//    public static Pizza getPizza(PizzaType type) {
//        Pizza pizza = type.getConstructor().apply(type.getName());
//        return pizza;
//    }

    // this method will be same for all concrete class
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        // do rest of things
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Done!!\n");
        return pizza;
    }

    // factory method
    protected abstract Pizza createPizza(String type);

//    protected abstract Pizza createPizza(PizzaType type);

//    public Pizza orderPizza(PizzaType type) {
//        Pizza pizza;
//        pizza = createPizza(type);
//        // do rest of things
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        System.out.println("Done!!\n");
//        return pizza;
//    }
}
