package main.java.People;

abstract public class Manager extends Employee {

    private boolean businessOwner;

    public void setBusinessOwner(boolean businessOwner) {
        this.businessOwner = businessOwner;
    }

    public boolean isBusinessOwner() {
        return businessOwner;
    }

    public void negotiate(){

    }
}
