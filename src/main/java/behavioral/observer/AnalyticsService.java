package behavioral.observer;

public class AnalyticsService implements InventoryObserver {
    private int numberOfEvents = 0;

    @Override
    public void notify(String productName, int inventory) {
        System.out.printf("Inventory of product %s changed to %d", productName, inventory);
        numberOfEvents++;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }
}
