import java.util.Objects;

public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
        super(null, 0);
    }

    @Override
    public String toString() {
        return "Wheels count = " + getWheelsCount() + ", Model name = " + getModelName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Car otherCar = (Car) obj;
        return this.getWheelsCount() == otherCar.getWheelsCount() && this.getModelName().equals(otherCar.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWheelsCount(), getModelName());
    }
}