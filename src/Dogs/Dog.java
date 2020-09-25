package Dogs;

public abstract class Dog {
    private int groupFCI;
    private String furType;
    private String size;
    private int weight;
    private int height;

    public Dog(int classFCI, String furType, int weight, int height) {
        this.groupFCI = classFCI;
        this.furType = furType;
        this.weight = weight;
        this.height = height;
        determineSize();
    }

    public int getGroupFCI() {
        return groupFCI;
    }

    public String getFurType() {
        return furType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void determineSize(){
        if (this.weight <= 12 || this.height <= 28) this.size = "small";
        else if (this.weight <= 25 || this.height <= 60) this.size = "average";
        else if (this.weight > 25 || this.height > 60) this.size = "big";
    }
}
