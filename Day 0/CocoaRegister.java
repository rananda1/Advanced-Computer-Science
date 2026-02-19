import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        // TODO:
        // - if item is null OR quantity <= 0, do nothing
        if (item != null && quantity > 0) {
            items.add(item);
            quantities.add(quantity);
        }
        // - otherwise, add item and quantity to the parallel ArrayLists
    }

    public double getSubtotal() {
        // TODO:
        // sum item.getBasePrice() * quantity for all line items
        // return rounded to 2 decimals using ChocolateBar.round2(...)
        double num = 0;
        for (int index = 0; index < items.size(); index++) {
            num += items.get(index).getBasePrice() * quantities.get(index);
        }
        return ChocolateBar.round2(num);
    }

    public double getTax() {
        // TODO:
        // tax = subtotal * TAX_RATE, rounded to 2 decimals
        return ChocolateBar.round2(getSubtotal() * TAX_RATE);
    }

    public double getTotal() {
        // TODO:
        // total = subtotal + tax, rounded to 2 decimals
        return ChocolateBar.round2((getSubtotal() + getTax()));
    }

    public void printReceipt() {
        // TODO: Print EXACTLY the required receipt format.
        //
        String format = "== COCOA CORNER ==";
        // Hints:
        // - Header line: "== COCOA CORNER =="
        // - For each line item i:
        // (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
        for (int index = 0; index < items.size(); index++) {
            format += "\n" + (index + 1) + ". " + items.get(index).getName() + " x" + quantities.get(index)
                    + " @ $" + ChocolateBar.money(items.get(index).getBasePrice()) + " = $"
                    + ChocolateBar.money(quantities.get(index) * ((items.get(index).getBasePrice())));
        }
        format += "\nSubtotal: $" + getSubtotal() + "\nTax: $" + getTax() + "\nTotal: $"
                + ChocolateBar.money(getTotal());
        System.out.println(format);
    }

}
