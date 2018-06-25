public class MatrixValidator {
    public static boolean isValidMatrix(Matrix matrix){
        if (matrix == null) {
            System.out.println("Matrix \"" + matrix.getName() + "\" is null.");
            return false;
        }
        try {
            int rowSize = matrix.getMatrix()[0].length;
            for (int i = 1; i < matrix.getMatrix().length; i++) {
                if (rowSize != matrix.getMatrix()[i].length){
                    System.out.println("Matrix \"" + matrix.getName() + "\" has rows different length.");
                    return false;
                }
                rowSize = matrix.getMatrix()[i].length;
            }
        } catch (NullPointerException e) {
            System.out.println("Matrix \"" + matrix.getName() + "\" has null row.");
            return false;
        }

        return true;
    }

    public static boolean isValidMatricesForSum(Matrix matrixA, Matrix matrixB){
        if(!MatrixValidator.isValidMatrix(matrixA) | !MatrixValidator.isValidMatrix(matrixB)) {
            System.out.println("I can't sum! Some matrix isn't valid!");
            return false;
        }

        if(!(matrixA.getRowSize() == matrixB.getRowSize()) || !(matrixA.getColSize() == matrixB.getColSize())) {
            System.out.println("I can't sum! Matrices \"" + matrixA.getName() + "\" and \""
                    + matrixB.getName() + "\" are not the same size.");
            return false;
        }

        return true;
    }

    public static boolean isValidMatricesForMultiply(Matrix matrixA, Matrix matrixB){
        if(!MatrixValidator.isValidMatrix(matrixA) | !MatrixValidator.isValidMatrix(matrixB)) {
            System.out.println("I can't sum! Some matrix isn't valid!");
            return false;
        }

        if(!(matrixA.getColSize() == matrixB.getRowSize())) {
            System.out.println("I can't multiply! Matrices \"" + matrixA.getName() + "\" and \""
                    + matrixB.getName() + "\" are not consistent.");
            return false;
        }

        return true;
    }

    public static boolean isValidMatrixForDet(Matrix matrix){
        if(!MatrixValidator.isValidMatrix(matrix)){
            System.out.println("Matrix \"" + matrix.getName() + "\" isn't valid!");
            return false;
        }

        if(matrix.getRowSize() != matrix.getColSize()){
            System.out.println("I can't find determinant of a matrix \"" + matrix.getName() + "\" because it isn't square!");
            return false;
        }

        return true;
    }
}
