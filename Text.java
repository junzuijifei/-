package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * 爱坤专属登录页面
 */
public class Text extends JFrame {
    public static void main(String[] args) {
        new Text();
    }

//public static final int FRAME-H=ToolTipManager.S

    Text(){



        setTitle("登录/注册");
        setLayout(new GridLayout(1,2,20,20)); //默认为1行，n列；2行3列，水平间距10，垂直间距5
        setBounds(10,10,550,300);
        //

        ImageIcon imageIcon = new ImageIcon("kunkun.jpg");
        getContentPane().setBackground(Color.red); //正确显示黑色
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);
        //     jLabel.setIcon(new ImageIcon("nihao.jpg"));
        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        add(jPanel);//one
        //
        JPanel jPanel1 = new JPanel();

        JLabel jLabel1 = new JLabel("用户名");
        JTextField jTextField = new JTextField("", 20);
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField);
        //
        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("密  码:");
        JTextField jTextField2 = new JTextField("", 20);
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);
        //
        JPanel jPanel3 = new JPanel();
        JTextField jTextField5 = new JTextField("登录状态404");

        JButton jButton9 = new JButton("登录");
        JButton jButton8 = new JButton("注册");
        jPanel3.add(jTextField5);
        jPanel3.add(jButton8);
        jPanel3.add(jButton9);
//
        JPanel jPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,20));
        //jPanel4.setLayout(new GroupLayout(3,1,5,5));
        jPanel4.add(jPanel1);
        jPanel4.add(jPanel2);
        jPanel4.add(jPanel3);

        jButton9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField.getText().equals("kun")){

                   /* File file = new File("D:\\视频素材\\aikun.MP3");
                    try {
                        Player player = new Player(new FileInputStream(file));
                        player.play();
                    } catch (FileNotFoundException | JavaLayerException s) {
                        // TODO Auto-generated catch block
                        s.printStackTrace();
                    }*/

                }
                else {

                    /*File file = new File("D:\\视频素材\\5月23日(1).MP3");
                    try {
                                Player player = new Player(new FileInputStream(file));
                        player.play();
                    } catch (FileNotFoundException | JavaLayerException s) {
                        // TODO Auto-generated catch block
                        s.printStackTrace();
                    }*/
                }



            }
        });
        jButton8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* File file = new File("D:\\视频素材\\5月23日.MP3");
                try {
                    Player player = new Player(new FileInputStream(file));
                    player.play();
                } catch (FileNotFoundException | JavaLayerException s) {
                    // TODO Auto-generated catch block
                    s.printStackTrace();
                }*/
            }
        });
        add(jPanel4);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);




    }


}
