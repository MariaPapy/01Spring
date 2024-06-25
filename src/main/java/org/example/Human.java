package org.example;

import Pets.Pet;

public class Human {
    private final Pet parrot1;
    private final Pet parrot2;
    private final Pet cat;
    private final Pet dog;
    Human(Pet parrot1, Pet parrot2, Pet cat, Pet dog){
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
        this.cat = cat;
        this.dog = dog;
    }
    @Override
    public String toString(){
        return "Human has: " + parrot1 + ", "+ parrot2+ ", " + cat + ", " + dog;
    }
}
