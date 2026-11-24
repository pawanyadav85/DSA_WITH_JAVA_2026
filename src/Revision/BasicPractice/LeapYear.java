package Revision.BasicPractice;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 400 == 0 ){
            System.out.println("Leap year");
        }else if(year % 100 == 0){
            System.out.println("Not leap year");
        }else{
            System.out.println("Not leap Year");
        }
    }
}
