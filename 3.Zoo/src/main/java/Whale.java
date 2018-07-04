package main.java;

public class Whale extends Animal {
    private int length;

    public Whale(String name) {
        super(name);
        this.setWaterfowl(true);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString(){
        return this.getLength() > 0 ? String.format("Кит %s длиной %s метра(ов)",this.getName(),this.getLength()) :
                String.format("Кит %s. Неизвестной длины",this.getName());
    }
}
