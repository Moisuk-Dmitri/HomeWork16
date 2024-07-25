public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Truck() {
        super(null, 0);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}