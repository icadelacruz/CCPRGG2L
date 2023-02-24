
package GUI;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Panda extends JFrame implements KeyListener, MouseListener{
    ImageIcon img = new ImageIcon("bubu.gif");
    JTextField tfAction = new JTextField(30);
    JLabel object = new JLabel(img);
    
    public Panda(){
        setSize(900,900);
        setLayout(new FlowLayout());
        setTitle("Panda in a motorcycle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tfAction.setFocusable(false);
        addKeyListener(this);
        addMouseListener(this);
        
        add(tfAction);
        add(object);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Panda();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            tfAction.setText("Pressed arrow key UP");
            object.setLocation(object.getX(), object.getY()-5);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            tfAction.setText("Pressed arrow key DOWN");
            object.setLocation(object.getX(), object.getY()+5);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            tfAction.setText("Pressed arrow key LEFT");
            object.setLocation(object.getX()-5, object.getY());
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            tfAction.setText("Pressed arrow key RIGHT");
            object.setLocation(object.getX()+5, object.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tfAction.setText("Mouse clicked");
        object.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        tfAction.setText("Mouse pressed");
        object.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        tfAction.setText("Mouse released");
        object.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        tfAction.setText("Mouse entered the frame");
        object.setLocation(0,0);
    }

    @Override
    public void mouseExited(MouseEvent e) {
       tfAction.setText("Mouse exited the frame");
       object.setLocation(400,400);
    }
    
}
