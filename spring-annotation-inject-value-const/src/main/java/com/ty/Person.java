package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int age;
    String email;
    public Person(@Value(value = "56") int age,@Value(value = "junedmodi4@gmail.com") String email) {
        this.age = age;
        this.email=email;
    }
}
