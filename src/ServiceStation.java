public class ServiceStation {
    public void check(WheeledTransport wheeledTransport) {
        if (wheeledTransport != null) {
            System.out.println("Обслуживаем " + wheeledTransport.getModelName());
            for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
                wheeledTransport.updateTyre();
            }
        }
    }
}