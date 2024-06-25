package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

public class Human {
    @Getter
    @Value("${human.name}")
    private String name;
    Pet cat;
    Pet dog;
    Pet parrot1;
    Pet parrot2;
    public Human(Pet cat, Pet dog, Pet parrot1, Pet parrot2){
        this.cat = cat;
        this.dog = dog;
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
    }

}
