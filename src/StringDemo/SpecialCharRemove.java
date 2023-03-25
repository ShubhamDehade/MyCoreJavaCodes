package StringDemo;

public class SpecialCharRemove {
    public static void main(String[] args) {
        String s1="fhfiSDHFSK@!#$%^^&7734598";
        String s2=s1.replaceAll("[^a-zA-Z1-9]","");
        System.out.println(s2);
    }
}
