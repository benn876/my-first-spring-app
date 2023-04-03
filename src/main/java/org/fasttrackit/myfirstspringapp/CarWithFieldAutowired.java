package org.fasttrackit.myfirstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithFieldAutowired {
    @Autowired
    private Engine engine;
}
