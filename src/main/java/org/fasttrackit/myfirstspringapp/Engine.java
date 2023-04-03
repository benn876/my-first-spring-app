package org.fasttrackit.myfirstspringapp;

import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Engine {
    private int horsePower;


    public Engine() {
        System.out.println("One Engine was created");
        horsePower = 100;
    }

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

}
