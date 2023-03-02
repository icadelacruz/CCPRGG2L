package GUI;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;

public class MultipleThreads extends JFrame implements Runnable {

    Thread t1, t2, t3;
    ArrayList<String> words = new ArrayList<>();
    String[] list = {"Soccer", "Basketball", "Baseball"};
    int wordNum;
    int x = 10, y = 10;
    int x2 = x+80, y2 = 10;
    int x3 = x + 160, y3 = 10;

    public MultipleThreads() {
        t1 = new Thread(this);
        t1.start();
        t2 = new Thread(this);
        t2.start();
        t3 = new Thread(this);
        t3.start();
        words.addAll(Arrays.asList(list));
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        g.drawString(words.get(0), x, y);
        g.drawString(words.get(1), x2, y2);
        g.drawString(words.get(2), x3, y3);
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Thread.currentThread() == t1) {
                    y+=10;
                    Thread.sleep(300);
                }
                if (Thread.currentThread() == t2) {
                    y2+=10;
                    Thread.sleep(500);
                }
                if (Thread.currentThread() == t3) {
                    y3+=10;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
            repaint();
        }
    }
    
    public static void main(String[] args) {
        new MultipleThreads();
    }

}
