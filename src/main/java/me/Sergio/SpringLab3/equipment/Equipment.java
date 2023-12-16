package me.Sergio.SpringLab3.equipment;

import me.Sergio.SpringLab3.Pocket;

public abstract class Equipment {
    private Pocket pocket;
    public Equipment() {
//        System.out.println("\tEquipment constructor is called");
    }
    public Pocket getPocket() {
        return pocket;
    }
    public void setPocket(Pocket pocket) {
        this.pocket = pocket;
    }
}
