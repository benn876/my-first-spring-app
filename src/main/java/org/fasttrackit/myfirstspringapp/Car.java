package org.fasttrackit.myfirstspringapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        System.out.println("Car was created");
        System.out.println(engine);
        this.engine = engine;
    }
}
