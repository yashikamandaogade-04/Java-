abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount){System.out.println("Paid "+amount+" via Credit Card");}
}
class UPIPayment extends Payment {
    void pay(double amount){System.out.println("Paid "+amount+" via UPI");}
}
class NetBankingPayment extends Payment {
    void pay(double amount){System.out.println("Paid "+amount+" via NetBanking");}
}

public class TestPayment {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.pay(500);
        p = new UPIPayment();
        p.pay(300);
        p = new NetBankingPayment();
        p.pay(1000);
    }
}
