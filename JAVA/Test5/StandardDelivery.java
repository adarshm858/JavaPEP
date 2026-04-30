public class StandardDelivery extends Delivery {
    public StandardDelivery(String deliveryId, String customerName, double distance) {
        super(deliveryId, customerName, distance);
    }

    @Override
    public double calculateCost() {
        return distance * 5;
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
