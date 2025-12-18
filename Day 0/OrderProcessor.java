public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate, double total,
            String[] expensiveItems, double tax) {
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        // for this for loop i decomposed it by making the whole for loop its own method
        // i called this new method findExpensiveItems()
        findExpensiveItems(items, subtotal, expensiveItemsTemp, premiumCount);

        // Trim premium items to exact size
        // For this I made this its own method called trimPremiumItems()
        trimPremiumItems(premiumCount, expensiveItemsTemp);

        // Calculate tax and total
        // for this calculation i made it its own method called calculateTaxAndTotal()
        calculateTaxAndTotal(subtotal, taxRate);

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static void findExpensiveItems(Item[] items, double subtotal, String[] expensiveItemsTemp,
            int premiumCount) {
        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // Calculate item total
            double itemTotal = price * quantity;
            subtotal += itemTotal;

            // Check if expensive
            if (price > 50.0) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount += 1;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            }
        }
    }

    public static void trimPremiumItems(int premiumCount, String[] expensiveItemsTemp) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
    }

    public static void calculateTaxAndTotal(double subtotal, double taxRate) {
        double tax;
        double total;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            tax = 0;
            total = 0;
        }
        // this line is to fix the litle error so this is random:
        total += total;

    }

}