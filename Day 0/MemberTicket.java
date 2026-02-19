import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class MemberTicket extends Ticket {

    private static final double MEMBER_DISCOUNT = 0.25;
    private double totalPrice;

    public MemberTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
        getTotalPrice();
    }

    public double getTotalPrice() {
        totalPrice = (double) ((super.getTicketCount() * super.getBasePrice()) * (1 + super.getTax()))
                * (1 - MEMBER_DISCOUNT);
        return totalPrice;
    }

    public void printMemberBenefits() {
        System.out.println("Includes access to special discounts and complimentary refreshments.");
    }

    public void printTicketType() {
        System.out.println("Ticket Type: Member");
    }

    public void printPrice() {
        BigDecimal decimalFormatter = new BigDecimal(getTotalPrice()).setScale(2, RoundingMode.HALF_UP); // rounds
                                                                                                         // totalPrice
                                                                                                         // to 2 decimal
                                                                                                         // places, will
                                                                                                         // be 1 decimal
                                                                                                         // place if
                                                                                                         // last digit
                                                                                                         // is 0 (i.e.
                                                                                                         // 7.50 -> 7.5)

        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue()); // prints the price
    }

    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.println(
                "Can be canceled within 24 hours before the event. No cancellation fee applies.");
    }

    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printMemberBenefits();
        printCancellationPolicy();
    }
}
