package Dogs;

public class Shepherd extends Dog{
    public Shepherd(int weight, int height) {
        super(1, "long, soft and slightly curly", weight, height);
    }

    @Override
    public String toString() {
        return "That's a shepherd. It's " + super.getSize() + " and it's fur is " + getFurType() + ".";
    }
}
