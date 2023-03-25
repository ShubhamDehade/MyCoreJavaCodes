package Inheritance;

public class ContractEmp extends Employee {
    void getContractDetail(int months){
        rule();
        System.out.println("contract period "+months);
        bonus=300;
    }
}
