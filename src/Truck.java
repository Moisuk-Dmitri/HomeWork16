import java.util.Objects;

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
        Truck otherTruck = (Truck) obj;
        return this.getWheelsCount() == otherTruck.getWheelsCount() && this.getModelName().equals(otherTruck.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWheelsCount(), getModelName());
    }
}