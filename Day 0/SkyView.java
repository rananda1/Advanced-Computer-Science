public class SkyView {

    private double[][] view;

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        // for (int r = 0; r < numberOfRows; r++) {
        // for (int c = 0; c < numberOfCols; c++) {
        // view[r][c] = scanned[];
        // }
        // }
        // int num = 0;
        // for (int r = 0; r < scanned.length; r++) {
        // for (int c = 0; c < numberOfCols; c++) {
        // view[r / numberOfRows][c] = scanned[r];
        // }
        // }

        view = new double[numberOfRows][numberOfCols];
        int num = 0;
        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[num];
                    num += 1;
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[num];
                    num += 1;
                }
            }

        }

    }

    public String toString() {
        String matrixString = "";
        matrixString += "\n";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                matrixString += view[r][c] + " ";
            }
            matrixString += "\n";
        }
        return matrixString;
    }

    public boolean equals(SkyView other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        int total = 0;
        int num = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                total += view[r][c];
                num += 1;
            }
        }

        // for (int r = startRow; r < endRow; r++) {
        // if (r % 2 == 0) {
        // for (int c = startCol; c < endCol; c++) {
        // total += view[r][c];
        // num += 1;
        // }
        // } else {
        // for (int c = startCol; c > endCol; c--) {
        // total += view[r][c];
        // num += 1;
        // }
        // }
        // }
        return (double) total / num;

    }

}
