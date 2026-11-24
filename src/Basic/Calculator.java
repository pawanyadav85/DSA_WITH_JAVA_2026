package Basic;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Operator(+ , - , * , % ,) : ");
        char s = sc.next().charAt(0);
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        switch (s){
            case '+'->{
                System.out.println("Sum of Number is : " + (a + b));
            }case '-'->{
                System.out.println("Substarct of Nubmer is : " +( a - b));
            }
            case '*'->{
                System.out.println("Multiply of Number is : " + a * b);
            }
            case '%'->{
                System.out.println("Modulo of Number is : " + a % b);
            }
            case '/'->{
                System.out.println("divide of Number is : " + a / b);
            }default -> {
                System.out.println("Invalid Opearater !");
            }
        }
        System.out.println("Thank you for using calculator ");
    }
}
