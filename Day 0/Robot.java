public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public void setHallway(int[] hallway) {
        for (int o = 0; o < hallway.length; o++) {
            if (hallway[o] < 0) {
                hallway[o] = 0;
            }
        }
        
        this.hallway = hallway;
    }

    public void setPosition(int position) {
        if (position < 0) {
            this.position = 0;
        } else if (position > hallway.length - 1) {
            this.position = hallway.length - 1;
        } else {
            this.position = position;
        }
        //this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public Robot(int[] hallwayToClean, int startingPosition) {
        //this.hallway = hallwayToClean;
        for (int o = 0; o < hallwayToClean.length; o++) {
            if (hallwayToClean[o] < 0) {
                hallwayToClean[o] = 0;
            }
        }
        
        this.hallway = hallwayToClean;
        //this.position = startingPosition;
        if (startingPosition < 0) {
            this.position = 0;
        } else if (startingPosition > hallway.length - 1) {
            this.position = hallway.length - 1;
        } else {
            this.position = startingPosition;
        }
        isFacingRight = true;
        
        // to-do: implement constructor
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        

        if ((position == hallway.length - 1 && isFacingRight) || (position == 0 && !isFacingRight)) { //hallway[0]) {
            return true;
        } else {
            return false;
        }
        
        
        // to-do: implement this method
        //return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */


    public void moveForward() {
        if (isFacingRight) {
            position += 1;
        } else {
            position -= 1;
        }
    }



    public void turnAround() {
        if (isFacingRight == true) {
            isFacingRight = false;
        } else {
            isFacingRight = true;
        }


    }

    public void pickup() {
        hallway[position] = hallway[position] - 1;
    }







    public void move() {
        


        if (position > hallway.length - 1) {
            position = hallway.length - 1;
        } 

        if (position < 0) {
            position = 0;
        }


        if (hallway[position] > 1) {
            pickup();
        } else if (hallway[position] == 1 && !isRobotBlockedByWall()) {
            pickup();
            moveForward();
        } else if (hallway[position] == 1 && isRobotBlockedByWall()) {
            pickup();
            turnAround();
        } else if (hallway[position] == 0 && !isRobotBlockedByWall()) {
            moveForward();
        } else if (hallway[position] == 0 && isRobotBlockedByWall()) {
            turnAround();
        } 

        
        
        // to-do: implement this method

    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        if (hallIsClear()) {
            System.out.println("The hallway is clear.");
        } else {
            System.out.println("The hallway is not clear yet. \n");
            while (!hallIsClear()) {
                count += 1;
                move();
                displayState();
                //System.out.println("\n");
            }
    
        }
        
        
        // int count = 0;
        // to-do: implement this method

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        int num = 0;
        for (int j = 0; j < hallway.length; j++) {
            if (hallway[j] == 0) {
                num = num + 1;
            }
        }
        if (num == hallway.length) {
            return true;
        } else {
            return false;
        }
        
        
        // to-do: implement this method

        //return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        String finalString = "";
        for (int i = 0; i < hallway.length; i++) {
            finalString = finalString + hallway[i] + " ";
        }
        String spaces = "";
        for (int j = 1; j <= position; j++) {
            spaces = spaces + "  ";
        }
        //String numSpaces = position;

        String sign = "";
        if (isFacingRight == true) {
            sign = ">";
        } else {
            sign = "<";
        }
        
        if (isFacingRight) {
            finalString = finalString + "\n" + spaces + sign; //">";
        }
        // } else {
        //     finalString = finalString + "\n" + spaces + ">";
        // }
        

        System.out.println(finalString);
        
        // to-do: implement this method

    









    }
}
