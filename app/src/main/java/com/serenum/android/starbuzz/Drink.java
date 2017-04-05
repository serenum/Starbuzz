package com.serenum.android.starbuzz;

/**
 * Created by Serenum on 03.04.2017.
 */

public class Drink {
    private String name;
    private String description;
    private int imageSourceID;

    public static final Drink[] drinks = {
            new Drink("Cappuchino", "Cappuchino with milk and sugar", R.drawable.cappuccino),
            new Drink("Latte", "Latte with cocoa and plastic pipe", R.drawable.latte),
            new Drink("Espresso", "Espresso with lemon and lemongrass", R.drawable.filter)
    };

    public Drink(String name, String description, int imageSourceID) {
        this.name = name;
        this.description = description;
        this.imageSourceID = imageSourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageSourceID() {
        return imageSourceID;
    }

    public String toString() {
        return this.name;
    }
}
