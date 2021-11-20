package com.pizzaStore.store;

import com.pizzaStore.ingredientFactory.NYPizzaIngredientFactory;
import com.pizzaStore.ingredientFactory.PizzaIngredientFactory;
import com.pizzaStore.pizza.CheesePizza;
import com.pizzaStore.pizza.ClamPizza;
import com.pizzaStore.pizza.Pizza;
import com.pizzaStore.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (type.equals("Clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
