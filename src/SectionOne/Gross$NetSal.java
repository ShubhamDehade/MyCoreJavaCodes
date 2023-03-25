package SectionOne;

public class Gross$NetSal {
    public static void main(String[] args) {

        double basicSal=18000;
        double _HRA=9000;
        double _PF=900;
        double incentive=3000;
        double profTax=200;

        //GROSS salary = basic+hra+incentive
        double grossSalary=basicSal+_HRA+_PF;
        //netSal= basic+hra+incentive-pf-profTax
        double netSal=basicSal+_HRA+_PF-incentive-profTax;
        System.out.println("GROSS SALARY :"+grossSalary+"\n"+"NET SAL"+netSal);
    }
}
