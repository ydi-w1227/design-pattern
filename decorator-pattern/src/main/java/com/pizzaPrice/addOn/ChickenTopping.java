package com.pizzaPrice.addOn;

import com.pizzaPrice.pizza.Pizza;

public class ChickenTopping extends ToppingDecorator{
    Pizza pizza;
    String description = ", add chicken";

    public ChickenTopping(Pizza toppingPizza) {
        this.pizza = toppingPizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 2.5;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + this.description;
    }
}
