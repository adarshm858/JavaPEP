public class FragileDelivery extends Delivery {
    public FragileDelivery(String deliveryId, String customerName, double distance) {
        super(deliveryId, customerName, distance);
    }

    @Override
    public double calculateCost() {
        return distance * 8 + 100;
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
