package if_else;

import java.util.Scanner;

public class TrafficLight {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the colour : ");
        char n = sc.next().charAt(0);
        switch (n){
            case 'R'->{
                System.out.println("Stop the car");
            }case 'Y'->{
                System.out.println("Ready the car");
            }
            case 'V'->{
                System.out.println("Go the car");
            }default -> {
                System.out.println("Invalid colour !");
            }
        }
    }
}
