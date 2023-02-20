
package GUI;

// import swing package
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JFrameDemo {
    JFrame frame = new JFrame("RJ's Ramen House");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    JLabel lblMenu = new JLabel("M E N U", SwingConstants.CENTER);
    JLabel lblSingle = new JLabel("This is for a single order only", SwingConstants.CENTER);
    
    JLabel lblRamenType = new JLabel("Choose what type of Ramen you like:");
    ButtonGroup ramenGrp = new ButtonGroup();
    JRadioButton rbtShiro = new JRadioButton("Shiro Ramen [Php 425]",true);
    JRadioButton rbtKuro = new JRadioButton("Kuro Ramen [Php 450]");
    JRadioButton rbtAka = new JRadioButton("Aka Ramen [Php 450]");
    
    JLabel lblSpice = new JLabel("Choose a spice level: ", SwingConstants.CENTER);
    String [] spice = {"Not spicy", "Mild spicy", "Spicy", "Very spicy","Extremely hot"};
    JComboBox<String> cmbSpice = new JComboBox<>(spice);
    JLabel lblNoodles = new JLabel("Choose hardness of noodles: ", SwingConstants.CENTER);
    String [] noodles = {"Soft", "Normal", "Hard"};
    JComboBox<String> cmbNoodle = new JComboBox<>(noodles);
    
    JLabel lblAdditional = new JLabel("Choose additional/toppings/sides [Optional]", SwingConstants.CENTER);
    JCheckBox cbxEgg = new JCheckBox("Tamago");
    JCheckBox cbxNoodle = new JCheckBox("Extra noodles");
    JCheckBox cbxKaraage = new JCheckBox("Chicken karaage");
    JCheckBox cbxChasu = new JCheckBox("Extra 2 chasu slices");
    JCheckBox cbxDrink = new JCheckBox("Iced tea");
    
    JLabel lblName = new JLabel("Customer name: ");
    JLabel lblTable = new JLabel("Table no.: ");
    JTextField txtName = new JTextField(20);
    JTextField txtTable = new JTextField(3);
    JButton btnSubmit = new JButton("Submit order >>");
    
    public JFrameDemo(){
        frame.setSize(600,420);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // change the exit operation
        frame.setLayout(new GridLayout(5,0));
        
        Toolkit tk = frame.getToolkit();
        Dimension size = tk.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        
        // label - M E N U
        Font  f1  = new Font(Font.SERIF, Font.PLAIN,  30);
        lblMenu.setFont(f1);
        lblMenu.setSize(50, 50);
        
        
        // adding components to the panels
        panel1.add(lblMenu);
        panel1.add(lblSingle);
        panel1.setLayout(new GridLayout(2,0));
        
        
        ramenGrp.add(rbtShiro);
        ramenGrp.add(rbtKuro);
        ramenGrp.add(rbtAka);

        Box b1 = Box.createVerticalBox();
        b1.add(rbtShiro);
        b1.add(rbtKuro);
        b1.add(rbtAka);
        
        panel2.add(lblRamenType, BorderLayout.CENTER);
        panel2.add(b1, BorderLayout.CENTER);
        
        panel3.setLayout(new GridLayout(2,2));
        panel3.add(lblSpice);
        panel3.add(cmbSpice);
        panel3.add(lblNoodles);
        panel3.add(cmbNoodle);
        
        
        Box b2 = Box.createHorizontalBox();
        b2.add(cbxEgg);
        b2.add(cbxNoodle);
        b2.add(cbxKaraage);
        b2.add(cbxChasu);
        b2.add(cbxDrink);
        
        panel4.add(lblAdditional);
        panel4.add(b2);
        
        panel5.add(lblName);
        panel5.add(txtName);
        panel5.add(lblTable);
        panel5.add(txtTable);
        panel5.add(btnSubmit);
        
        btnSubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You have submitted your order", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        // adding components to the frame
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
//        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        JFrameDemo GUI = new JFrameDemo();
    }

    
}
