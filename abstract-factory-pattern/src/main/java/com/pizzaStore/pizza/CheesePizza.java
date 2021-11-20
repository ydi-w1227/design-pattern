package com.pizzaStore.pizza;

import com.pizzaStore.ingredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    // delegate and composition
    PizzaIngredientFactory pizzaIngredientFactory;

    // which style of cheese pizza we want..
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        setName("Cheese");
        System.out.println("Preparing " + name + " Pizza");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
