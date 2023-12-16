package me.Sergio.SpringLab3.items;

public class Note extends Item {
    public Note(String name, int height, int width) {
        super(name, height, width);
        System.out.println("Note bean is created");
    }
}
