package com.ipodushin.java_edu.task.task3;

public class Horse extends Animal {
    private String coat_colors;

    public Horse(String name) {
        super(name);
    }

    public String getCoat_colors() {
        return coat_colors;
    }

    public void setCoat_colors(String coat_colors) {
        this.coat_colors = coat_colors;
    }

    public String toString(){
        return "Лошадь " + this.getName() + " масти " + this.getCoat_colors();
    }
}
