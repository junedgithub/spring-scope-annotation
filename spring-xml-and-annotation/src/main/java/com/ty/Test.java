package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Person person = (Person)configurableApplicationContext.getBean("myPerson");
        person.run();
    }
}
