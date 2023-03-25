package CallByVR;

public class CallByReference {
    public static void main(String[] args) {
        ScheduleInterview sc1=new ScheduleInterview();
        sc1.interview(new Employee()); //object of employee class as reference i.e, call by reference
    }
}
