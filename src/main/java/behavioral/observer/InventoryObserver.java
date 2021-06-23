package behavioral.observer;

public interface InventoryObserver {
    void notify(String productName, int inventory);
}
