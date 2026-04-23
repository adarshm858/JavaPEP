package Test4;

public class LogEntry {
    private String timestamp;
    private String userId;
    private String action;

    public LogEntry(String timestamp, String userId, String action) {
        this.timestamp = timestamp;
        this.userId = userId;
        this.action = action;
    }

    public String getUserId() { return userId; }
}
