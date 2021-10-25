package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertAll;

public class GroupedAssertionsTestTestNG {
    @Test
    public void groupedAssertions() {
        Cart cart = new Cart(UUID.randomUUID().toString());
        RealItem item = new RealItem();
        VirtualItem secondItem = new VirtualItem();

        assertAll(
                () -> Assert.assertEquals(0d, cart.getTotalPrice()),
                () -> Assert.assertNotNull(cart.getCartName()),
                () -> Assert.assertEquals(item.getWeight(), 0d),
                () -> Assert.assertEquals(secondItem.getSizeOnDisk(), 0d));
    }
}
