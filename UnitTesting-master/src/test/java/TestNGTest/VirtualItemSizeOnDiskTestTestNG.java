package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import shop.VirtualItem;

public class VirtualItemSizeOnDiskTestTestNG {

    @Test(groups = {"bonding"})
    public void testDiskSize() {
        VirtualItem item = new VirtualItem();
        item.setSizeOnDisk(50d);

        //Assert.assertEquals(item.getSizeOnDisk(),50d);
        Assert.assertEquals(item.toString(), "Class: class shop.VirtualItem; Name: null; Price: 0.0; Size on disk: 50.0");
    }
}

