package com.ty;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student Age: "+student.getAge());
        System.out.println("===========Subject List==============");
        List<String> subjectNames = student.getSubjectName();
        for (String string : subjectNames) {
			System.out.println(string);
		}
	}
}
 