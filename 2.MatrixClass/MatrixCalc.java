public class MatrixCalc {
    public static Matrix sumMatrix (Matrix matrixA, Matrix matrixB){
        Matrix matrixC = null;

        if(MatrixValidator.isValidMatricesForSum(matrixA,matrixB)){
            matrixC = new Matrix(matrixA.getRowSize(),matrixA.getColSize());

            for(int i = 0; i < matrixA.getRowSize(); i++){
                for(int j = 0; j < matrixA.getColSize(); j++){
                    matrixC.setCell(i,j,matrixA.getCell(i,j) + matrixB.getCell(i,j));
                }
            }
        }

        return matrixC;
    }

    public static Matrix multiMatrix (Matrix matrixA, Matrix matrixB){
        Matrix matrixC = null;

        if(MatrixValidator.isValidMatricesForMultiply(matrixA,matrixB)){ // matrixA count of columns == matrixB count of rows
            matrixC = new Matrix(matrixA.getRowSize(),matrixB.getColSize());

            for(int i = 0; i < matrixA.getRowSize(); i++){
                int col2 = 0;
                while(col2 < matrixB.getColSize()) {
                    int number = 0;
                    for (int j = 0; j < matrixA.getColSize(); j++) {
                        number = number + (matrixA.getCell(i,j) * matrixB.getCell(j,col2));
                    }
                    matrixC.setCell(i,col2,number);
                    col2++;
                }
            }
        }

        return matrixC;
    }

    public static Integer findDetMatrix (Matrix matrix){
        Integer det = 0;

        if(!MatrixValidator.isValidMatrixForDet(matrix))
            return null;

        if(matrix.getRowSize() == 1){
            det = matrix.getCell(0,0);
        }

        if(matrix.getRowSize() == 2){
            det = matrix.getCell(0,0) * matrix.getCell(1,1) - matrix.getCell(1,0) * matrix.getCell(0,1);
        }

        if(matrix.getRowSize() > 2){
            int i = 0; //decomposition row
            for(int j = 0; j < matrix.getColSize(); j++){
                det = det + (int) (Math.pow(-1, ((i+1)+(j+1)))) * matrix.getCell(i,j) * findDetMatrix(matrix.findMinor(matrix,i,j));
            }
        }

        return det;
    }
}
