package com.pizzaPrice.addOn;

import com.pizzaPrice.pizza.Pizza;

public class MushroomTopping extends ToppingDecorator {
    Pizza pizza;
    String description = ", add mushrooms";
    public MushroomTopping(Pizza toppingPizza) {
        this.pizza = toppingPizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + this.description;
    }
}
