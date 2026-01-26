public class SkyViewTester {

    public static void main(String[] args) {

        double[] scanned = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1 };

        SkyView view1 = new SkyView(3, 2, scanned);

        System.out.println(view1.toString());

        System.out.println(view1.getAverage(1, 2, 0, 1));

    }

}
