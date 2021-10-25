package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import shop.Cart;
import shop.RealItem;

import java.util.UUID;

public class CartTestTestNG {
    private Cart cart;

    @BeforeTest
    public void initAll() {
        cart = new Cart(UUID.randomUUID().toString());
    }

    @Test
    public void cartTotalPriceTest() {
        RealItem item = new RealItem();
        item.setPrice(100);
        cart.addRealItem(item);
        Assert.assertEquals(120d, cart.getTotalPrice());
    }

    @Test
    public void deleteCartItem() {
        RealItem item = new RealItem();
        cart.addRealItem(item);
        cart.deleteRealItem(item);
        Assert.assertEquals(cart.getTotalPrice(), 0d);
    }

    @AfterTest
    void tearDown() {
        cart = null;
    }
}
