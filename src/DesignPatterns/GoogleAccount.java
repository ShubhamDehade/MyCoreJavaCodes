package DesignPatterns;

public class GoogleAccount {
    //int count=1;
 static   GoogleAccount g1=null;
    private GoogleAccount(){

    }
   static GoogleAccount login(){
        if(g1==null){
            g1=new GoogleAccount();
        }
        else {
            System.out.println("ALREADY LOGGED IN");
        }
        return g1;
    }
    void accessGamil(){
        System.out.println("I AM GMAIL");
    }
    void acessDrive(){
        System.out.println("I AM DRIVE");
    }

}
