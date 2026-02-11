public class Triangle extends Polygon {

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setLength(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        this(3, 4);
    }

    public double getArea() {
        return (height * base * 1 / 2);
    }

    public String toString() {
        return super.toString() + "/nIt is a triangle with a base of " + base + " and a height of " + height
                + ". Its area is " + getArea() + ".";
    }

}
