package StringDemo;

public class MultipleSpacesRemove {
    public static void main(String[] args) {
        //remove extra spaces
        String s1="   shubham   anil  dehade    ";
        s1=s1.replaceAll("\\s+"," ").trim();
        System.out.println(s1);
       // System.out.println(s1.replaceFirst("a","u"));=>shubhum anil dehade
        //numbers of words
        String[] words=s1.split("\\s");
        System.out.println(words.length);

    }
}
