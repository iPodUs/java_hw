package ru.edu.javalearn.services;

import ru.edu.javalearn.exceptions.*;

public class Validator {
    public static final int OPRND_LENGTH = 4;

    public boolean validateExpression(String str) {

        try {
            if(!str.matches(".*[+*/-].*"))
                throw new ArithmeticOperatorNotFindException();

            String[] expArray = str.split("[+*/-]");

            if(expArray.length < 2)
                throw new FewOperandException();

        } catch (ArithmeticOperatorNotFindException e) {
            System.out.println("Арифметический оператор не обнаружен!");
            return false;
        } catch (FewOperandException e){
            System.out.println("Недостаточно аргументов для вычисления!");
            return false;
        }

        return true;
    }

    public boolean validateOperand(String str) {
        try {
            if(str.isEmpty())
                throw new EmptyArgumentException();

            if(!str.matches("^[-]??[0-9]\\d*(\\.\\d+)?$"))
                throw new IllegalArgumentException();

            if(str.length() > OPRND_LENGTH)
                throw new SizeOperandException();

        } catch (EmptyArgumentException e) {
            System.out.println("Аргумент не может быть пустым!");
            return false;
        } catch (IllegalArgumentException e){
            System.out.println("Аргумент может содержать только числа!");
            return false;
        } catch (SizeOperandException e) {
            System.out.println("Размер аргумента превышает ограничение в " + OPRND_LENGTH + " символа");
            return false;
        }

        return true;
    }
}
