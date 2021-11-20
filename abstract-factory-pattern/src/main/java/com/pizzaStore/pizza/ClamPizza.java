package com.pizzaStore.pizza;

import com.pizzaStore.ingredientFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    // delegate and composition
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        setName("Clams");
        System.out.println("Preparing " + name + " Pizza");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
    }
}
