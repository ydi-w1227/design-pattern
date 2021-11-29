package com.multiPizzaShops.pizza;

import java.util.ArrayList;

// product
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name + " Pizza");
        System.out.println("Tossing dough..");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
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
