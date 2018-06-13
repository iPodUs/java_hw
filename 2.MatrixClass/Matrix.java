public class Matrix {
    private String name = "Undefined";

    private int[][] matrix;

    public Matrix(int rowSize, int colSize){
        matrix = new int[rowSize][colSize];
    }

    public Matrix(int rowSize, int colSize, String name){
        this(rowSize,colSize);
        this.name = name;
    }

    public Matrix(Matrix matrix, String name){
        this.matrix = matrix.getMatrix();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRowSize() {
        return matrix.length;
    }

    public int getColSize() {
        return matrix[0].length;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setCell(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public int getCell(int row, int col) {
        return matrix[row][col];
    }

    public Matrix findMinor (Matrix matrix, int row, int col){
        int minorSize = matrix.getRowSize()-1;
        Matrix minor = new Matrix(minorSize,minorSize);

        int[] buffer = new int[minorSize * minorSize];
        int k = 0;

        for(int i = 0; i < matrix.getRowSize(); i++){
            for(int j = 0; j < matrix.getColSize(); j++){
                if(i == row || j == col) continue;
                buffer[k] = matrix.getCell(i,j);
                k++;
            }
        }

        k = 0;

        for(int i = 0; i < minor.getRowSize(); i++){
            for(int j = 0; j < minor.getColSize(); j++){
                minor.setCell(i,j,buffer[k]);
                k++;
            }
        }

        return minor;
    }
}
