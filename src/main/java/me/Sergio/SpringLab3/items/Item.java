package me.Sergio.SpringLab3.items;

public abstract class Item {
    private final String name;
    private final int height;
    private final int width;

    public Item(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
//        System.out.println("\tItem constructor is called");
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    //...
}
