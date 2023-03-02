
package GUI;

public class MultiDemo implements Runnable{
    static Thread t1,t2,t3;
    
    public static void main(String[] args) {
        t1 = new Thread(new MultiDemo());
        t2 = new Thread(new MultiDemo());
        t3 = new Thread(new MultiDemo());
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        if(Thread.currentThread() == t1){
            for (int i = 1; i <= 10; i++) {
                System.out.println("Running from "+Thread.currentThread().getName()+" ");
                System.out.println(i);
            }
        }
        if(Thread.currentThread() == t2){
            for (int i = 0; i < 10; i++) {
                System.out.println("Running from "+Thread.currentThread().getName()+" ");
                int random = (int) (97 + Math.random() * 127);
                char ch = (char) random;
                System.out.println(ch);
            }
        }
        if(Thread.currentThread() == t3){
            for (int i = 0; i < 10; i++) {
                System.out.println("Running from "+Thread.currentThread().getName()+" ");
            }
        }
    }
}
