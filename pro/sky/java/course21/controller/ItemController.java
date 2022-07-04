package pro.sky.java.course21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course21.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam("list") List<Integer> list) {
        return itemService.addItems(list);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return itemService.getList();
    }
}
