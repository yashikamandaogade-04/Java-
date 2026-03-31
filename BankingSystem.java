class Account {
    private int balance = 5000;

    void withdraw(String name, int amount) {
        synchronized(this) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println(name + " withdrew " + amount + 
                                   ". Remaining balance: " + balance);
            } else {
                System.out.println(name + " tried to withdraw " + amount + 
                                   " but insufficient balance.");
            }
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account acc = new Account();

        Thread t1 = new Thread(() -> acc.withdraw("Ravi", 3000));
        Thread t2 = new Thread(() -> acc.withdraw("Yashika", 2500));

        t1.start();
        t2.start();
    }
}