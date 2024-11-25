import java.util.Objects;

public class Bicycle extends WheeledTransport {
    public Bicycle() {
        super(null, 0);
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
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
        Bicycle otherBicycle = (Bicycle) obj;
        return this.getWheelsCount() == otherBicycle.getWheelsCount() && this.getModelName().equals(otherBicycle.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWheelsCount(), getModelName());
    }
}