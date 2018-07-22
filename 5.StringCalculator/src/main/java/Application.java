package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while (!(line = reader.readLine()).equals("q")) {
            Function<String,String> strCalc;

            strCalc = (str) -> calc.calculate(str);

            System.out.println(strCalc.apply(line));
            System.out.println();
        }

    }
}
