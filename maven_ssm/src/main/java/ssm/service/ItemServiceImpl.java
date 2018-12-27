package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.mapper.ItemMapper;
import ssm.pojo.Item;

import java.util.List;
@Service
@Transactional
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> queryItemList() throws Exception {
        return itemMapper.queryItemList();
    }
}
