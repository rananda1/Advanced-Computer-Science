public class NameOps {
    
    // public static String printMethodCall(String method, String name) {
    //     return method(name):  
    // }

    public static String whoIsAwesome(String name) {
        return "" + name + " is awesome!" + name.charAt(0);
    }

    public static int indexOfFirstSpace(String name) {
        int index = name.indexOf(" ");
        return index;
    }



    //     for (int i = 0; i < name.length(); i++) {
    //         int index = i;
    //         String ifSpace = "" + name.charAt(index);
    //         if (ifSpace == " ") {
    //             return name.charAt(i);
    //         } else {
    //             return -1;
    //         }
            
    //     }
    // }

    public static int indexOfSecondSpace(String name) {
        //int index2 = name.substring(name.indexOf(" "), name.length()).indexOf(" ");
        String substringSection = name.substring((name.indexOf(" ") + 1), name.length());
        int index2 = substringSection.indexOf(" ") + name.indexOf(" ") + 1;
        //index2 = name.indexOf(" ", name.indexOf(" "), name.length());
        if (index2 > name.indexOf(" ")) {
            return index2;
        } else {
            return -1;
        }
        //return index2 + name.indexOf(" ") + 1;
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) = -1) {
            return name;
        } else {

        }
    }

    //public static findSecondName(String name) {

    //}
























}
