package Revision.BasicPractice;

import java.util.Scanner;

public class MakingCalculator {
    //    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first Number");
//        int a = sc.nextInt();
//        System.out.println("Perform Operation");
//        int b = sc.next().charAt()
//    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int n = sc.nextInt();
        switch (n){
            case 1 ->{
                System.out.println("Coffee");
            }
            case 2 ->{
                System.out.println("Milk");
            }
            case 3 ->{
                System.out.println("cold drink");
            }default -> {
                System.out.println("Not valid item");
            }
        }
    }
}
