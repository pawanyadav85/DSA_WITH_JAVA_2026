package BasicMaths;

import java.util.Scanner;

public class ReverseOfDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;
        int rev = 0 ;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Reverse of Nubmer is : "+ rev);
    }
}
