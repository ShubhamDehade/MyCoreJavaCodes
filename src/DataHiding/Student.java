package DataHiding;

public class Student {
    private String name="shubham";
    private double marks=77.77;

    public double getMarks() {
        System.out.println(marks);
        return marks;
    }
    public void getName(){
        System.out.println(name);

    }

    public void setMarks(double marks) {
        this.marks = marks;
        System.out.println(marks);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
}
