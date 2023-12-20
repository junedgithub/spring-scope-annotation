package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Shop shop = (Shop) applicationContext.getBean("myShop");
        shop.display();
    }
}
