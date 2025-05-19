package org.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Airtel calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel data");
    }
}
