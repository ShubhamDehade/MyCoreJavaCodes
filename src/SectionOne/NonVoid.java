package SectionOne;

public class NonVoid {
    static double salary(double basic,double hra){
        double totalSal=basic+hra;
        return totalSal;
    }
     void incrementedSal(){
        double increment=salary(12000,3333)*0.20;
        System.out.println(increment);
    }

    public static void main(String[] args) {
        new NonVoid().incrementedSal();
    }
}
