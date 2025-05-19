package org.example.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("Jio calling");
    }

    @Override
    public void data() {
        System.out.println("Jio data");
    }
}
