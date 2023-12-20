package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    int age;

    public int getAge() {
        return age;
    }
    @Value(value = "90")
    public void setAge(int age) {
        this.age = age;
    }
}
