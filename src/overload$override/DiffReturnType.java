package overload$override;


public class DiffReturnType {
    //METHOD OVERLOADING IS METHOD HAVING SAME NAME BUT DIFFERENT PARAMETERS BY LENGTH OR DATA TYPE
    void display(){
        System.out.println("FIRST DISPLAY");
    }
    int display(int a){
        return 123;
    }
    double display(String a){
        return 123.34;
    }
}
