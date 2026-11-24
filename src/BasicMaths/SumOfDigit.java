package BasicMaths;

import java.util.Scanner;

public class SumOfDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }
        System.out.println("sum is = " + sum);
    }
}
