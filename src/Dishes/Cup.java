package Dishes;

import Dishes.Dish;

public class Cup extends Dish {
    private int radius; // all in cm
    private int height;
    private double volume; // cm^3

    public Cup(String material, double density, int maxTemp, int radius, int height) {
        super(material, density, maxTemp);
        this.radius = radius;
        this.height = height;
        calcVolume();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void calcVolume(){
        this.volume =  3.14 * Math.pow(radius,2) * height;
    }

    @Override
    public String toString() {
        return "This cup is made of " + super.getMaterial() + ". It has a maximum temperature of " + super.getMaxTemp() + ". It has a volume of " + this.volume + ".";
    }
}
