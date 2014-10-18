package com.InnerClassExersise;

/**
 * Created by Olga on 17.10.2014.
 */
public class Popsi extends Drink {
    private enum Ingredients {Sugar, Caffeine}

    ;

    public Popsi() {
        super(10, "Great carbonated soda");
    }

    @Override
    public String getIngredient() {
        return Ingredients.Caffeine.toString() + " " + Ingredients.Sugar;
    }

    public String toString() {
        return super.toString()
                + "\nIngredienrs:\t" + this.getIngredient();
    }

    @Override
    public void finalize()
            throws Throwable {
        super.finalize();
        System.out.println("finalize() is running");
    }
}
