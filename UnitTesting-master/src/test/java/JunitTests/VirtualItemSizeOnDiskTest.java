package JunitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shop.VirtualItem;

public class VirtualItemSizeOnDiskTest {
    @Test
    public void testDiskSize() {
        VirtualItem item = new VirtualItem();
        item.setSizeOnDisk(50d);

        //Assertions.assertEquals(item.getSizeOnDisk(),50d);
        Assertions.assertEquals(item.toString(), "Class: class shop.VirtualItem; Name: null; Price: 0.0; Size on disk: 50.0");
    }

}
