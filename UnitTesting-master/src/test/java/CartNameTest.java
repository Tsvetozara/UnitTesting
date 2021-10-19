import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;

public class CartNameTest {

    @Test

    public void cartNameTest () {
        Cart cart = new Cart("myCart");

        Assertions.assertEquals(cart.getCartName(), "myCart");

    }
}
