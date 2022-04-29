package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee1.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1.getId());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getEmail());
        System.out.println(employee1.getMobile());

        System.out.println(employee1);
    }
}
