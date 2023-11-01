package Denglu;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class genghuan{

    //private String photo;
    private JLabel label;

    public genghuan(){
        JFrame frame = new JFrame();
        frame.setSize(500,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel(new ImageIcon("s0.png"));
        JPanel panel = new JPanel();
        panel.add(label);
        frame.add(panel);
        frame.addMouseListener(new MyListener());
    }



    class MyListener extends MouseAdapter{

        int number;
        public MyListener(){
            super();
            this.number = 0;
        }

        public void mouseClicked(MouseEvent event){
            number++;
            if(number%2 == 1){

                label.setIcon(new ImageIcon("s0.png"));
            }else{
                label.setIcon(new ImageIcon("s1.png"));
            }
        }

    }

    public static void main(String[] args) {

        new genghuan();
    }


}