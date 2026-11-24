package OOPS1.Example40;

public class UseEmployee {
    static void main(String[] args) {
        Employee e = new Employee();

        // Private variables cannot be accessed directly
        // e.id = 104;
        // e.name = "Pawan Yadav";

        e.setId(102);
        e.setName("Pawan Yadav");

        System.out.println("Id of Employee " + e.getId());
        System.out.println("Name of Employee " + e.getName());
    }
}
