package Inheritance;

public class PermanentEmp extends Employee {
    void getDesignation(String designation){
        Employee.rule();
        rule();
        System.out.println("DESIGNATION "+designation);
        bonus=300;
    }
    //@Override=> static methods cannot be overridden
    /*The only difference with inherited static (class) methods and inherited non-static (instance) methods is that
     when you write a new static method with the same signature, the old static method is just hidden, not overridden.
     */
    static void rule(){
        System.out.println("ACCESSING STATIC METHOD IN SUBCLASS");
    }

}
