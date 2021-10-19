import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shop.RealItem;

public class RealItemWeighTest {

    @Test

    public void testItemWeight () {
        RealItem item = new RealItem();
        item.setWeight(100d);

        Assertions.assertEquals(item.getWeight(), 100d);
    }
}
