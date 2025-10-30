public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;


    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "cat";
        this.ownerName = "Rose";
        this.moodLevel = 5;
        this.catId = "1234";
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    public String generateCatTag() {
        return "" + this.catId + this.catChar;
    }

    public String toString() {
        String catMoodMessage = PurrfectUtils.determineCatMood(this);
        return "== About " + this.name + " ==\n" + this.name
        + " is a cat.\nTheir tag is " + generateCatTag() + ".\n" + catMoodMessage;
    }

    public boolean equals(Cat other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }







































}







































































































// //lowercased public and fixed it to say Cat because it was plural
// public class Cat {
// 	private String name;
// 	private String breed;
// 	private boolean isHungry;
// 	private int livesRemaining;
	
// 	// 2-Parameter Constructor
//     //capitalized Cat, added this. to name and breed, added an input for breed, switched yes to true
// 	public Cat(String name, String breed) {
// 		this.name = name;
// 		this.breed = breed;
// 		this.isHungry = true;
// 		livesRemaining = 9;
// 	}
// // for the getters i changed void to the data type

// 	public String getName() {
// 		return name;
// 	}

// 	public void setName(String name) {
// 		this.name = name;
// 	}
// //added a get and set breed

// public String getBreed() {
//     return breed;
// }

// public void setBreed(String breed) {
//     this.breed = breed;
// }



// // camel cased ishungry
// 	public boolean getIsHungry(){
// 		return isHungry;
// 	}

// 	public void feed() {
// 		this.isHungry = false;
// 	}
// //added another equals sign and changed way of saying equals for string name and put && on separate line
// //added and if statement
// 	public boolean equals(Cat other) {
//         if (
//             this.name.equals(other.name)
//                 &&
//                 this.breed.equals(other.breed)
//                 &&
//                 this.livesRemaining == other.livesRemaining
//         ) {
//             return true;
//         } else {
//             return false;
//         }
// 	}
// //took away system output part of tostring and made it just return
// 	public String toString() {
// 		 return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
// 	}










// }