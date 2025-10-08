public class PawesomeUtils {
  
    public static char generateDogChar(int dogId) {
        int num3 = dogId % 10;
        int num2 = (num3 / 10) % 10;
        int num1 = (num2 / 10) % 10;
        return (char) ('F' + (num1 + num2 + num3) % 10);
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return new String("" + dogId + dogChar + "");
    }
    

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.stillInFacility = false;
            return "" + dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return "You are not able to pick up this dog because you are not their owner.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.getStillInFacility() = true;
        dog.name = personName;
    }

    public static int validateId(int )






}
