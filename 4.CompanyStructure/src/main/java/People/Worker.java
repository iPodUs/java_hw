package main.java.People;

import main.java.entities.Value;
import main.java.interfaces.Productivitible;

public class Worker extends Employee implements Productivitible {

    @Override
    public void work(){

    }

    private void carry(){

    }

    private void fixUp(){

    }

    private void handle(){

    }

    @Override
    public Value valueCalc() {
        return null;
    }

    @Override
    public int getProductivity() {
        return 0;
    }

    @Override
    public int getOutput() {
        return 0;
    }

    @Override
    public int getAmountOfTime() {
        return 0;
    }

    @Override
    public int getFactor() {
        return 0;
    }
}
