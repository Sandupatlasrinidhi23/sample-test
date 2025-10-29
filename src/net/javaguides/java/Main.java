package net.javaguides.java;

public class Main {
    public static void main(String[] args) {

        Home homepage = new Home();
        String name = "Srinidhi";
        int age = 25; // declartion + initialization
        int year = 2025;
        float salry;// Declartion
        salry = 2500.50f; // initialization
        boolean isMarried = false;
        double amount = 3000.00;
        char grade = 'A';

        homepage.showHomeMessage();

        homepage.displayMyInfo("Srinidhi", 18);
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("salry:" + salry);
        System.out.println("amount:" + amount);
        System.out.println("isMarried:" + isMarried);
        System.out.println("grade:" + grade);

        System.out.println("add:" + (age+ year));
         System.out.println("sub:" + (age - year));
         System.out.println("mul:" + (age * year));
         System.out.println("div:" + (age / year));
         
    }

}
