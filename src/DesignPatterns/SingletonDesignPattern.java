package DesignPatterns;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        GoogleAccount mobile=GoogleAccount.login();
        mobile.accessGamil();
        mobile.acessDrive();

        GoogleAccount laptop = GoogleAccount.login();
        laptop.acessDrive();
        laptop.accessGamil();

    }
}
