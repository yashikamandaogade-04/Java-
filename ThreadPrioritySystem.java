class MyThread extends Thread {
    MyThread(String name){super(name);}
    public void run(){System.out.println("Running "+getName());}
}

public class ThreadPrioritySystem {
    public static void main(String[] args) {
        MyThread t1=new MyThread("Low"); t1.setPriority(Thread.MIN_PRIORITY);
        MyThread t2=new MyThread("High"); t2.setPriority(Thread.MAX_PRIORITY);
        t1.start(); t2.start();
    }
}
