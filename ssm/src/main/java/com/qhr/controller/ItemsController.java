package com.qhr.controller;

import com.qhr.bean.Items;
import com.qhr.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @RequestMapping("/findAll")
    public Map findAll(){
        List<Items> itemsList = itemsService.findAll();
        Map resultMap = new HashMap();
        resultMap.put("allItems", itemsList);
        return resultMap;
    }
}
