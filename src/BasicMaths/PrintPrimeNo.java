package BasicMaths;

import java.util.Scanner;

public class PrintPrimeNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 2; j <= n; j++) {
            boolean isPrime = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(j);
            }
        }
    }
}
