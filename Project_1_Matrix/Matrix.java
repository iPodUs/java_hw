import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Matrix {
    public static void main(String args[]){

        int[][] matrixA = createMatrixFromFile("File_A.txt");
        int[][] matrixB = createMatrixFromFile("File_B.txt");
        
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        System.out.println("Matrix Sum:");
        printMatrix(sumMatrix(matrixA,matrixB));

        System.out.println("Matrix Multiply:");
        printMatrix(multiMatrix(matrixA,matrixB));

        System.out.println("Matrix A Determinant:");
        System.out.println(findDetMatrix(matrixA));

        System.out.println("Matrix B Determinant:");
        System.out.println(findDetMatrix(matrixB));

    }

    public static int[][] createMatrixFromFile (String fileName){
        int[][] matrix = null;

        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine(); //first line

            String[] sizeMatrix = line.split(" ");

            matrix = new int[Integer.parseInt(sizeMatrix[0])][Integer.parseInt(sizeMatrix[1])];

            reader.readLine(); //blank line

            int currRow = 0;
            while ((line = reader.readLine()) != null) {
                String[] rowArr = line.split(" ");

                if(rowArr.length == matrix[currRow].length) {
                    for (int j = 0; j < matrix[currRow].length; j++) {
                        matrix[currRow][j] = Integer.parseInt(rowArr[j]);
                    }
                } else {
                    System.out.println("File parsing error. Size params doesn't match with matrix.");
                }
                currRow++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: Some trouble with reading file.");
            e.printStackTrace();
        }

        return matrix;
    }

    public static void printMatrix (int[][] matrix){
        if(isValidMatrix(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static boolean isValidMatrix(int[][] matrix){
        if (matrix == null) {
            System.out.println("Matrix is null.");
            return false;
        }
        try {
            int rowSize = matrix[0].length;
            for (int i = 1; i < matrix.length; i++) {
                if (rowSize != matrix[i].length){
                    System.out.println("Matrix has rows different length.");
                    return false;
                }
                rowSize = matrix[i].length;
            }
        } catch (NullPointerException e) {
            System.out.println("Matrix has null row.");
            return false;
        }

        return true;
    }

    public static int[][] sumMatrix (int[][] matrixA, int[][] matrixB){
        int[][] matrixC = null;

        if(!isValidMatrix(matrixA) || !isValidMatrix(matrixB)){
            System.out.println("Some matrix isn't valid!");
            return null;
        }

        if(matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length){
            matrixC = new int[matrixA.length][matrixA[0].length];

            for(int i = 0; i < matrixA.length; i++){
                for(int j = 0; j < matrixA[i].length; j++){
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } else {
            System.out.println("I can't sum! Matrices A and B are not the same size.");
        }

        return matrixC;
    }

    public static int[][] multiMatrix (int[][] matrixA, int[][] matrixB){
        int[][] matrixC = null;

        if(!isValidMatrix(matrixA) || !isValidMatrix(matrixB)){
            System.out.println("Some matrix isn't valid!");
            return null;
        }

        if(matrixA[0].length == matrixB.length){ // matrixA count of columns == matrixB count of rows
            matrixC = new int[matrixA.length][matrixB[0].length];

            for(int i = 0; i < matrixA.length; i++){
                int col2 = 0;
                while(col2 < matrixB[0].length) {
                    int number = 0;
                    for (int j = 0; j < matrixA[i].length; j++) {
                        number = number + (matrixA[i][j] * matrixB[j][col2]);
                    }
                    matrixC[i][col2] = number;
                    col2++;
                }
            }
        } else {
            System.out.println("I can't multiply! Matrices A and B are not consistent.");
        }

        return matrixC;
    }

    public static int findDetMatrix (int[][] matrix){
        int det = 0;

        if(!isValidMatrix(matrix)){
            System.out.println("Matrix isn't valid!");
            return -1;
        }

        if(matrix.length != matrix[0].length){
            System.out.println("I can't find determinant of a matrix because it isn't square!");
            return -1;
        }

        if(matrix.length == 1){
            det = matrix[0][0];
        }

        if(matrix.length == 2){
            det = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }

        if(matrix.length > 2){
            int i = 0; //decomposition row
            for(int j = 0; j < matrix[i].length; j++){
                det = det + (int) (Math.pow(-1, ((i+1)+(j+1)))) * matrix[i][j] * findDetMatrix(findMinor(matrix,i,j));
            }
        }

        return det;
    }

    public static int[][] findMinor (int[][] matrix, int x, int y){
        int[][] minor = new int[matrix.length-1][matrix.length-1];

        int[] buffer = new int[(matrix.length-1)*(matrix.length-1)];
        int k = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == x || j == y) continue;
                buffer[k] = matrix[i][j];
                k++;
            }
        }

        k = 0;

        for(int i = 0; i < minor.length; i++){
            for(int j = 0; j < minor[i].length; j++){
                minor[i][j] = buffer[k];
                k++;
            }
        }

        return minor;
    }

}
