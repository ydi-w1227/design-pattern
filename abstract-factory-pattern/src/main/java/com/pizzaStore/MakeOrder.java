package com.pizzaStore;

import com.pizzaStore.pizza.Pizza;
import com.pizzaStore.store.NYPizzaStore;
import com.pizzaStore.store.PizzaStore;

public class MakeOrder {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("Clams");

    }
}
