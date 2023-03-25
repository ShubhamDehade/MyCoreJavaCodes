package CallByVR;

import java.util.Scanner;

public class ScheduleInterview {
    void interview(Employee e){
        Scanner sc1=new Scanner(System.in);
        int s1= sc1.nextInt();
        if(s1 == e.empId){
            System.out.println("INTERVIEW SCHEDULED");
        }
        else {
            System.out.println("INTERVIEW NOT SCHEDULED");
        }
    }
}
