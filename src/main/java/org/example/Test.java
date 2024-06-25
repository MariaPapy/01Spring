package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        Human human = context.getBean("humanBean", Human.class);
        System.out.println(human.getName() + " has: " + human.cat.getName() + ", " + human.dog.getName() + ", " +  human.parrot1.getName() + ", " +  human.parrot2.getName());
        context.close();

    }
}