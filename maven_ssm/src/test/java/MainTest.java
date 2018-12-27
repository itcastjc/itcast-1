import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.pojo.Item;
import ssm.service.ItemService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MainTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void testQueryItemList() throws Exception {
        List<Item> itemList = itemService.queryItemList();
        if (itemList != null && itemList.size() > 0){
            for (int i = 0; i < itemList.size(); i++) {
                Item item = itemList.get(i);
                System.out.println(item);
            }
        }
    }
}
