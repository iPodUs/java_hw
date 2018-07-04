package main.java;

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
        return String.format("Лошадь %s масти %s", this.getName(), this.getCoat_colors());
    }
}
