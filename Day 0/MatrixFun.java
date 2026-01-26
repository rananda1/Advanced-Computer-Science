public class MatrixFun {

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfCols < 0 || numberOfRows < 0) {
            throw new IllegalArgumentException("Numbers cannot be negative.");
        }
        matrix = new int[numberOfRows][numberOfCols];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
    }

    public MatrixFun() {
        this(3, 3);
    }

    public String toString() {
        String matrixString = "";
        for (int i = 0; i < matrix[0].length * 2 - 1; i++) {
            matrixString += "=";
        }
        matrixString += "\n";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrixString += matrix[r][c] + " ";
            }
            matrixString += "\n";
        }
        for (int i = 0; i < matrix[0].length * 2 - 1; i++) {
            matrixString += "=";
        }
        return matrixString;
    }

    public boolean equals(MatrixFun other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(int[][] other) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (this.matrix[r][c] != other[r][c]) {
                    return false;
                }
            }
        }
        return true;

    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA > matrix.length - 1 || rowB > matrix.length - 1) {
            throw new IllegalArgumentException("Must be valid rows.");
        }
        int[] same = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = same;
    }

}
