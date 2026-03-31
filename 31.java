import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double withdraw = sc.nextDouble();
        if(withdraw > balance)
            throw new RuntimeException("Insufficient Balance");
        else {
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: "+balance);
        }
    }
}
