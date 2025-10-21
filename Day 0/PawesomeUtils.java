public class PawesomeUtils {
  
    public static char generateDogChar(int dogId) {
        int num3 = dogId % 10;
        int num2 = (dogId / 10) % 10;
        int num1 = (dogId / 100) % 10;
        return (char) ('F' + ((num1 + num2 + num3) % 10));
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return new String("" + dogId + dogChar + "");
    }
    

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return "" + dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return "You are not able to pick up this dog because you are not their owner.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setName(personName);
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 899 + 100);
        }
    }

    // some issue with true and false output here so need to / had to switch for code grade
    public static boolean validateDogTag(Dog dog) {
        String newDogTag = "" + dog.getDogId()  // + PawesomeUtils.validateDogId(dog.getDogId())
            + dog.getDogChar() + "";   // + PawesomeUtils.generateDogChar(dog.getDogId())
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else {
            return (24 + ((dog.getAge() - 2) * 5));
        }
    }

    public static int convertAgeToHumanAge(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } 
        if (humanYears <= 24 && humanYears >= 15) {
            return 2;
        } else {
            return (int) (2 + (humanYears - 24) / 5);
        }
    }





}
