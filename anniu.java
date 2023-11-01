package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class anniu {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("按钮交换");
        jFrame.setBounds(100,100,800,800);
        jFrame.setLayout(new GridLayout(2,2,20,20));
        jFrame.setBackground(Color.RED);
        //
        JButton jButton = new JButton("1");

        JButton jButton1 = new JButton("2");
        JButton jButton2 = new JButton("3");
        JButton jButton3 = new JButton("4");
        //
        ImageIcon imageIcon4 = new ImageIcon("image\\s1.png");
        imageIcon4.setImage(imageIcon4.getImage().getScaledInstance(200, 200, Image.SCALE_FAST));
//
        ImageIcon imageIcon6 = new ImageIcon("image\\s2.png");
        imageIcon6.setImage(imageIcon6.getImage().getScaledInstance(200, 200, Image.SCALE_FAST));
        //
        ImageIcon imageIcon7 = new ImageIcon("image\\s3.png");
        imageIcon7.setImage(imageIcon7.getImage().getScaledInstance(200, 200, Image.SCALE_FAST));
        //
        ImageIcon imageIcon8 = new ImageIcon("image\\s4.png");
        imageIcon8.setImage(imageIcon8.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        jButton.setIcon(imageIcon4);
        jButton1.setIcon(imageIcon6);
        jButton2.setIcon(imageIcon7);
      //  jButton1.setIcon(imageIcon6);
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton3.setIcon(imageIcon4);
               jButton.setIcon(null);

            }
        });
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton3.setIcon(imageIcon6);
                jButton1.setIcon(null);

            }
        });
        System.out.println(jButton3.getActionCommand());



        //
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);



    }
}
