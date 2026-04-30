public class DeliveryFactory {
    public static Delivery createDelivery(String type, String deliveryId, String customerName, double distance) {
        switch (type.toLowerCase()) {
            case "standard":
                return new StandardDelivery(deliveryId, customerName, distance);
            case "express":
                return new ExpressDelivery(deliveryId, customerName, distance);
            case "fragile":
                return new FragileDelivery(deliveryId, customerName, distance);
            default:
                throw new IllegalArgumentException("Unknown delivery type: " + type);
        }
    }
}
