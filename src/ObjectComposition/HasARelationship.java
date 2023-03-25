package ObjectComposition;

public class HasARelationship {
    public static void main(String[] args) {
        Laptop l1= new Laptop();
        l1.display();
        Laptop.h1.display();//className as reference
        l1.s1.getDetails();//reference variable as reference because nonstatic object creation
    }
}
