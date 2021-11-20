package com.multiPizzaShops.pizzaStore;

public class MakeOrder {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("Veggie");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("Veggie");

        // two factories of creating concrete objects
//        PizzaStore nyPizzaStore = new NYPizzaStore();
//        nyPizzaStore.orderPizza(PizzaType.NYVEGGIE);
//
//        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
//        chicagoPizzaStore.orderPizza(PizzaType.CHICAGOVEGGIE);
    }
}
