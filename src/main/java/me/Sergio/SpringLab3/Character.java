package me.Sergio.SpringLab3;

import me.Sergio.SpringLab3.equipment.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Character {
    private String name;
    private Equipment head;
    private Equipment body;
    private Equipment legs;

    public Character() {
        System.out.println("Character bean is created");
    }

    public String getName() {
        return name;
    }

    @Value("${player.name}")
    public void setName(String name) {
        this.name = name;
    }

    public Equipment getHead() {
        return head;
    }

    @Autowired
    @Qualifier("helmet")
    public void setHead(Equipment head) {
        this.head = head;
    }

    public Equipment getBody() {
        return body;
    }

    @Autowired
    @Qualifier("vest")
    public void setBody(Equipment body) {
        this.body = body;
    }

    public Equipment getLegs() {
        return legs;
    }

    @Autowired
    @Qualifier("pants")
    public void setLegs(Equipment legs) {
        this.legs = legs;
    }
}

