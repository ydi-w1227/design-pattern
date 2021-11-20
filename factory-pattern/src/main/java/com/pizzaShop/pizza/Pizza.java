package com.pizzaShop.pizza;

// product
public abstract class Pizza {
    String name;

    public void prepare() {
        System.out.println("Preparing..");
    }

    public void bake() {
        System.out.println("Baking..");
    }

    public void cut() {
        System.out.println("Cutting..");
    }
    public void box() {
        System.out.println("Boxing..");
    }

    public String getName() {
        return name;
    }
}
