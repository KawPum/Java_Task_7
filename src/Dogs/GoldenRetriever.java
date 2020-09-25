package Dogs;

public class GoldenRetriever extends Dog{
    public GoldenRetriever(int weight, int height) {
        super(8, "straight, rude", weight, height);
    }

    @Override
    public String toString() {
        return "That's a golden retriever. It's " + super.getSize() + " and it's fur is " + super.getFurType() + ".";
    }
}
