package com.pizzaPrice.addOn;

import com.pizzaPrice.pizza.Pizza;

public class CheeseTopping extends ToppingDecorator {
    Pizza pizza;
    String description = ", add cheese";

    public CheeseTopping(Pizza toppingPizza) {
        this.pizza = toppingPizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 1.5;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + this.description;
    }
}
