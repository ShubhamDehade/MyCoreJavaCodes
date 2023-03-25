package Interface;

public class Main {
    public static void main(String[] args) {
        Store s1=new Store();
        Customer c1=new Customer("SHUBHAM");
        Customer c2=new Customer("DEHADE");

            s1.register(c1);
            s1.register(c2);

            s1.inviteSale();
    }
}
