package com.pizzaShop;

import com.pizzaShop.pizza.CheesePizza;
import com.pizzaShop.pizza.PepperoniPizza;
import com.pizzaShop.pizza.Pizza;
import com.pizzaShop.pizza.VeggiePizza;

/**
 * take care of concrete Pizza object initialization
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("Cheese")) {
            System.out.println("Creating a Cheese pizza");
            pizza = new CheesePizza("Cheese");
        } else if (type.equals("Pepperoni")) {
            System.out.println("Create a Pepperoni pizza");
            pizza = new PepperoniPizza("Pepperoni");
        } else if (type.equals("Veggie")) {
            System.out.println("Creating a Veggie pizza");
            pizza = new VeggiePizza("Veggie");
        }
        return pizza;
    }
}
