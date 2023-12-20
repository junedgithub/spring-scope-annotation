package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
        applicationContext.close();
    }

}

