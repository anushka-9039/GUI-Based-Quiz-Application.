package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("SansSerif", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("SansSerif", Font.PLAIN, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
            "<html>" +
                "1. You will be asked 10 multiple-choice questions.<br><br>" +
                "2. Each question has 4 options, only one is correct.<br><br>" +
                "3. You must answer every question.<br><br>" +
                "4. Each correct answer earns 1 point. No negative marking.<br><br>" +
                "5. Total time for the quiz is 15 minutes.<br><br>" +
                "6. Don’t refresh or close the window during the quiz.<br><br>" +
                "7. Final score will be shown at the end." +
            "</html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
