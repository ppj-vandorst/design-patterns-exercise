package behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private List<InventoryObserver> observers = new ArrayList<>();
    private Map<String, Integer> inventory = new HashMap<>();

    public void subscribe(InventoryObserver observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(InventoryObserver observer) {
        this.observers.remove(observer);
    }

    public void setInventory(String product, int stock) {
        inventory.put(product, stock);

        for (InventoryObserver observer : observers) {
            observer.notify(product, stock);
        }
    }
}
