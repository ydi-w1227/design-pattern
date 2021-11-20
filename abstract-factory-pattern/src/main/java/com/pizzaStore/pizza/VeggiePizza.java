package com.pizzaStore.pizza;

import com.pizzaStore.ingredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    // delegate and composition
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        setName("Veggie");
        System.out.println("Preparing " + name + " Pizza");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
