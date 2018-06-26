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
        return this.getLength() > 0 ? "Кит " + this.getName() + " длиной " + this.getLength() + " метра(ов)" :
                "Кит " + this.getName() + ". Неизвестной длины";
    }
}
