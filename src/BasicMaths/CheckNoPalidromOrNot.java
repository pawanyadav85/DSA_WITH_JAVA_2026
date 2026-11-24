package BasicMaths;

import java.util.Scanner;

public class CheckNoPalidromOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 121;
        int orginal = n;
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println(rev == orginal);
    }
}
