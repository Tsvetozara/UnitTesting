package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import parser.JsonParser;
import shop.Cart;
import shop.VirtualItem;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


public class JsonParserTestTestNG {
    private Cart cart;
    VirtualItem item = new VirtualItem();
    JsonParser parser = new JsonParser();

    @BeforeTest
    public void initAll() {
        cart = new Cart(UUID.randomUUID().toString());
        cart.addVirtualItem(item);
    }

    @Test
    void testWriteItemsToFile() throws IOException {
        parser.writeToFile(cart);
        Assert.assertTrue(new File("src/main/resources/" + cart.getCartName() + ".json").exists());
    }

    @Test (enabled = false)
    void testReadFromFile() throws IOException {
        parser.writeToFile(cart);
        Cart readCart = parser.readFromFile(new File("src/main/resources/" + cart.getCartName() + ".json"));
        Assert.assertEquals(cart.getTotalPrice(), readCart.getTotalPrice());
    }

    @AfterTest
    void tearDown() {
        cart = null;
    }
}
