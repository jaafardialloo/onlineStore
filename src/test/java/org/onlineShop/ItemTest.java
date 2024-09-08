package org.onlineShop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.onlineShop.domain.order.model.Item;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemTest {
    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item();
    }

    @Test
    public void testIsValid_ValidItem() {
        item.setPrice(10.0);
        item.setQuantity(2.0);
        boolean result = item.isValid();
        assertTrue(result, "Expected the item to be valid when price and quantity are both greater than 0");
    }

    @Test
    public void testIsValid_InvalidPrice() {
        item.setPrice(0.0);
        item.setQuantity(2.0);
        boolean result = item.isValid();
        assertFalse(result, "Expected the item to be invalid when price is zero or negative");
    }

    @Test
    public void testIsValid_InvalidQuantity() {
        item.setPrice(10.0);
        item.setQuantity(0.0);
        boolean result = item.isValid();
        assertFalse(result, "Expected the item to be invalid when quantity is zero or negative");
    }

    @Test
    public void testIsValid_InvalidPriceAndQuantity() {
        item.setPrice(-10.0);
        item.setQuantity(-5.0);

        boolean result = item.isValid();

        assertFalse(result, "Expected the item to be invalid when both price and quantity are negative");
    }
}
