// public class PetCat {
//     private String name;
//     private String ownerName;
//     private int moodLevel;
//     private String catId;
//     private char catChar;
//     private boolean isHungry;


//     public char getCatChar() {
//         return catChar;
//     }

//     public void setCatChar(char catChar) {
//         this.catChar = catChar;
//     }

//     public String getCatId() {
//         return catId;
//     }

//     public void setCatId(String catId) {
//         this.catId = PurrfectUtils.validateCatId(catId);
//     }

//     public int getMoodLevel() {
//         return moodLevel;
//     }

//     public void setMoodLevel(int moodLevel) {
//         this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getOwnerName() {
//         return ownerName;
//     }

//     public void setOwnerName(String ownerName) {
//         this.ownerName = ownerName;
//     }

//     public boolean getIsHungry() {
//         return isHungry;
//     }

//     public void setIsHungry(boolean isHungry) {
//         this.isHungry = isHungry;
//     }

//     public PetCat(String name, String ownerName, int moodLevel, String catId) {
//         this.name = name;
//         this.ownerName = ownerName;
//         this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
//         this.catId = PurrfectUtils.validateCatId(catId);
//         this.catChar = PurrfectUtils.generateCatChar(this.catId);
//         this.isHungry = true;
//     }

//     public PetCat() {
//         this.name = "cat";
//         this.ownerName = "Rose";
//         this.moodLevel = 5;
//         this.catId = "1234";
//         this.catChar = PurrfectUtils.generateCatChar(this.catId);
//         this.isHungry = true;
//     }

//     public String generateCatTag() {
//         return "" + this.catId + this.catChar;
//     }

//     public String toString() {
//         String catMoodMessage = PurrfectUtils.determineCatMood(this);
//         return "== About " + this.name + " ==\n" + this.name
//         + " is a cat.\nTheir tag is " + generateCatTag() + ".\n" + catMoodMessage;
//     }

//     public boolean equals(PetCat other) {
//         if (this.toString().equals(other.toString())) {
//             return true;
//         } else {
//             return false;
//         }
//     }







































//}
