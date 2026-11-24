package BasicMaths;

import java.util.Scanner;

public class ProductOfDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;
       int prduct = 1;
       while(n != 0){
           int digit = n % 10;
           prduct = prduct *  digit;
           n /= 10;
       }
        System.out.println("Product of digit : "+prduct);
    }
}
