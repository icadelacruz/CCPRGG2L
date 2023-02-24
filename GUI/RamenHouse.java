
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class RamenHouse implements ActionListener{
    // containers
    JFrame frame = new JFrame("RJ's Ramen House");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    
    //components (panel1)
    JLabel lblMenu = new JLabel("M E N U", SwingConstants.CENTER);
    JLabel lblSingle = new JLabel("This is for a single order only", SwingConstants.CENTER);
    
    // components (panel2)
    JLabel lblRamenType = new JLabel("Choose what type of Ramen you like:");
    ButtonGroup ramenGrp = new ButtonGroup();
    JRadioButton rbtShiro = new JRadioButton("Shiro Ramen [Php 425]", true);
    JRadioButton rbtKuro = new JRadioButton("Kuro Ramen [Php 450]");
    JRadioButton rbtAka = new JRadioButton("Aka Ramen [Php 450]");
    
    // components (panel3)
    JLabel lblSpice = new JLabel("Choose a spice level: ", SwingConstants.CENTER);
    String [] spice = {"Not spicy", "Mild spicy", "Spicy", "Very spicy","Extremely hot"};
    JComboBox<String> cmbSpice = new JComboBox<>(spice);
    JLabel lblNoodles = new JLabel("Choose hardness of noodles: ", SwingConstants.CENTER);
    String [] noodles = {"Soft", "Normal", "Hard"};
    JComboBox<String> cmbNoodle = new JComboBox<>(noodles);
    
    // components (panel4)
    JLabel lblAdditional = new JLabel("Choose additional/toppings/sides [Optional]", SwingConstants.CENTER);
    JCheckBox cbxEgg = new JCheckBox("Tamago [Php 40]");
    JCheckBox cbxNoodle = new JCheckBox("Extra noodles [Php 90]");
    JCheckBox cbxKaraage = new JCheckBox("Chicken karaage [Php 180]");
    JCheckBox cbxChasu = new JCheckBox("Extra 2 chasu slices [Php 120]");
    JCheckBox cbxDrink = new JCheckBox("Iced tea [Php 80]");
    
    //components (panel5)
    JLabel lblName = new JLabel("Customer name: ");
    JLabel lblTable = new JLabel("Table no.: ");
    JTextField txtName = new JTextField(20); // text with 20 characters
    JTextField txtTable = new JTextField(3); // text with 3 characters
    JButton btnSubmit = new JButton("Submit order >>");
    
    public RamenHouse(){
        frame.setLayout(new GridLayout(5,0));
        frame.setSize(900, 420);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.setTitle("RJ's Ramen House");

        Toolkit tk = frame.getToolkit();
        Dimension size = tk.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);

//        lblMenu.setSize(40,40);
        Font  f1  = new Font(Font.SERIF, Font.PLAIN,  30);
        lblMenu.setFont(f1);
        
        panel1.setLayout(new GridLayout(2,1));
        panel1.add(lblMenu);
        panel1.add(lblSingle);
        
        ramenGrp.add(rbtShiro);
        ramenGrp.add(rbtKuro);
        ramenGrp.add(rbtAka);
        
        Box b1 = Box.createVerticalBox();
        b1.add(rbtShiro);
        b1.add(rbtKuro);
        b1.add(rbtAka);
        
        panel2.add(lblRamenType);
        panel2.add(b1);
        
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
        
//        txtName.setText("Enter your name");
//        txtName.setToolTipText("You cannot edit this");
//        txtName.setEditable(false);
        panel5.add(lblName);
        panel5.add(txtName);
        panel5.add(lblTable);
        panel5.add(txtTable);
        panel5.add(btnSubmit);
        
        // registration
        btnSubmit.addActionListener(this);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
//        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        RamenHouse GUI = new RamenHouse();
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Your order has been submitted", "Order confirmed", JOptionPane.INFORMATION_MESSAGE);
        try{
            printOrder();
        }
        catch(Exception ex){
            ex.getMessage();
        }
    }
        
    
    public void printOrder() throws IOException{
        File order = new File("order.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(order));
        try{
            bw.write("=========================[ORDER]=======================");
            bw.newLine();
            bw.write("Customer name: "+txtName.getText());
            bw.newLine();
            bw.write("Table no.: "+txtTable.getText());
            bw.newLine();
            bw.write("=======================================================");
            bw.newLine();
            String ramen;
            String spiceLevel;
            String noodleType;
            ArrayList<String> aOrders = new ArrayList<>();
        
            if(rbtShiro.isSelected()){
                ramen = "Shiro Ramen";
            }
            else if(rbtKuro.isSelected()){
                ramen = "Kuro Ramen";
            }
            else{
                ramen = "Aka Ramen";
            }

            bw.write("Ramen type: "+ramen);
            bw.newLine();
            bw.write("Level of spice: ");
            bw.write(cmbSpice.getItemAt(cmbSpice.getSelectedIndex()));
            bw.newLine();
            bw.write("Hardness of noodles: ");
            bw.write(cmbNoodle.getItemAt(cmbNoodle.getSelectedIndex()));
            bw.newLine();
            
            if(cbxEgg.isSelected()){
                aOrders.add(cbxEgg.getText());
            }
            if(cbxNoodle.isSelected()){
                aOrders.add(cbxNoodle.getText());
            }
            if(cbxKaraage.isSelected()){
                aOrders.add(cbxKaraage.getText());
            }
            if(cbxChasu.isSelected()){
                aOrders.add(cbxChasu.getText());
            }
            if(cbxDrink.isSelected()){
                aOrders.add(cbxDrink.getText());
            }
            
            for(String item : aOrders){
                bw.write(item);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.getCause();
        }
        finally{
            bw.flush();
            bw.close();           
        }

    }
}
