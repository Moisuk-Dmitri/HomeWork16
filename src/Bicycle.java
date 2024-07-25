public class Bicycle extends WheeledTransport {
    public Bicycle() {
        super(null, 0);
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}