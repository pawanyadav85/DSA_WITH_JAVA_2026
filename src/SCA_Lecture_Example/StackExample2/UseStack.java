package SCA_Lecture_Example.StackExample2;




public class UseStack {
    static void main(String[] args) {
        Stack stack = new Stack(5);
        int x = 10;
        try {
            for (int i = 1; i <= 6; i++) {
                stack.push(x);
                System.out.println("Pushed : " + x);
                x += 10;
            }
        } catch (StackException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Top ele: " + stack.peek());
        try{
        for (int i = 1; i <= 6; i++) {
            x = stack.pop();
            System.out.println("Pop ele : " + x);
        }
        }catch (StackException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
