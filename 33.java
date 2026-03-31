import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int age = sc.nextInt();
            if(age<=0) throw new ArithmeticException();
            System.out.println("Student age is: "+age);
        } catch(InputMismatchException e) {
            System.out.println("Invalid input: not a number");
        } catch(ArithmeticException e) {
            System.out.println("Invalid input: age must be positive");
        }
    }
}
