package if_else;

import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " * " + i +" = " + table);
        }
    }
}
