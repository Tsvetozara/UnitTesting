import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;

public class GroupedAssertionsTest {
    @Test
    public void allAssertions () {
        Cart cart = new Cart("theCart");
        RealItem item = new RealItem();
        VirtualItem item2 = new VirtualItem();
        Assertions.assertEquals(0d, cart.getTotalPrice());
        Assertions.assertEquals(cart.getCartName(), "theCart");
        Assertions.assertEquals(item.getWeight(), 0d);
        Assertions.assertEquals(item2.getSizeOnDisk(),0d);
    }
}
