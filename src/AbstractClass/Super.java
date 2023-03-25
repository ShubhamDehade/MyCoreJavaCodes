package AbstractClass;

public abstract class Super {
    Super(){
        System.out.println("I AM CONSTRUCTOR OF SUPER CLASS");
    }
    void demo(){
        System.out.println("I AM CONCRETE METHOD OF ABSTRACT CLASS");
    }
    abstract void future();
}
