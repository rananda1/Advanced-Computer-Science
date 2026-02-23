import java.awt.*;

public class Triangle extends Shape {

    // to-do: implement the 2-param Constructor
    public Triangle(int[] xCoord, int[] yCoord) {
        super(xCoord, yCoord);
    }

    public Triangle() {
        this(new int[] { 0, 50, 100 }, new int[] { 0, 75, 50 });
    }

    // get the area of the triangle using the 3 coordinates
    public double getArea() {
        return Math.abs((xCoord[0] * (yCoord[1] - yCoord[2]) + xCoord[1] * (yCoord[2] - yCoord[0])
                + xCoord[2] * (yCoord[0] - yCoord[1])) / 2);
    }

    public String toString() {
        return super.toString() + " This shape is a triangle with coordinates (" + xCoord[0] + ", " + yCoord[0] + "), ("
                + xCoord[1] + ", " + yCoord[1] + "), and (" + xCoord[2] + ", " + yCoord[2] + ").";
    }

    // to-do: implement the draw method
    public void draw(Graphics g) {
        Graphics2D g2D = (Graphics2D) g; // initializes a 2D graphics component
        g2D.setPaint(getFillColor()); // sets the paint color to Pink

        g2D.drawPolygon(xCoord, yCoord, 3);
        g2D.fillPolygon(xCoord, yCoord, 3);

        // g2D.fillPolygon(xCoord[0], yCoord[0]); // draws a rectangle (filled in with
        // pink)

        // g2D.setPaint(Color.red); // sets the paint color to red
        g2D.setStroke(new BasicStroke(5)); // changes the line stroke width to 5
        // g2D.drawRect(xCoord[0], yCoord[0]); // draws a rectangle outline
    }

}

// public class Triangle extends Polygon {

// private double base;
// private double height;

// public double getBase() {
// return base;
// }

// public void setLength(double base) {
// this.base = base;
// }

// public double getHeight() {
// return height;
// }

// public void setWidth(double height) {
// this.height = height;
// }

// public Triangle(double base, double height) {
// super(3);
// this.base = base;
// this.height = height;
// }

// public Triangle() {
// this(3, 4);
// }

// public double getArea() {
// return (height * base * 1 / 2);
// }

// public String toString() {
// return super.toString() + "/nIt is a triangle with a base of " + base + " and
// a height of " + height
// + ". Its area is " + getArea() + ".";
// }

// }
