package org.example;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class Cat implements Pet {
    @Value("${cat.name}")
    private String name;
}