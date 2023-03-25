package SectionOne;

import java.util.Scanner;

public class BookTicketsMainApp {
    public static void main(String[] args) {
        BookTickets b1= new BookTickets();
        Scanner sc1= new Scanner(System.in);

        boolean status =true;
        while (status){
            System.out.println("AVAILABLE TICKETS "+b1.ticketCount);
            System.out.println("1.BOOK TICKETS\n2.CANCEL TICKETS\n3.ENTER ANY KEY TO EXIT\nSELECT OPTION");
            int option= sc1.nextInt();
            if (option==1){
                System.out.println("ENTER TICKETS TO BE BOOKED");
                int book= sc1.nextInt();
                b1.bookTicket(book);
                System.out.println("AVAILABLE TICKETS ARE "+b1.ticketCount);
            } else if (option==2) {
                System.out.println("ENTER TICKETS TO BE CANCELLED");
                int cancel=sc1.nextInt();
                b1.cancelTickets(cancel);
                System.out.println("AVAILABLE TICKETS ARE "+b1.ticketCount);
            }
            else
                status=false;


        }

    }
}
