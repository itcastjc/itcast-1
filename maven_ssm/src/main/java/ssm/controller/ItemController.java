package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Item;
import ssm.service.ItemService;

import java.util.List;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("queryItemList")
    public String queryItemList(Model model) throws Exception {
        List<Item> itemList = itemService.queryItemList();
        model.addAttribute("itemList",itemList);
        return "itemList";
    }
}
