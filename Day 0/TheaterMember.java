public class TheaterMember {

    private String name;
    private boolean[] loyaltyCredits;

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public String getName() {
        return name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int num = 0;
        for (int m = 0; m < loyaltyCredits.length; m++) {
            if (loyaltyCredits[m]) {
                num += 1;
            }
        }
        return num;
    }

    public String determineMembershipStatus() {
        if (countLoyaltyCredits() >= 6) {
            return "Gold Member";
        } else if (countLoyaltyCredits() <= 5 && countLoyaltyCredits() >= 3) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {

        String arrayHistory = "";
        String sign = "";
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                sign = "X";
            } else {
                sign = "-";
            }
            arrayHistory += ", " + sign;
        }
        if (arrayHistory.length() > 2) {
            arrayHistory = "[" + arrayHistory.substring(2) + "]";
        } else {
            arrayHistory = "[" + arrayHistory + "]";
        }

        return arrayHistory;

    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), Loyalty History: "
                + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }

}
