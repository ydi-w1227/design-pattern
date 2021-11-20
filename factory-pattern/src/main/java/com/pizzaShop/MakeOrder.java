package com.pizzaShop;

import com.pizzaShop.pizzaStore.PizzaStore;

public class MakeOrder {
    public static void main(String[] args) {

        // one factory of creating concrete objects
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("Veggie");
        pizzaStore.orderPizza("Cheese");
        pizzaStore.orderPizza("Pepperoni");

    }
}
