package SectionOne;

public class Bike {
    static double mainReading;
    double tripreading;

    void calculateReading(double reading){
        mainReading+=reading;
        tripreading=reading;
    }

    public static void main(String[] args) {
        Bike b1= new Bike();
        b1.calculateReading(400);
        System.out.println(mainReading+"\t"+ b1.tripreading);
        Bike b2=new Bike();
        b2.calculateReading(120);
        System.out.println(mainReading+"\t"+ b2.tripreading );
    }
}
