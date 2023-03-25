package SectionOne;

public class BookTickets {
    static int ticketCount=50;
    int restrictedCount=ticketCount;
    static double ticketPrice=150;
    int count=0;
    void bookTicket(int tickets){

        if(tickets<=50 && tickets>0  ) {
            ticketCount = ticketCount - tickets;
            double totalPrice=tickets*ticketPrice;
            System.out.println("TICKETS BOOKED SUCCESSFULLY");
            System.out.println("total bill "+totalPrice);
            count++;

        }
        else if(count>0){
            ticketCount = ticketCount + tickets;
            double totalPrice=tickets*ticketPrice;
            System.out.println("TICKETS BOOKED SUCCESSFULLY");
            System.out.println("total bill "+totalPrice);
            count++;
        }
        else {
            System.out.println("INVALID INPUT");
        }
    }
    void cancelTickets(int ticket){
        if(count>0 && ticket<restrictedCount && ticket>0){
            int temp=ticketCount+ticket;
            if(temp<restrictedCount) {
                ticketCount = ticketCount + ticket;
                System.out.println("TICKETS CANCELLED SUCCESSFULLY");
                double refund = ticket * ticketPrice;
                System.out.println("refundable amount " + refund);
            }
            else {
                System.out.println("enter proper count");
            }
        }
        else
            System.out.println("something problem is happened \"have you booked tickets before? ");
    }


}
