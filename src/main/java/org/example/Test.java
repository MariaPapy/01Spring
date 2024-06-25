package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Human human = context.getBean("human", Human.class);
        System.out.println(human.toString());
        context.close();
    }

}