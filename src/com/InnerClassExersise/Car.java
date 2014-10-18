package com.InnerClassExersise;

/**
 * Created by Olga on 17.10.2014.
 */
public abstract class Car {
    private String make;

    public abstract void start();

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public static void main(String[] args) {
        Car Hybrid = new Car() {
            private int battery = 3000;

            public int getBattery() {
                return battery;
            }

            @Override
            public void start() {
                battery -= 100;
                System.out.println(getBattery());
            }
        };

        Hybrid.setMake("Bentley");
        System.out.println(Hybrid.getMake());
        Hybrid.start();
    }
}

