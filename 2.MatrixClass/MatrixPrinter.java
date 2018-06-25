public class MatrixPrinter {
    public static void printMatrix (Matrix matrix){
        if(MatrixValidator.isValidMatrix(matrix)) {
            for (int i = 0; i < matrix.getRowSize(); i++) {
                for (int j = 0; j < matrix.getColSize(); j++) {
                    System.out.print(matrix.getCell(i,j) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
