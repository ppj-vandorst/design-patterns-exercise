package behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private Map<String, Integer> inventory = new HashMap<>();

    public void setInventory(String product, int stock) {
        inventory.put(product, stock);
        // Notify the subscribers
    }
}
