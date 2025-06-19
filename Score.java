package quiz_application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 100, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Score image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        // Heading label
        JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
        heading.setForeground(Color.DARK_GRAY);
        add(heading);

        // Score label
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
        lblscore.setForeground(Color.BLUE);
        add(lblscore);

        // Play again button
        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 150, 40);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(); // Assumes Login class exists
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
