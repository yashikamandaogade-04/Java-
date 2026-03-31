import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();
        String masked = pwd.substring(0,pwd.length()-2).replaceAll(".","*")
                        + pwd.substring(pwd.length()-2);
        System.out.println("Masked: " + masked);
    }
}
