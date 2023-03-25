package Interface;

public class Customer implements Member{
    String name;
     Customer(String s){
        name=s;
    }
    @Override
    public void callBack() {
        System.out.println("OK, I WILL COME "+name);
    }
}
