package Test6;

public class SuiteRoom extends Guest {

    private final int COST_PER_DAY = 7000;

    public SuiteRoom(int guestId, String guestName, int daysStayed) {
        super(guestId, guestName, daysStayed);
    }

    @Override
    public double calculateBill() {
        return daysStayed * COST_PER_DAY;
    }
}