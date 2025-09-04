public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        // initialize the private
        length = 5;
        width = 8;
    }

    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;
    }
    
    // a get lets you get the private instance variables from the class
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimieter() {
        int perimeter = length + length + width + width;
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(length^2 + width^2);
        return diagonal;
    }




 }
    


