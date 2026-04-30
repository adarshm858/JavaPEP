public class ExpressDelivery extends Delivery {
    public ExpressDelivery(String deliveryId, String customerName, double distance) {
        super(deliveryId, customerName, distance);
    }

    @Override
    public double calculateCost() {
        return distance * 10 + 50;
    }

    @Override
    public int getPriority() {
        return 3;
    }
}
