package org.fasttrackit.myfirstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithSetterAutowired {
    private Engine engine;

    public CarWithSetterAutowired(){
        System.out.println("create this one");
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
