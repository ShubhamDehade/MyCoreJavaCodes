package StringDemo;

public class StringBufferBuilder {
    public static void main(String[] args) {
        String s1=new String("HELLO");//immutable
        StringBuffer s2=new StringBuffer("HELLO");//mutable and thread safe i.e, synchronized
        StringBuilder s3=new StringBuilder("HELLO");//mutable and thread unsafe

        System.out.println( s1.concat("WORLD"));//HELLOWORLD
        System.out.println(s1);//hello
        s2.append("world");
        System.out.println(s2);//HELLOworld
        s3.append("world");
        System.out.println(s3);//HELLOworld
    }
}
