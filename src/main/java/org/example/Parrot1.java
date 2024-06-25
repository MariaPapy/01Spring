package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

@Getter
public class Parrot1 implements Pet {
    @Value("${parrot1.name}")
    private String name;
}
