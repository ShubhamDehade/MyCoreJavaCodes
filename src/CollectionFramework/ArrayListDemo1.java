package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        Product p1=new Product(1,"ALCHEMIST",200);
        Product p2=new Product(2,"RICH DAD POOR DAD",200);

        ArrayList<Product> books=new ArrayList<>();
        books.add(p1);
        books.add(p2);
        System.out.println(books);
    }
}
class Product{
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+price;
    }
}
