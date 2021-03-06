package com.multiPizzaShops.pizzaStore;

import com.multiPizzaShops.pizza.NYCheesePizza;
import com.multiPizzaShops.pizza.NYPepperoniPizza;
import com.multiPizzaShops.pizza.NYVeggiePizza;
import com.multiPizzaShops.pizza.Pizza;

/**
 * factory method for ny style pizza
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("Veggie")) {
            pizza = new NYVeggiePizza();
        } else return null;
        return pizza;
    }

//    @Override
//    public Pizza createPizza(PizzaType type) {
//        Pizza pizza = getPizza(type);
//        return pizza;
//    }


}
