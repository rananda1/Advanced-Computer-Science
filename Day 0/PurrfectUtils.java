public class PurrfectUtils {
    
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7) {
            return "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\nPetting is acceptable.";
        } else if (cat.getMoodLevel() <= 3) {
            return "Currently, " + cat.getName() + " is plotting revenge.\nPetting is extremely risky.";
        } else {
            return "";
        }
    }

    public static char generateCatChar(String catId) {
        //int catIdInt = Integer.parseInt(catId);
        //int numOfNums = catId.indexOf(catId.length());
        int sumToBeDivided = 0;
        for (int i = 0; i < catId.length(); i++) {
            sumToBeDivided = sumToBeDivided + Integer.parseInt("" + catId.charAt(i));
        }
        return (char) ('A' + ((sumToBeDivided % 26)));
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            low = high;
            high = low;
        }
        return (int) (Math.random() * (high - low) + low);
    }

    public static String validateCatId(String catId) {
        int catIdInt = Integer.parseInt(catId);
        if (catIdInt >= 1000 && catIdInt <= 9999) {
            return catId;
        } else {
            return "" + (int) (Math.random() * 8999 + 1000);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } else if (cat.getMoodLevel() < 2 && cat.isHungry() == false) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int moodDecrease = (int) (Math.random() * 2 + 1);
        if (moodDecrease == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...\nDone!\n" + cat.getName() + " appreciated that!");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + "'s bowl...\nDone!\n" + cat.getName() + " is eating...\n" + cat.getName() + " is full!");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
    }






























}
