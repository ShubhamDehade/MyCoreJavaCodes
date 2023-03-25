package Constructor;

public class Registration {
     int id;
    String email;
    String name;
    String college;

    Registration(int id,String name,String college)
    {
        id=id;//0
        name=name;//null
        college=college;//null
    }
    Registration(int id, String name,String college,String email){
        this.id=id; //genuine output
        this.name=name;//genuine output
        this.college=college;//genuine output
        this.email=email;//genuine output
    }

    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(email);
        System.out.println(college);
    }

    public static void main(String[] args) {
        Registration r1= new Registration(1,"shubham","dpcoe");
        r1.display();

        Registration r2=new Registration(2,"shubham","shubhmdehade1982000@gmail.com","dpcoe");
        r2.display();
    }


}
