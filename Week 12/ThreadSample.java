package GUI;

public class ThreadSample extends Thread{
    // counterpart of run() in the ThreadSample class
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        
        Thread t1 = new Thread(new ThreadSample());
        t1.start();
    }
    
    @Override
    public void run(){
        System.out.println("This code is running from the additional thread.");
    }
}
