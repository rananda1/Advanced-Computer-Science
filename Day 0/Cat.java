//lowercased public and fixed it to say Cat because it was plural
public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
    //capitalized Cat, added this. to name and breed, added an input for breed, switched yes to true
	public Cat(String name, String breed) {
		this.name = name;
		this.breed = breed;
		this.isHungry = true;
		livesRemaining = 9;
	}
// for the getters i changed void to the data type

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//added a get and set breed

public String getBreed() {
    return breed;
}

public void setBreed(String breed) {
    this.breed = breed;
}



// camel cased ishungry
	public boolean getIsHungry(){
		return isHungry;
	}

	public void feed() {
		this.isHungry = false;
	}
//added another equals sign and changed way of saying equals for string name and put && on separate line
//added and if statement
	public boolean equals(Cat other) {
        if (
            this.name.equals(other.name)
                &&
                this.breed.equals(other.breed)
                &&
                this.livesRemaining == other.livesRemaining
        ) {
            return true;
        } else {
            return false;
        }
	}
//took away system output part of tostring and made it just return
	public String toString() {
		 return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}










}