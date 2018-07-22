package main.java;

public class Calculator {

    public String calculate(String str){
        String result = null;
        Parser parser = new Parser();
        Expression exp = null;

        exp = parser.parseExpression(str);

        try {
            switch (exp.getOperator()) {
                case '+': {
                    result = Double.toString(sum(exp));
                    break;
                }
                case '-': {
                    result = Double.toString(diff(exp));
                    break;
                }
                case '*': {
                    result = Double.toString(prod(exp));
                    break;
                }
                case '/': {
                    result = Double.toString(quot(exp));
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("Вычислить не удалось!");
        }

        return result;
    }

    public double sum(Expression exp){
        return exp.getOperandLeft() + exp.getOperandRight();
    }

    public double diff(Expression exp){
        return exp.getOperandLeft() - exp.getOperandRight();
    }

    public double prod(Expression exp){
        return exp.getOperandLeft() * exp.getOperandRight();
    }

    public Double quot(Expression exp){
        Double result = null;

        try {
            if(exp.getOperandRight() == 0)
                throw new ArithmeticException();

            result = exp.getOperandLeft() / exp.getOperandRight();
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }

        return result;
    }

}
