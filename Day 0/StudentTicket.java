
//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends StandardTicket {

    private static final double STUDENT_DISCOUNT = 0.50;

    StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        return (double) ((super.getTicketCount() * super.getBasePrice()) * (1 + super.getTax()))
                * (1 - STUDENT_DISCOUNT);
    }

    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

}
