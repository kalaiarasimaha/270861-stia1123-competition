package kalai.GUI.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window1 extends JFrame implements ActionListener {

    private JButton b1, b2, b3;

    public Window1(){
        b1 = new JButton("Button1");
        b1.setBounds(50,50,100,40);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Button2");
        b2.setBounds(50,150,100,40);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("Button3");
        b3.setBounds(50,250,100,40);
        add(b3);
        b3.addActionListener(this);

        setTitle("My Example");
        setSize(700,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            JOptionPane.showConfirmDialog(this,"Hello Button 1");
        } else if (e.getSource() == b2){
            JOptionPane.showConfirmDialog(this,"Hello Button 2");
        } else {
            JOptionPane.showConfirmDialog(this, "Hello Button 3");
        }

    }

    public static void main(String[] args) {
        new Window1();
    }
}
