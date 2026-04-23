package Test4;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ActivityAggregator {

    private final ConcurrentHashMap<String, Integer> userActivityMap = new ConcurrentHashMap<>();

    public void addActivity(String userId) {
        userActivityMap.merge(userId, 1, Integer::sum);
    }

    public Map<String, Integer> getResults() {
        return userActivityMap;
    }
}