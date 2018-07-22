package main.java;

public class Expression {
    private double operandLeft;
    private double operandRight;
    private char operator;

    public Expression(double operandLeft, double operandRight, char operator) {
        this.operandLeft = operandLeft;
        this.operandRight = operandRight;
        this.operator = operator;
    }

    public double getOperandLeft() {
        return operandLeft;
    }

    public void setOperandLeft(double operandLeft) {
        this.operandLeft = operandLeft;
    }

    public double getOperandRight() {
        return operandRight;
    }

    public void setOperandRight(double operandRight) {
        this.operandRight = operandRight;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
