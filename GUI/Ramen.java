
package GUI;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ramen {
    JFrame frame = new JFrame();
    ImageIcon bg = new ImageIcon("ramen.png");
    JButton btn = new JButton("Login");
    
    public Ramen(){
        Image img = bg.getImage();
        bg = new ImageIcon(img.getScaledInstance(500, 500, Image.SCALE_SMOOTH));
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        JLabel lblBack = new JLabel(bg);
        lblBack.setLayout(new FlowLayout());
        lblBack.setBounds(0, 0, 500, 500);
        
        btn.setBounds(100, 100, 100, 100);
        lblBack.add(btn);
        
        frame.add(lblBack);
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Ramen GUI = new Ramen();
    }
}
