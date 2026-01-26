public class MatrixFunTester {

    public static void main(String[] args) {

        MatrixFun matrix1 = new MatrixFun();

        int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println(matrix1.toString());

        System.out.println(matrix1.equals(mat2));

        System.out.println(mat2.toString());

        System.out.println(matrix1.toString());

        matrix1.replaceAll(1, 9);

        System.out.println(matrix1.toString());

        matrix1.swapRow(0, 2);

        System.out.println(matrix1.toString());

        System.out.println(matrix1.equals(mat2));

        try {
            MatrixFun matrix2 = new MatrixFun(-5, -2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
