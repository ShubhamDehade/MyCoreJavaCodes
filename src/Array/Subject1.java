package Array;

public class Subject1 {
    public static void main(String[] args) {
      Subject[] s1=new Subject[3];
      s1[0]=new Subject("1","JAVA");
      s1[1]=new Subject("2","SQL",100,90);
      s1[2]=new Subject("3","WEB TECH",100,95);

        for (Subject sc1:s1) {
            System.out.println(sc1);
        }
    }
}
