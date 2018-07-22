package main.java;

import main.java.exceptions.ValidationException;

public class Parser {
    Validator validator = new Validator();

    public Expression parseExpression(String str){
        Expression exp = null;

        try {
            if(!validator.validateExpression(str)){
                throw new ValidationException();
            }

            str = str.replaceAll("[()]","").replaceAll("\\s","");

            char operator;
            int operatorIdx = -1;

            operator = str.replaceFirst("[-]??[0-9]\\d*(\\.\\d+)?","").charAt(0);

            if(operator == '-' && str.charAt(0) == '-'){
                operatorIdx = str.indexOf(operator,1);
            } else {
                operatorIdx = str.indexOf(operator);
            }

            String operandLeft = str.substring(0,operatorIdx);
            String operandRight = str.substring(operatorIdx+1);

            //Debug
            //System.out.println("Left: " + operandLeft);
            //System.out.println("Right: " + operandRight);

            if(!validator.validateOperand(operandLeft) || !validator.validateOperand(operandRight)){
                throw new ValidationException();
            }

            exp = new Expression(Double.valueOf(operandLeft),Double.valueOf(operandRight),operator);

        } catch (ValidationException e) {
            System.out.println("Ошибка валидации!");
        }

        return exp;
    }

}
