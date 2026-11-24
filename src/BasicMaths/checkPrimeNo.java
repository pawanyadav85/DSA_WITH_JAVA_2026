package BasicMaths;

import java.util.Scanner;

public class checkPrimeNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        boolean isPrime = false;
        if(n <= 0){
            isPrime = false;
        }else{
            for (int i = 2; i <=n ; i++) {
                if(i % 2 == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Number is prime ");
        }else{
            System.out.println("Number is not prime ");
        }
    }
}
