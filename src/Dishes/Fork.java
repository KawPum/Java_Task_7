package Dishes;

public class Fork extends Dish{
    private int length;

    public Fork(String material, double density, int maxTemp, int length) {
        super(material, density, maxTemp);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "This fork is made of " + super.getMaterial() + ". It has a maximum temperature of " + super.getMaxTemp() + ". It has a length of " + this.length + ".";
    }
}
