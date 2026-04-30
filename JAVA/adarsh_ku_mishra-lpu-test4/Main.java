import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DeliveryManager manager = new DeliveryManager();
        
        // Load data from file
        manager.loadFromFile("input.txt");
        
        // Print deliveries and sorted list
        manager.printDeliveries();
        manager.printSortedByCost();
        
        // Process queue
        manager.processDeliveries();
        
        // Print revenue
        System.out.println("\n===== Revenue =====");
        System.out.println("Total Revenue: " + manager.getTotalRevenue());
        
        // Print delivery counts
        System.out.println("\n===== Delivery Count By Type =====");
        Map<String, Integer> counts = manager.getDeliveryCountByType();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Serialize and deserialize
        manager.serialize("deliveries.ser");
        manager.deserialize("deliveries.ser");
    }
}
