import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String fullName = fname + " " + lname;
        System.out.println("Full Name: " + fullName);
    }
}
