import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import org.junit.jupiter.api.*;
import parser.JsonParser;
import shop.Cart;
import shop.VirtualItem;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


public class JsonParserTest {
    private Cart cart;
    VirtualItem item = new VirtualItem();
    JsonParser parser = new JsonParser();

    @BeforeEach
    public void initAll () {
       cart = new Cart(UUID.randomUUID().toString());
       cart.addVirtualItem(item);
    }

       @Test
    void writeItemsToFile() throws IOException {
        parser.writeToFile(cart);
           Assertions.assertTrue(new File("src/main/resources/" + cart.getCartName() + ".json").exists());
           }

           @Test
           @Disabled()
    void readFromFile() throws IOException {
               parser.writeToFile(cart);
        Cart readCart = parser.readFromFile(new File("src/main/resources/" + cart.getCartName() + ".json"));
               Assertions.assertEquals(cart.getTotalPrice(), readCart.getTotalPrice());

           }

    @AfterEach
    void tearDown() {
        cart = null;
    }

   }
