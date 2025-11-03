public class PoolUtils {
    
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel >= 0 && cleanlinessLevel <= 10) {
            return cleanlinessLevel;
        } else if (cleanlinessLevel < 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static String generateUsername(String name) {
        String firstName = name.substring(0, (name.indexOf(" ")));
        String lastName = name.substring(((name.indexOf(" "))), name.length());
        int num = (int) (Math.random() * 100 + 1950);
        return "@" + firstName + "_" + lastName + "_" + num;
    }

    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel(pool.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        return name.trim();
    }











}
