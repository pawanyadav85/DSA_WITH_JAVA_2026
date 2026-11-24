package Revision.BasicPractice;

import java.util.Scanner;

public class Swap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int n = sc.nextInt();
        if(n < 0 || n > 100){
            System.out.println("Ivalid number");
        }else if(n >= 90){
            System.out.println("A++");
        }else if(n >= 75){
            System.out.println("B+");
        }else if(n >= 60){
            System.out.println("C");
        }else if(n >= 33){
            System.out.println("D");
        }else{
            System.out.println("fail");
        }
    }
}
