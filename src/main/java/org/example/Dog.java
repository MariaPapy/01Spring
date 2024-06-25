package org.example;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class Dog implements Pet{
    @Value("${dog.name}")
    private String name;
}
