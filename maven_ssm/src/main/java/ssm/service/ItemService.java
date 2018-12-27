package ssm.service;

import ssm.pojo.Item;

import java.util.List;

public interface ItemService {

    /**
     * 查询全部商品
     * @return
     * @throws Exception
     */
    List<Item> queryItemList()throws Exception;
}
