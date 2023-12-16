package me.Sergio.SpringLab3.equipment;

import me.Sergio.SpringLab3.Pocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vest extends Equipment {
    public Vest(){
        System.out.println("Vest bean is created");
    }
    @Autowired
    @Qualifier("largePocket")
    public void setPocket(Pocket pocket) {
        super.setPocket(pocket);
    }
}
