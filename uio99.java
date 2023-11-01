package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class uio99 {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("注册");
        jFrame.setBounds(100, 100, 800, 550);
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        //
      //  JPanel jPanel = new JPanel();

        JButton jButton = new JButton("jjj");
        jButton.setFocusPainted(false);
        jFrame.add(jButton);
        //
        ImageIcon imageIcon4 = new ImageIcon("s3.png");
        imageIcon4.setImage(imageIcon4.getImage().getScaledInstance(60, 60, Image.SCALE_FAST));
        ImageIcon imageIcon3 = new ImageIcon("s2.png");
        imageIcon3.setImage(imageIcon3.getImage().getScaledInstance(60, 60, Image.SCALE_FAST));
        JButton jButton1 = new JButton();
        jButton1.setBackground(Color.WHITE);
        jButton1.setIcon(imageIcon3);

        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1.setIcon(imageIcon4);
            }
        });

//        JLabel jLabel3 = new JLabel(imageIcon3);
        jFrame.add(jButton1);






        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
