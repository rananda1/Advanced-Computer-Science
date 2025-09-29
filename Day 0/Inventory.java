public class Inventory {
    
    private String itemName;
    private int quantity;
    private int price;

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = (int) price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = (int) price;
    }

    public String toString() {
        return "Item: " + itemName + ", Quantity: " 
            + quantity + ", Price: $" + this.price;
    }

    public boolean equals(Inventory other) {
        if (
            this.itemName.equals(other.itemName)
                &&
                this.quantity == other.quantity
                &&
                this.price == other.price
        ) {
            return true;
        } else {
            return false;
        }
    }

    public void raisePrice(double raiseBy) {
        this.price = (int) (this.price + (this.price * (raiseBy / 100)));
    }













}
