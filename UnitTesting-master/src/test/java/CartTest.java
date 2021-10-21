import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;
import java.util.UUID;

public class CartTest {
    private Cart cart;

    @BeforeEach
    public void initAll () {
      cart = new Cart(UUID.randomUUID().toString());
    }

    @Test
    public void cartTotalPriceTest() {
        RealItem item = new RealItem();
        item.setPrice(100);
        cart.addRealItem(item);
        Assertions.assertEquals(120d, cart.getTotalPrice());
    }
    @Test
    public void cartNameTest () {
        Assertions.assertNotNull(cart.getCartName());
    }

    @AfterEach
    void tearDown() {
        cart = null;
    }
      }
