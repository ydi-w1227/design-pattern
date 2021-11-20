package com.pizzaStore.store;

import com.pizzaStore.ingredientFactory.PizzaIngredientFactory;
import com.pizzaStore.pizza.Pizza;

public abstract class PizzaStore {
        // this method will be same for all concrete class
        public Pizza orderPizza(String type) {
            Pizza pizza = createPizza(type);
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
}
