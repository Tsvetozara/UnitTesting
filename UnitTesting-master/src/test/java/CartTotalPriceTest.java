import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;

public class CartTotalPriceTest {
    @Test
    public void cartTest() {
        Cart cart = new Cart("theCart");
        RealItem item = new RealItem();
        item.setPrice(100);
        cart.addRealItem(item);
        Assertions.assertEquals(120d, cart.getTotalPrice());
    }

}
