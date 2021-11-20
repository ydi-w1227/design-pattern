package com.pizzaStore.ingredientFactory;

import com.pizzaStore.ingredient.Cheese.Cheese;
import com.pizzaStore.ingredient.Cheese.MozzarellaCheese;
import com.pizzaStore.ingredient.Clams.Clams;
import com.pizzaStore.ingredient.Clams.FrozenClams;
import com.pizzaStore.ingredient.Dough.Dough;
import com.pizzaStore.ingredient.Dough.ThickCrustDough;
import com.pizzaStore.ingredient.Pepperoni.Pepperoni;
import com.pizzaStore.ingredient.Pepperoni.SlicedPepperoni;
import com.pizzaStore.ingredient.Sauce.PlumTomatoSauce;
import com.pizzaStore.ingredient.Sauce.Sauce;
import com.pizzaStore.ingredient.Veggies.Garlic;
import com.pizzaStore.ingredient.Veggies.Mushroom;
import com.pizzaStore.ingredient.Veggies.Onion;
import com.pizzaStore.ingredient.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom()};
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
