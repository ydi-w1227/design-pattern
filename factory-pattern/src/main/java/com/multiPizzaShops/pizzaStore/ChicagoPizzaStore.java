package com.multiPizzaShops.pizzaStore;

import com.multiPizzaShops.pizza.ChicagoCheesePizza;
import com.multiPizzaShops.pizza.ChicagoPepperoniPizza;
import com.multiPizzaShops.pizza.Pizza;

/**
 * factory method for chicago style pizza
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new ChicagoCheesePizza("Cheese");
        } else if (type.equals("Pepperoni")) {
            pizza = new ChicagoPepperoniPizza("Pepperoni");
        } else if (type.equals("Veggie")) {
            pizza = new ChicagoCheesePizza("Veggie");
        }
        return pizza;
    }

//    @Override
//    public Pizza createPizza(PizzaType type) {
//        Pizza pizza = getPizza(type);
//        return pizza;
//    }
}
