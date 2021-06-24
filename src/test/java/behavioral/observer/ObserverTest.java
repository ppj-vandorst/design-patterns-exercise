package behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObserverTest {

    @Test
    public void itShouldAllowObjectsToObserveTheInventoryService() {
        var inventoryService = new InventoryService();

        var orderService = new OrderService();
        var analyticsService = new AnalyticsService();

        inventoryService.subscribe(orderService);
        inventoryService.subscribe(analyticsService);

        inventoryService.setInventory("productA", 10);
        inventoryService.setInventory("productB", 1);

        assertThat(analyticsService.getNumberOfEvents()).isEqualTo(2);
    }
}
