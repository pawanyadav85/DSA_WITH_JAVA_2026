package OOPS;

public class Constructor {
    static void main(String[] args) {
        Car c1 = new Car(1, "Pawan", 3.99);
        System.out.println(c1.name);
    }

    public static class Car {

        int seats;
        String name;
        double length;

        //        Car(){    //default constructor
//        }
        Car(int x, String s, double d) {
            seats = x;
            name = s;
            length = d;
        }
    }
}
