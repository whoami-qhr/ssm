package com.qhr.dao;

import com.qhr.bean.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ItemsDaoTest {

    @Test
    public void testFindAll(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = ioc.getBean(ItemsDao.class);
        List<Items> itemsList = itemsDao.findAll();
        for (Items item : itemsList) {
            System.out.println(item);
        }
    }
}
