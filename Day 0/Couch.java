public class Couch {
    // comfortable
    // wooden parts
    // four legs per couch
    // different sections
    // light gray

    private int couchlegsnumber; // = 4;
    private String color; // = "light gray";
    private double couchlengthfeet; // = 4.5;
    private String couchfeel; // = "comfortable";
    private boolean comfycouch; // = true;
    private char firstletter; // = 'C';

    public Couch() {
        couchlegsnumber = 4;
        color = "light gray";
        couchlengthfeet = 4.5;
        couchfeel = "comfortable";
        comfycouch = true;
        firstletter = 'C';
    }

    public void sit() {
        System.out.println("You are sitting on the couch.");
    }

    public void holdstuff() {
        couchfeel = "useful";
        System.out.println("There is stuff on the couch, so it is " + couchfeel + ".");
    }

    public void broken(int howManyCouchLegsToBreak) {
        if (howManyCouchLegsToBreak > couchlegsnumber) {
            System.out.println("There are only " + couchlegsnumber + " legs on the couch that you can break.");
            couchlegsnumber = 0;
        } else {
            couchlegsnumber = couchlegsnumber - howManyCouchLegsToBreak;
            System.out.println("The couch now only has " + couchlegsnumber + " legs.");
        }
        //couchlegsnumber = 3;
        //System.out.println("The couch has " + couchlegsnumber + " legs.");
        // System.out.println(couchlegsnumber);
        // System.out.println(" legs.");
    }

    public void fix() {
        System.out.println("The couch is now fixed.");
    }
   
    // sit on couch
    // put stuff on couch
    // couch can be broken
    // couch can be fixed
}