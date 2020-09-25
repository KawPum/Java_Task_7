package Dishes;

public abstract class Dish {
    private String material;
    private double density; // kg / cm^3
    private int maxTemp;

    public Dish() {
    }

    public Dish(String material, double density, int maxTemp) {
        this.material = material;
        this.density = density;
        this.maxTemp = maxTemp;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }
}
