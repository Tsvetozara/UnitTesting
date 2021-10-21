import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;
import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.UUID;

public class GroupedAssertionsTest {
    @Test
    public void groupedAssertions () {
        Cart cart = new Cart(UUID.randomUUID().toString());
        RealItem item = new RealItem();
        VirtualItem secondItem = new VirtualItem();

        assertAll(
                () -> Assertions.assertEquals(0d, cart.getTotalPrice()),
                () -> Assertions.assertNotNull(cart.getCartName()),
                () -> Assertions.assertEquals(item.getWeight(), 0d),
                () -> Assertions.assertEquals(secondItem.getSizeOnDisk(),0d));
    }
}
