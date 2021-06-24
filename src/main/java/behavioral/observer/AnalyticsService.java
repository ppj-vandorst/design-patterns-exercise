package behavioral.observer;

public class AnalyticsService {
    private int numberOfEvents = 0;

    // This method should be called when we I get notified by the inventoryService
    private void applyAnalytics(String productName, int inventory) {
        System.out.printf("Inventory of product %s changed to %d", productName, inventory);
        numberOfEvents++;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }
}
