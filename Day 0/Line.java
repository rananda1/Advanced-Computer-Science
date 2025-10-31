public class Line {
    
    private int a;
    private int b;
    private int c;

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY()); 

        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }



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
        //return (double) ((p1.getX() - p2.getX()) / (p1.getY() - p2.getY()));
    }

    public double calculateSlopeFromPoints() {
        return (double) ((p1.getX() - p2.getX()) / (p1.getY() - p2.getY()));
    }

    //public boolean isCoordinateOnLine(int x, int y) {
    //    //if (((a * x) + (b * y) + c) == 0) {
    public boolean isCoordinateOnLine(Point p) {
        if (((a * p.getX()) + (b * p.getY()) + c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnLine(Point p) {
        if (((a * p.getX()) + (b * p.getY()) + c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //public double calculateSlope()


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


    public String generatePointSlopeFormula() {
        return "" + "(y - " + p1.getY() + ") = " 
            + calculateSlope() + "(x - " + p1.getX() + ")";
    }





    




















}
