package com.ty;

import org.springframework.stereotype.Component;

@Component(value = "myPerson")
public class Person {
    public void run(){
        System.out.println("Person is running......");
    }
}
