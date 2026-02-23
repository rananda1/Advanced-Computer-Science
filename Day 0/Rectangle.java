import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape {
    private int length;
    private int width;

    // Constructor that takes in 2 coordinates and the dimensions of the rectangle
    public Rectangle(int xCoord, int yCoord, int length, int width) {
        super(new int[] { xCoord }, new int[] { yCoord });
        this.length = length;
        this.width = width;

    }

    // Constructor that takes in the dimensions of the rectangle, sets default
    // coordinates to (0, 0)
    public Rectangle(int length, int width) {
        this(0, 0, length, width);
    }

    // Returns the area of the rectangle
    public double getArea() {
        return (double) this.length * this.width;
    }

    // Sets the coordinates of the rectangle, notice that it converts the x and y
    // coordinates to arrays
    public void setCoordinates(int xCoord, int yCoord) {
        this.xCoord[0] = xCoord;
        this.yCoord[0] = yCoord;
    }

    public String toString() {
        return "This shape is a Rectangle with a length of " + length + " and a width of " + width + " and an area of "
                + getArea() + ".";
    }

    // Draws the rectangle
    public void draw(Graphics g) {

        Graphics2D g2D = (Graphics2D) g; // initializes a 2D graphics component
        g2D.setPaint(getFillColor()); // sets the paint color to Pink
        g2D.fillRect(xCoord[0], yCoord[0], length, width); // draws a rectangle (filled in with pink)

        // g2D.setPaint(Color.red); // sets the paint color to red
        g2D.setStroke(new BasicStroke(5)); // changes the line stroke width to 5
        g2D.drawRect(xCoord[0], yCoord[0], length, width); // draws a rectangle outline

    }

}

// public class Rectangle extends Polygon {

// private double length;
// private double width;

// public double getLength() {
// return length;
// }

// public void setLength(double length) {
// this.length = length;
// }

// public double getWidth() {
// return width;
// }

// public void setWidth(double width) {
// this.width = width;
// }

// public Rectangle(double width, double length) {
// super(4);
// this.width = width;
// this.length = length;
// }

// public Rectangle() {
// this(3, 4);
// }

// public double getArea() {
// return (length * width);
// }

// public String toString() {
// return super.toString() + "\nIt is a rectangle with a length of " + length +
// " and a wdith of " + width + ".";
// }

// }
// different one

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
