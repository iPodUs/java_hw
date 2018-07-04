package main.java.People;

import main.java.Skills.Intelligence;
import main.java.Skills.Performance;
import main.java.interfaces.Valuable;

abstract public class Employee implements Valuable {

    private Intelligence intelligence;
    private Performance performance;
    private boolean signatureRight = false;

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public void setSignatureRight(boolean signatureRight) {
        this.signatureRight = signatureRight;
    }

    public boolean isSignatureRight() {
        return signatureRight;
    }

    public void work() {

    }
}
