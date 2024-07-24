public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                updateTyre(vehicle);
            }
        }
    }

    public void updateTyre(Vehicle vehicle) {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine(Vehicle vehicle) {

        if (vehicle.getClass() != Bicycle.class) {
            System.out.println("Проверяем двигатель");
        }
    }

    public void checkTrailer(Vehicle vehicle) {
        if (vehicle.getClass() != Bicycle.class && vehicle.getClass() != Car.class) {
            System.out.println("Проверяем прицеп");
        }
    }
}