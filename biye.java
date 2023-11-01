package Denglu;

/*
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class biye {
    public static void main(String[] args) {
        new biye();
    }
    biye(){
        JFrame jFrame = new JFrame("注册");
        jFrame.setBackground(Color.WHITE);
        jFrame.setBounds(100, 100, 800, 550);
        jFrame.setLayout(new GridLayout(1, 1));
        ImageIcon imageIcon5 = new ImageIcon("huijia.png");
        imageIcon5.setImage(imageIcon5.getImage().getScaledInstance(800, 550, Image.SCALE_FAST));
        JButton jButton = new JButton();
        jButton.setBackground(Color.PINK);
        jButton.setFocusPainted(false);
        jButton.setIcon(imageIcon5);
        jFrame.add(jButton);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("D:\\视频素材\\huijia.MP3");
                /*try {
                    Player player = new Player(new FileInputStream(file));
                    player.play();
                } catch (FileNotFoundException | JavaLayerException s) {
                    // TODO Auto-generated catch block
                    s.printStackTrace();
                }*/
            }
        });
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
