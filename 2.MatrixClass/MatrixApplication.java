import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixApplication {
    public static void main(String args[]) throws IOException {

        Matrix matrixA = MatrixCreator.createMatrixFromFile("File_A.txt","A");
        Matrix matrixB = MatrixCreator.createMatrixFromFile("File_B.txt","B");
        
        System.out.println("Matrix: " + matrixA.getName());
        MatrixPrinter.printMatrix(matrixA);

        System.out.println("Matrix: " + matrixB.getName());
        MatrixPrinter.printMatrix(matrixB);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        System.out.println("Hello! \n" +
                "What would you like to calculate? Enter \"S\" for Sum, \"M\" for Multiply, \"D\" for Determinant");
        while (!(line = reader.readLine()).equals("q")) {
            switch (line) {
                case "S": {
                    System.out.println("Matrix Sum:");
                    MatrixPrinter.printMatrix(MatrixCalc.sumMatrix(matrixA, matrixB));
                    break;
                }
                case "M":{
                    System.out.println("Matrix Multiply:");
                    MatrixPrinter.printMatrix(MatrixCalc.multiMatrix(matrixA,matrixB));
                    break;
                }
                case "D": {
                    System.out.println("The determinant of which matrix you want to find? Enter \"1\" or \"2\" or \"both\".");
                    switch (reader.readLine()) {
                        case "1": {
                            System.out.println("Determinant of matrix \"" + matrixA.getName() + "\":");
                            System.out.println(MatrixCalc.findDetMatrix(matrixA));
                            break;
                        }
                        case "2": {
                            System.out.println("Determinant of matrix \"" + matrixB.getName() + "\":");
                            System.out.println(MatrixCalc.findDetMatrix(matrixB));
                            break;
                        }
                        case "both": {
                            System.out.println("Determinant of matrix \"" + matrixA.getName() + "\":");
                            System.out.println(MatrixCalc.findDetMatrix(matrixA));
                            System.out.println("Determinant of matrix \"" + matrixB.getName() + "\":");
                            System.out.println(MatrixCalc.findDetMatrix(matrixB));
                            break;
                        }
                    }
                    break;
                }
                default:
                    System.out.println("I'am not understand. Please enter once again.");
                    System.out.println("What would you like to calculate? Enter \"S\" for Sum, \"M\" for Multiply, \"D\" for Determinant");
            }
        }
    }

}
