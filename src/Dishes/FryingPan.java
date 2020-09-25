package Dishes;

public class FryingPan extends Dish{
    private int radius;
    private int depth;
    private double volume;

    public FryingPan(String material, double density, int maxTemp, int radius, int depth) {
        super(material, density, maxTemp);
        this.radius = radius;
        this.depth = depth;
        calcVolume();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getVolume(){
        return this.volume;
    }

    public void calcVolume(){
        this.volume =  3.14 * Math.pow(radius,2) * depth;
    }

    @Override
    public String toString() {
        return "This pan is made of " + super.getMaterial() + ". It has a maximum temperature of " + super.getMaxTemp() + ". It has a volume of " + this.volume;
    }
}
