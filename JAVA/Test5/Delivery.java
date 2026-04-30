import java.io.Serializable;

public abstract class Delivery implements Serializable, Trackable {
    private static final long serialVersionUID = 1L;

    public enum Status {
        CREATED, IN_TRANSIT, DELIVERED
    }

    protected String deliveryId;
    protected String customerName;
    protected double distance;
    protected Status status;

    public Delivery(String deliveryId, String customerName, double distance) {
        this.deliveryId = deliveryId;
        this.customerName = customerName;
        this.distance = distance;
        this.status = Status.CREATED;
    }

    public abstract double calculateCost();
    public abstract int getPriority();

    @Override
    public void updateStatus(String newStatusStr) {
        Status newStatus = Status.valueOf(newStatusStr.toUpperCase());
        if (this.status == Status.CREATED && newStatus == Status.IN_TRANSIT) {
            this.status = newStatus;
        } else if (this.status == Status.IN_TRANSIT && newStatus == Status.DELIVERED) {
            this.status = newStatus;
        } else {
            throw new IllegalStateException("Invalid status transition from " + this.status + " to " + newStatusStr);
        }
    }

    @Override
    public String getStatus() {
        return status.name();
    }

    public String getDeliveryId() { return deliveryId; }
    public String getCustomerName() { return customerName; }
    public double getDistance() { return distance; }
    
    public String getType() {
        return this.getClass().getSimpleName().replace("Delivery", "");
    }

    @Override
    public String toString() {
        return deliveryId + " | " + String.format("%-8s", getType()) + " | Cost: " + calculateCost() + " | Priority: " + getPriority() + " | Status: " + getStatus();
    }
}
