package main.java.People;

import main.java.entities.Value;

public class DeputyCEO extends Manager {

    public boolean isSignatureRight() {
        return CEO.getInstance().isAbsent();
    }

    @Override
    public Value valueCalc() {
        return null;
    }
}
