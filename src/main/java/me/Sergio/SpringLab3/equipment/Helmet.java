package me.Sergio.SpringLab3.equipment;

import org.springframework.stereotype.Component;

@Component
public class Helmet extends Equipment {
    Helmet() {
        System.out.println("Helmet bean is created");
    }
}
