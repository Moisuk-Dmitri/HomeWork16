public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
        super(null, 0);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}