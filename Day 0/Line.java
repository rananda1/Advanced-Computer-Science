public class Line {
    
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSlope() {
        return (double) -1 * a / b;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (((a * x) + (b * y) + c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line otherLine) {
        if (
            this.a == otherLine.a
                &&
                this.b == otherLine.b
                &&
                this.c == otherLine.c
        ) {
            return true; 
        } else {
            return false; 
        }
    }




















}
