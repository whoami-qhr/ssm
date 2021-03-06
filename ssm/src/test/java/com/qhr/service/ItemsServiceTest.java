package com.qhr.service;

import com.qhr.bean.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ItemsServiceTest {


    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = ioc.getBean(ItemsService.class);
        List<Items> itemsList = itemsService.findAll();
        for (Items items : itemsList) {
            System.out.println(items);
        }
    }
}
