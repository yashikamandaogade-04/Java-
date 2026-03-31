class PaymentThread extends Thread {
    public void run(){System.out.println("Processing payment...");}
}
class OrderThread extends Thread {
    public void run(){System.out.println("Order confirmed...");}
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        new PaymentThread().start();
        new OrderThread().start();
    }
}
