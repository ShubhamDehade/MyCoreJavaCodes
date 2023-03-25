package SectionOne;

import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER DAY ");
        int day=sc1.nextInt();
        switch(day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case  7:
                System.out.println("SUNDAY");
                break;
            default :
                System.out.println("INVALID DAY");

        }
        System.out.println("ENTER  MONTH NUMBER");
        int month=sc1.nextInt();
        switch (month){
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("INVALID CHOICE");
        }

        System.out.println("ENTER ANY WEBSITE AND KNOW ITS TYPE");
        String domain=sc1.next();
        domain=domain.substring(domain.lastIndexOf("."+1));
        switch (domain){
            case "com" :
                System.out.println("COMMERCIAL");
                break;
            case "gov":
                System.out.println("GOVERNMENT");
                break;
            case "edu" :
                System.out.println("EDUCATIONAL");
                break;
            case "net" :
                System.out.println("NETWORKING");
                break;

        }
    }
}
