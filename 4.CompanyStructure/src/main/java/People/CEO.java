package main.java.People;

import main.java.entities.Value;

public class CEO extends Manager {
    private static CEO instance;

    boolean isAbsent;

    private CEO(){
        super.setSignatureRight(true);
    }

    public static synchronized CEO getInstance() {
        if (instance == null) {
            instance = new CEO();
        }
        return instance;
    }

    public void setAbsent(boolean absent) {
        isAbsent = absent;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    @Override
    public Value valueCalc() {
        return null;
    }
}
