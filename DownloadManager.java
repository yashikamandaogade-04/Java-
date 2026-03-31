class DownloadTask implements Runnable {
    String file;
    DownloadTask(String f){file=f;}
    public void run(){
        System.out.println("Downloading "+file+"...");
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadTask("File1"));
        Thread t2 = new Thread(new DownloadTask("File2"));
        t1.start(); t2.start();
    }
}
