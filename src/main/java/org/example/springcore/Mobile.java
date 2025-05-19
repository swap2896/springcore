package org.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    @Autowired
    private Sim sim;

    public void useSim(){
        sim.data();
        sim.calling();
    }
}
