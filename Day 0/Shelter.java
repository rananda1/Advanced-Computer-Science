import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (cols <= 0 || rows <= 0) {
            throw new IllegalArgumentException("Numbers cannot be negative or equal to zero.");
        }
        this.kennels = new Dog[rows][cols];
        // to-do: implement this constructor
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null.");
        }
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (this.kennels[r][c] == null) {
                    this.kennels[r][c] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");
        // to-do: implement this method
    }

    public void add(Dog animal, int row, int col) {
        // to-do: implement this method

        checkParameters(row, col);

        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null.");
        }

        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }

    }

    public void add(ArrayList<Dog> animals) {
        // to-do: implement this method
        if (animals == null) {
            throw new IllegalArgumentException("Animals cannot be null.");
        }
        int num = animals.size();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) == null) {
                throw new IllegalArgumentException("An animal cannot be null.");
            }
            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    if (this.kennels[r][c] == null) {
                        this.kennels[r][c] = animals.get(i);
                        num -= 1;
                        i += 1;
                        // return;
                    }
                }
            }
            // System.out.println("No empty kennels.");
        }
        if (num != 0) {
            System.out.println("No empty kennels.");
        }
    }

    public Dog adopt(int row, int col) {
        // to-do: implement this method

        checkParameters(row, col);

        Dog returned = null;
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("You cannot adopt a null dog.");
        }
        if (kennels[row][col] != null) {
            kennels[row][col] = null;
            returned = kennels[row][col];
        }
        return returned;
        // return new Dog();

    }

    public ArrayList<Dog> search(String name) {
        // to-do: implement this method
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        ArrayList<Dog> results = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (this.kennels[r][c].getName().equals(name)) {
                    results.add(this.kennels[r][c]);

                }
            }
        }
        return results;
    }

    public ArrayList<Dog> search(int age) {
        // to-do: implement this method
        if (age < 0) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        ArrayList<Dog> results = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (this.kennels[r][c].getAge() == age) {
                    results.add(this.kennels[r][c]);

                }
            }
        }
        return results;

    }

    public void checkParameters(int row, int col) {
        int num2 = 0;
        for (int r = 0; r < kennels.length; r++) {
            if (num2 == 2) {
                return;
            }
            if (r == row) {
                num2 += 1;
            }

            for (int c = 0; c < kennels[r].length; c++) {
                if (num2 == 2) {
                    return;
                }
                if (c == col) {
                    num2 += 1;
                }
            }
        }
        if (num2 != 2) {
            throw new IllegalArgumentException("Coordinates must be valid.");
        }
    }
}
