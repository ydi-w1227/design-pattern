package com.pizzaShop.pizzaStore;

import com.pizzaShop.SimplePizzaFactory;
import com.pizzaShop.pizza.CheesePizza;
import com.pizzaShop.pizza.PepperoniPizza;
import com.pizzaShop.pizza.Pizza;
import com.pizzaShop.pizza.VeggiePizza;

/**
 * Could make this class abstract to have more pizza factory
 * i.e. different type of store might have same pizza makign in different way
 */
// creator
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        // create concrete pizza object use factory
//        pizza = factory.createPizza(type);
        pizza = createPizza(type);
        // do rest of things
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Done!!\n");
        return pizza;
    }

    private Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new CheesePizza("Cheese");
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza("Pepperoni");
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza("Veggie");
        }
        return pizza;
    }
}
