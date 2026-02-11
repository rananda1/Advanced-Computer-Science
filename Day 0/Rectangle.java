public class Rectangle extends Polygon {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this(3, 4);
    }

    public double getArea() {
        return (length * width);
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + length + " and a wdith of " + width + ".";
    }

}

// public class Rectangle {
// private int length;
// private int width;
// private int area;
// private int perimeter;
// private double diagonal;

// public Rectangle() {
// // initialize the private
// length = 5;
// width = 8;
// }

// public Rectangle(int desiredLength, int desiredWidth) {
// length = desiredLength;
// width = desiredWidth;
// }

// public Rectangle(int squareSideLength) {
// length = squareSideLength;
// width = squareSideLength;
// }

// // a get lets you get the private instance variables from the class
// public int getLength() {
// return length;
// }

// public int getWidth() {
// return width;
// }

// // setters
// public void setLength(int newLength) {
// length = newLength;
// }

// public void setWidth(int newWidth) {
// width = newWidth;
// }

// public int getArea() {
// area = length * width;
// return this.area;
// }

// public int getPerimeter() {
// perimeter = length + length + width + width;
// return this.perimeter;
// }

// public double getDiagonal() {
// diagonal = Math.sqrt((length * length) + (width * width));
// return this.diagonal;
// }

// public boolean equals(Rectangle otherRectangle) {
// if (
// this.width == otherRectangle.width
// &&
// this.length == otherRectangle.length
// ) {
// return true;
// }
// return false;

// }

// public int calculateArea() {
// int area = length * width;
// return area;
// }

// public int calculatePerimeter() {
// int perimeter = length + length + width + width;
// return perimeter;
// }

// public double calculateDiagonal() {
// double diagonal = Math.sqrt(length ^ 2 + width ^ 2);
// return diagonal;
// }

// }
