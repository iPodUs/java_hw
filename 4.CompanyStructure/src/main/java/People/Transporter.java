package main.java.People;

import main.java.entities.Value;
import main.java.interfaces.Productivitible;

public class Transporter extends Employee implements Productivitible {

    @Override
    public void work(){

    }

    private void transport(){

    }

    private void unload(){

    }

    private void load(){

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
