package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Login extends JFrame implements ActionListener{
JButton rules,back;
JTextField tfname;
public Login(){
getContentPane().setBackground(Color.WHITE);
setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/login.jpeg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0,0,600,500);
    add(image);
    
    JLabel heading = new JLabel("Simple minds");
    heading.setBounds(750,60,300,45);
    heading.setFont(new Font("Viner Hand ITC" , Font.BOLD,40));
    heading.setForeground(Color.BLUE);
    add(heading);
    
    JLabel name = new JLabel("Enter Your Name");
    name.setBounds(810,150,300,20);
    name.setFont(new Font("Viner Hand ITC" , Font.BOLD,18));
    name.setForeground(Color.BLUE);
    add(name);
    
    tfname = new  JTextField();
    tfname.setBounds(735,200,300,25);
    tfname.setFont(new Font("Viner Hand ITC" , Font.BOLD,20));
    add(tfname);
    
     rules =new JButton("Rules");
    rules.setBounds(735,250,120,25);
    rules.setBackground(new Color(30,144,254));
    rules.setForeground(Color.BLACK);
    rules.addActionListener(this);
    add(rules);
    
     back =new JButton("Back");
    back.setBounds(900,250,120,25);
    back.setBackground(new Color(30,144,254));
    back.setForeground(Color.BLACK);
    back.addActionListener(this);
    add(back);
    
    setSize(1200,500);
    setLocation(200,150);
    setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == rules){
        String name = tfname.getText();
        this.setVisible(false);
        new Rules(name);
    }
    else if(ae.getSource() == back){
       this.setVisible(false);    
    


    }
}
public static void main(String[]args){
    new Login();
}

}
