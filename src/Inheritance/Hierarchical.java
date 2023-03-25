package Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        PermanentEmp p1=new PermanentEmp();
        p1.getDesignation("DEVELOPER");
        p1.getInfo(101,30000);
        p1.rule();
        System.out.println("===========================================");
        ContractEmp c1=new ContractEmp();
        c1.getContractDetail(12);
        c1.getInfo(201,34000);

    }
}
