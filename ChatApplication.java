class Sender extends Thread {
    public void run() {
        System.out.println("Sending message...");
        try { Thread.sleep(1000); } catch(Exception e){}
        System.out.println("Message sent!");
    }
}

class Receiver extends Thread {
    public void run() {
        System.out.println("Receiving message...");
        try { Thread.sleep(1000); } catch(Exception e){}
        System.out.println("Message received!");
    }
}

public class ChatApplication {
    public static void main(String[] args) {
        Sender s = new Sender();
        Receiver r = new Receiver();

        System.out.println("Thread states before start: " + s.getState() + ", " + r.getState());
        s.start();
        r.start();
        System.out.println("Thread states after start: " + s.getState() + ", " + r.getState());
    }
}
