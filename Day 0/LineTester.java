public class LineTester {
    public static void main(String[] args) {    
        
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(1, 18);
        Point p4 = new Point(4, 13);
        
        
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope(); // slope1 should be -1.25 
        // Should be true, as 5(5) + 4(-2) + (-17) = 0
        //boolean onLine1 = line1.isCoordinateOnLine(5, -2);
        boolean onLine1 = line1.isCoordinateOnLine(p1); 

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope(); // slope2 should be 0.625

        // Should be false as -25(5) + 40(-2) + 30 != 0
        //boolean onLine2 = line2.isCoordinateOnLine(5, -2); 
        boolean onLine2 = line2.isCoordinateOnLine(p1); 


        System.out.println(slope1);
        System.out.println(onLine1);
        System.out.println(slope2);
        System.out.println(onLine2);



        // Point p1 = new Point(2, 7);
        // Point p2 = new Point(1, 4);
        // Point p3 = new Point(1, 18);
        // Point p4 = new Point(4, 13);

        Line pointLine = new Line(p1, p2);

        System.out.println("Using calculateClope(): " + pointLine.calculateSlope());

        System.out.println("Is p1 on the line? " + pointLine.isOnLine(p1));
        System.out.println("Is p2 on the line? " + pointLine.isOnLine(p2));
        System.out.println("Is p3 on the line? " + pointLine.isOnLine(p3));
        System.out.println("Is p4 on the line? " + pointLine.isOnLine(p4));








    }




}