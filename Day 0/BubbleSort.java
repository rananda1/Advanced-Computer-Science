public class BubbleSort {
    private int[] nums;
    private boolean sorted;

    public BubbleSort() {
        this.nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        this.sorted = false;
    }

    public void checkSorted() {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                return;
            }
        }
        sorted = true;
    }

    public void sort() {
        while (!sorted) {
            for (int i = 0; i < nums.length - 1; i++) {
                swap(i);
            }
            checkSorted();
        }
        sorted = true;
    }

    public void swap(int index) {
        if (nums[index] > nums[index + 1]) {
            int num = nums[index + 1];
            nums[index + 1] = nums[index];
            nums[index] = num;
        }
    }

    public void print() {
        String arrayNums = "";
        for (int i = 0; i < nums.length; i++) {
            arrayNums += ", " + nums[i];
        }
        if (arrayNums.length() > 2) {
            arrayNums = "[" + arrayNums.substring(2) + "]";
        } else {
            arrayNums = "[" + arrayNums + "]";
        }

        System.out.println(arrayNums);
        // sort();
        // System.out.println(arrayNums);
    }

}
