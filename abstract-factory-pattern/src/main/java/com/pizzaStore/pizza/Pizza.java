package com.pizzaStore.pizza;

import com.pizzaStore.ingredient.Cheese.Cheese;
import com.pizzaStore.ingredient.Clams.Clams;
import com.pizzaStore.ingredient.Dough.Dough;
import com.pizzaStore.ingredient.Pepperoni.Pepperoni;
import com.pizzaStore.ingredient.Sauce.Sauce;
import com.pizzaStore.ingredient.Veggies.Veggies;

import java.util.Arrays;


public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins..");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices..");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box..");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
