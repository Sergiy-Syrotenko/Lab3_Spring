package me.Sergio.SpringLab3.equipment;

import me.Sergio.SpringLab3.Pocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pants extends Equipment {
    public Pants(){
        System.out.println("Pants bean is created");
    }
    @Autowired
    @Qualifier("smallPocket")
    public void setPocket(Pocket pocket) {
        super.setPocket(pocket);
    }
}
