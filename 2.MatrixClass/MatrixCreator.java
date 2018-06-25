import java.io.*;

public class MatrixCreator {
    public static Matrix createMatrixFromFile (String fileName){
        Matrix matrix = null;

        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine(); //first line declare size params (rows and columns) of matrix

            String[] sizeMatrix = line.split(" ");

            matrix = new Matrix(Integer.parseInt(sizeMatrix[0]),Integer.parseInt(sizeMatrix[1]));

            reader.readLine(); //blank line

            int currRow = 0;
            while ((line = reader.readLine()) != null) {
                String[] rowArr = line.split(" ");

                if(rowArr.length == matrix.getColSize()) {
                    for (int j = 0; j < matrix.getColSize(); j++) {
                        matrix.setCell(currRow,j,Integer.parseInt(rowArr[j]));
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

    public static Matrix createMatrixFromFile (String fileName, String name){
        Matrix matrix = MatrixCreator.createMatrixFromFile(fileName);
        matrix.setName(name);
        return matrix;
    }
}
