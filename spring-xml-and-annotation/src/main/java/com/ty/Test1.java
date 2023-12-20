package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        RCB rcb = (RCB) configurableApplicationContext.getBean("RCB");
        rcb.win();
    }
}
