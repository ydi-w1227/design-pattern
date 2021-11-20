package com.pizzaPrice;

import com.pizzaPrice.addOn.CheeseTopping;
import com.pizzaPrice.addOn.ChickenTopping;
import com.pizzaPrice.addOn.MushroomTopping;
import com.pizzaPrice.pizza.Pizza;
import com.pizzaPrice.pizza.PlainPizza;

// structural design -> relationship between objects
// add additional behavior or state to individual objects dynamically at run-time like wrapper.
public class MakePizza {
    public static void main(String[] args) {
        // everytime wrap a layer, still will be pizza type
        Pizza pizza = new PlainPizza();
        pizza = new MushroomTopping(pizza);
        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getPrice());
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getPrice());
        pizza = new ChickenTopping(pizza);
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getDescription());

    }
}
