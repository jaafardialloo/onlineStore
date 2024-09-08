package org.onlineShop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.onlineShop.domain.order.model.Item;
import org.onlineShop.domain.order.model.Order;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class OrderTest {

    @InjectMocks
    private Order order;

    @Mock
    private Item item1;

    @Mock
    private Item item2;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testIsValidOrder_AllItemsValid() {
        Mockito.when(item1.isValid()).thenReturn(true);
        Mockito.when(item2.isValid()).thenReturn(true);

        order.setItems(Arrays.asList(item1, item2));
        boolean result = order.isValidOrder();

        assertTrue(result, "Expected the order to be valid when all items are valid");
    }

    @Test
    public void testIsValidOrder_ContainsInvalidItem() {
        Mockito.when(item1.isValid()).thenReturn(true);
        Mockito.when(item2.isValid()).thenReturn(false);

        order.setItems(Arrays.asList(item1, item2));
        boolean result = order.isValidOrder();

        assertFalse(result, "Expected the order to be invalid when at least one item is invalid");
    }
}
