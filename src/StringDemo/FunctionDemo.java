package StringDemo;

public class FunctionDemo {
    public static void main(String[] args) {
        String s1="CORE JAVA";
        System.out.println(s1.charAt(1));
        System.out.println(s1.replaceFirst("A","I"));
        System.out.println(s1.replace('J','K'));
        System.out.println(s1.replace("CO","MO"));
        System.out.println(s1.length());
        System.out.println(s1.indexOf('A'));
        System.out.println(s1.lastIndexOf('A'));
        System.out.println(s1.contains("JA"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));//RE i.e,2 to 4
        System.out.println(s1.startsWith("C"));
        System.out.println(s1.endsWith("VA"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        char[] arr=s1.toCharArray();
        for(char a:arr){
            System.out.println(a);
        }
        String[] data=s1.split(" ");
        for (String a:data) {
            System.out.println(a);
        }
        String s2="   SHUBHAM   ";
        System.out.println(s2.trim());
        System.out.println(s2.isEmpty());
    }
}
