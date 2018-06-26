package main.java;

public abstract class Animal {
    private String name; //название
    private String genus = "Неизвестно"; //род
    private String order = "Неизвестно"; //отряд

    private double weight; //вес
    private double speed; //скорость передвижения

    private boolean waterfowl; //водоплавающее

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWaterfowl(boolean waterfowl) {
        this.waterfowl = waterfowl;
    }

    public boolean isWaterfowl() {
        return waterfowl;
    }

    public String toString(){
        return "Животное " + this.getName();
    }
}
