package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Teacher teacher = (Teacher) configurableApplicationContext.getBean("teacher");
        System.out.println(teacher.getAge());
    }
}
