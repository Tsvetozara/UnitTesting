package JunitTests;

import org.junit.jupiter.api.*;
import parser.JsonParser;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


public class JsonParserTest {
    private Cart cart;
    VirtualItem item = new VirtualItem();
    RealItem realItem = new RealItem();
    JsonParser parser = new JsonParser();

    @BeforeEach
    public void initAll() {
        cart = new Cart(UUID.randomUUID().toString());
        cart.addVirtualItem(item);
        cart.addRealItem(realItem);
    }

    @Test
    void testWriteItemsToFile() throws IOException {
        parser.writeToFile(cart);
        Assertions.assertTrue(new File("src/main/resources/" + cart.getCartName() + ".json").exists());
    }

    @Test
    @Disabled()
    void testReadFromFile() throws IOException {
        parser.writeToFile(cart);
        Cart readCart = parser.readFromFile(new File("src/main/resources/" + cart.getCartName() + ".json"));
        Assertions.assertEquals(cart.getTotalPrice(), readCart.getTotalPrice());
    }

    @AfterEach
    void tearDown() {
        cart = null;
    }

}
