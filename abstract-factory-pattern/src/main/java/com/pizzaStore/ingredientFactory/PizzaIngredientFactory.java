package com.pizzaStore.ingredientFactory;

import com.pizzaStore.ingredient.Cheese.Cheese;
import com.pizzaStore.ingredient.Clams.Clams;
import com.pizzaStore.ingredient.Dough.Dough;
import com.pizzaStore.ingredient.Pepperoni.Pepperoni;
import com.pizzaStore.ingredient.Sauce.Sauce;
import com.pizzaStore.ingredient.Veggies.Veggies;

// actual implements of ingredients will change when we create pizza in different area
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
