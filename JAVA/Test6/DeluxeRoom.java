package Test6;

public class DeluxeRoom extends Guest {

    private final int COST_PER_DAY = 4000;

    public DeluxeRoom(int guestId, String guestName, int daysStayed) {
        super(guestId, guestName, daysStayed);
    }

    @Override
    public double calculateBill() {
        return daysStayed * COST_PER_DAY;
    }
}