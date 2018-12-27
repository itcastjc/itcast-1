package ssm.mapper;

import ssm.pojo.Item;

import java.util.List;

public interface ItemMapper {

    /**
     * 查询全部商品
     * @return
     * @throws Exception
     */
    List<Item> queryItemList()throws  Exception;
}
