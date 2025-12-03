public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        String clock = "";
        if (vacation && (day == 0 || day == 6)) {
            clock = "off";
        } else if (vacation && (day != 0 && day != 6)) {
            clock = "10:00";
        } else if (day == 0 || day == 6) {
            clock = "10:00";
        } else {
            clock = "7:00";
        }
        return clock;
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        if (a == 6 || b == 6 || a - b == 6 || b - a == 6) {
            return true;
        } else if ((a + b) == 6) {
            return true;
        } else {
            return false;
        }
        //return false;
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
        //return 0;
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.length() > 0) {
        
            if (str.length() > 0 && str.charAt(0) == 'f' && str.charAt((str.length() - 1)) == 'b') {
                return "FizzBuzz";
            } else if (str.charAt(0) == 'f') {
                return "Fizz";
            } else if (str.length() > 0 && str.charAt((str.length() - 1)) == 'b') {
                return "Buzz";
            } else {
                return str;
            }
            //return "";


        } else {
            return str;
        }

    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            finalString += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
        }
        return finalString;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        int num = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi") && i < str.length() - 1) {
                num += 1;
            }
        }
        return num;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        int catNum = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat") && i < str.length() - 2) {
                catNum += 1;
            }
        }
        int dogNum = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog") && i < str.length() - 2) {
                dogNum += 1;
            }
        }
        if (dogNum == catNum) {
            return true;
        } else {
            return false;
        }
        //return false;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        String letter = "";
        String letterNot = "";
        if (a.length() < b.length()) {
            letter = a;
            letterNot = b;
        } else {
            letter = b;
            letterNot = a;
        }
        String finalString = "";
        for (int j = 0; j < letter.length(); j++) {
            finalString += String.valueOf(a.charAt(j)) + String.valueOf(b.charAt(j));
        }
        if (a.length() != b.length()) {
            finalString += letterNot.substring(letter.length(), letterNot.length());
        }
        return finalString;

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        String endLetters = str.substring(str.length() - n, str.length());
        String finalString = "";
        for (int o = 0; o < n; o++) {
            finalString += endLetters;
        }
        return finalString;
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (b.length() >= a.length() && b.substring((b.length() - a.length()), 
            b.length()).equals(a)) {
            return true;
        } else if (a.length() > b.length() && a.substring((a.length() - b.length()), 
            a.length()).equals(b)) {
            return true;
        } else {
            return false;
        }
        //return false;
    }

    public static int countCode(String str) {
        // to-do: implement this method
        int codeCount = 0;
        for (int j = 0; j < str.length() - 3; j++) {
            if (str.charAt(j) == 'c' && str.charAt(j + 1) == 'o' && str.charAt(j + 3) == 'e' 
                && j < str.length() - 3) {
                codeCount = codeCount + 1;
            }
        }
        return codeCount;
    
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        int num = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 0) {
                num += 1;
            }
        }
        return num;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        int big = 0; //Math.max(nums[0], nums[nums.length]);
        int small = nums[0]; //Math.min(nums[0], nums[nums.length]);
        for (int m = 0; m < nums.length; m++) {
            if (nums[m] > big) {
                big = nums[m];
            }
            if (nums[m] < small) {
                small = nums[m];
            }
            
            //big = Math.max(nums[m], nums[m + 1]);
            //small = Math.min(nums[m], nums[m + 1]);
        }
        return (int) (big - small);
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        int sum = 0;
        for (int l = 0; l < nums.length; l++) {
            // if (nums[l] != 13 && (l > 0 && nums[l - 1] != 13)) {
            //     sum += nums[l];
            // }

            // if (nums[l] != 13) {
            //     if (l > 0 && nums[l - 1] != 13) {
            //         sum += nums[l];
            //     }
            //     sum += nums[l];
            // }

            if (nums[l] != 13) {
                if (l == 0 || l > 0 && nums[l - 1] != 13) {
                    sum += nums[l];
                }
                //sum += nums[l];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        int[] array = new int[n];
        for (int g = 0; g < n; g++) {
            array[g] = g;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int num = 0;
        for (int f = 0; f < nums.length; f++) {
            if (f == 0 && nums[f] == 3 && nums[f + 1] != 3) {
                num += 1;
            } else if (f == (nums.length - 1) && nums[f] == 3 
                && (f > 0 && nums[f - 1] != 3)) {
                num += 1;
            } else if (nums[f] == 3 && (f > 0 && nums[f - 1] != 3)    
                && (f < nums.length - 1 && nums[f + 1] != 3)) {
                num += 1;
            }
        }
        if (num == 3) {
            return true;
        } else {
            return false;
        }
        //return false;

    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        String[] array = new String[n];
        for (int g = 0; g < n; g++) {
            array[g] = String.valueOf(g);
        }
        return array;
        //return new String[0];
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method

        //int[] nums2 = nums;
        //int num0 = -1;
        //int shift = 0;

        for (int a = nums.length - 1; a >= 0; a--) {
            if (a != 0 && nums[a] == 0) {
                nums[a] = nums[a - 1];
                nums[a - 1] = 0; // nums[a];
            }
        }
        for (int a = nums.length - 1; a >= 0; a--) {
            if (a != 0 && nums[a] == 0) {
                nums[a] = nums[a - 1];
                nums[a - 1] = 0; // nums[a];
            }
        }
        //return nums; this is totally fine i just need to 
        // put it later because of the weird print thing




        // for (int a = 0; a < nums.length; a++) {
        //     if (nums[a] == 0) {
        //         num0 += 1;
        //         shift += 1;
        //         nums2[num0] = 0; // nums[a];

        //     }
        // }




        // //int[] array = nums; // new int[nums.length];
        // int[] array = new int[nums.length]; 
        // for (int i = 0; i < nums.length; i++) {
        //     array[i] = nums[i]; 
        // }


        // int num = -1;
        // for (int e = 0; e < nums.length; e++) {
        //     if (array[e] == 0) {
        //         num += 1;

        //         // array[e] = nums[num];
        //         // array[num] = 0;
        //         int num2 = array[num];   
        //         array[num] = array[e];    
        //         array[e] = num2;
        //     }
        // }
        // return array;
        // //return new int[0];


        String arrayNums = "";
        for (int i = 0; i < nums.length; i++) {
            arrayNums += ", " + String.valueOf(nums[i]);
        }
        if (arrayNums.length() > 2) {
            arrayNums = "[" + arrayNums.substring(2) + "]";
        } else {
            arrayNums = "[" + arrayNums + "]";
        }
        //arrayString = "[" + arrayString.substring(2) + "]";
        
        
        System.out.println(arrayNums);

        return nums;
    
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        int num = words.length;
        int num2 = -1;
        for (int u = 0; u < words.length; u++) {
            if (words[u] == target) {
                num -= 1;
            }
        }
        String[] array = new String[num];
        // for (int c = 0; c < words.length; c++) {
        //     for (int m = 0; m < array.length; m++) {
        //         if (words[c] == target)
        //     }
        // }
        for (int z = 0; z < words.length; z++) {
            if (words[z] != target) {
                num2 += 1;
                array[num2] = words[z];
            }
        }
        return array;
        // return new String[0];
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        int num = 0;
        for (int m = start; m <= end; m++) {
            sum += scores[m];
            num += 1;
        }
        return (int) (sum / num);
    }
    
    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int firstHalf = average(scores, 0, (scores.length / 2) - 1);
        int secondHalf = average(scores, (scores.length / 2), scores.length - 1);
        if (firstHalf > secondHalf) {
            return firstHalf;
        } else {
            return secondHalf;
        }
        //return 0;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        int num = 0;
        for (int w = 1; w < scores.length; w++) {
            if (scores[w] >= scores[w - 1]) {
                num += 1;
            }
        }
        if (num == scores.length - 1) {
            return true;
        } else {
            return false;
        }
        // return false;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        int num1 = 0;
        for (int y = 0; y < a.length; y++) {
            if ((a[y] % 10) == 0 && a[y] > num1) {
                num1 = a[y];
            }
        }
        int num2 = 0;
        for (int x = 0; x < b.length; x++) {
            if ((b[x] % 10) == 0 && b[x] > num2) {
                num2 = b[x];
            }
        }
        return (num1 + num2);
        // return 0;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        if (str.length() == 1) {
            return str + "*";
        } else if (str.length() < 1) {
            return "**";
        } else {
            return str.substring(0, 2);
        }
        //return "";
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        if (a == 0 || b == 0) {
            return 0.0;
        } else {
            if (a > b) {
                return (double) a / b;
            } else {
                return (double) b / a;
            }
        }
        // return 0.0;
    }


















}
