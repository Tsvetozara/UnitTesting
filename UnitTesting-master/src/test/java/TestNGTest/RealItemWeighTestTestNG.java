package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import shop.RealItem;

public class RealItemWeighTestTestNG {
    @Test(groups = {"other"})
    public void testItemWeight() {
        RealItem item = new RealItem();
        item.setWeight(100d);

        //Assert.assertEquals(item.getWeight(), 100d);
        Assert.assertEquals(item.toString(), "Class: class shop.RealItem; Name: null; Price: 0.0; Weight: 100.0");
    }
}
