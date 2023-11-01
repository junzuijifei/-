package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Random;

public class ZhuCe {
    public static void main(String[] args) {
        new ZhuCe();
    }

    ZhuCe() {
        JFrame jFrame = new JFrame("注册");
        jFrame.setBackground(Color.WHITE);
        jFrame.setBounds(100, 100, 800, 550);
        jFrame.setLayout(new GridLayout(6, 1));
        //
        ImageIcon imageIcon5 = new ImageIcon("s0.png");
        imageIcon5.setImage(imageIcon5.getImage().getScaledInstance(60, 60, Image.SCALE_FAST));
        //
        JPanel jPanel4 = new JPanel(new GridLayout(1, 2, 10, 10));
        JButton jButton = new JButton();
        jButton.setBackground(Color.PINK);
        jButton.setFocusPainted(false);
        jButton.setIcon(imageIcon5);


//

        jPanel4.setBackground(Color.WHITE);
        JPanel jPanel0 = new JPanel();
        jPanel0.setBackground(Color.WHITE);
        JComboBox jComboBox = new JComboBox();
        jComboBox.setBackground(Color.WHITE);
        jComboBox.addItem("粗暴的冬天");
        jComboBox.addItem("文静的灯泡");
        jComboBox.addItem("成就的银耳汤");
        jComboBox.addItem("强健的绿草");
        jComboBox.addItem("诚心的玫瑰");
        jComboBox.addItem("挚爱坤坤");
        jComboBox.addItem("暗藏玄鸡");
        jComboBox.addItem("食不食油饼");
        jComboBox.addItem("篮球");
        jComboBox.addItem("伴坤远航");
        jPanel0.add(jComboBox);
        //
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel.setBackground(Color.WHITE);

        JLabel jLabel1 = new JLabel("选择关键词来选择头像:");
        Font font6 = new Font("MS", Font.BOLD, 20);
        jLabel1.setFont(font6);
        jPanel.add(jLabel1);

        jPanel4.add(jPanel);
        jPanel4.add(jPanel0);
        jPanel4.add(jButton);
        //
        ImageIcon imageIcon4 = new ImageIcon("s1.png");
        imageIcon4.setImage(imageIcon4.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
//
        ImageIcon imageIcon6 = new ImageIcon("s2.png");
        imageIcon6.setImage(imageIcon6.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIcon7 = new ImageIcon("s3.png");
        imageIcon7.setImage(imageIcon7.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIcon8 = new ImageIcon("s4.png");
        imageIcon8.setImage(imageIcon8.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIcon9 = new ImageIcon("s5.png");
        imageIcon9.setImage(imageIcon9.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIcon1 = new ImageIcon("s6.jpg");
        imageIcon1.setImage(imageIcon1.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIcon2 = new ImageIcon("s7.jpg");
        imageIcon2.setImage(imageIcon2.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
//
        ImageIcon imageIcon3 = new ImageIcon("s8.jpg");
        imageIcon3.setImage(imageIcon3.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIconl = new ImageIcon("aikun.gif");
        imageIconl.setImage(imageIconl.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));
        //
        ImageIcon imageIconk = new ImageIcon("lanqui.gif");
        imageIconk.setImage(imageIconk.getImage().getScaledInstance(70, 70, Image.SCALE_FAST));

        jComboBox.addActionListener(new AbstractAction() {


            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = jComboBox.getSelectedItem().toString();
                if (text1.equals("粗暴的冬天")) {
                    jButton.setIcon(imageIcon4);
                }
                if (text1.equals("文静的灯泡")) {
                    jButton.setIcon(imageIcon6);
                }
                if (text1.equals("成就的银耳汤")) {
                    jButton.setIcon(imageIcon7);
                }
                if (text1.equals("强健的绿草")) {
                    jButton.setIcon(imageIcon8);
                }
                if (text1.equals("诚心的玫瑰")) {
                    jButton.setIcon(imageIcon9);
                }
                if (text1.equals("挚爱坤坤")) {
                    /*File file = new File("D:\\视频素材\\5月23日(1).MP3");
                    try {
                        Player player = new Player(new FileInputStream(file));
                        player.play();
                    } catch (FileNotFoundException | JavaLayerException s) {
                        // TODO Auto-generated catch block
                        s.printStackTrace();
                    }*/

                    jButton.setIcon(imageIcon1);
                }
                if (text1.equals("暗藏玄鸡")) {
                   /* File file = new File("D:\\视频素材\\aikun.MP3");
                    try {
                        Player player = new Player(new FileInputStream(file));
                        player.play();
                    } catch (FileNotFoundException | JavaLayerException s) {
                        // TODO Auto-generated catch block
                        s.printStackTrace();
                    }*/

                    jButton.setIcon(imageIcon2);
                }
                if (text1.equals("食不食油饼")) {
                    /*File file = new File("D:\\视频素材\\5月23日.MP3");
                    try {
                        Player player = new Player(new FileInputStream(file));
                        player.play();
                    } catch (FileNotFoundException | JavaLayerException s) {
                        // TODO Auto-generated catch block
                        s.printStackTrace();
                    }*/

                    jButton.setIcon(imageIcon3);
                }
                if (text1.equals("篮球")) {
                    jButton.setIcon(imageIconl);
                }
                if (text1.equals("伴坤远航")) {

                    jButton.setIcon(imageIconk);
                   /* File file = new File("D:\\视频素材\\5月23日(1).MP3");
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
        jFrame.add(jPanel4);//1111
        //
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel1.setBackground(Color.WHITE);
        //
        ImageIcon imageIcont = new ImageIcon("tiao.png");
        imageIcont.setImage(imageIcont.getImage().getScaledInstance(60, 60, Image.SCALE_FAST));
        JButton jButton1 = new JButton();
        jButton1.setBorderPainted(false);//不绘制边框
        jButton1.setFocusPainted(false);//选中后不绘制边框
        jButton1.setBackground(Color.WHITE);
        jButton1.setIcon(imageIcont);

        Font font0 = new Font("MS", Font.BOLD, 20);

        JLabel jLabel = new JLabel("输入用户ID:      ");
        jLabel.setFont(font0);
        JTextField jTextField = new JTextField("", 20);
        jPanel1.add(jLabel);
        jPanel1.add(jTextField);
        jPanel1.add(jButton1);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = (int) (Math.random() * 10000);
                String sj = "" + num;
                jTextField.setText(sj);
            }
        });

        jFrame.add(jPanel1);//222
        //
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.WHITE);
        JButton jButton2 = new JButton();
        jButton2.setBorderPainted(false);//不绘制边框
        jButton2.setFocusPainted(false);//选中后不绘制边框
        jButton2.setBackground(Color.WHITE);
        jButton2.setIcon(imageIcont);

        Font font1 = new Font("MS", Font.BOLD, 20);

        JLabel jLabel2 = new JLabel("输入密码  :       ");
        jLabel2.setFont(font1);
        JTextField jTextField1 = new JTextField("", 20);
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField1);
        jPanel2.add(jButton2);
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = (int) (Math.random() * 10000);
                String sj = "" + num;
                jTextField1.setText(sj);
            }
        });
        jFrame.add(jPanel2);//333
        //
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(Color.WHITE);
        JButton jButton3 = new JButton();
        jButton3.setBorderPainted(false);//不绘制边框
        jButton3.setFocusPainted(false);//选中后不绘制边框
        jButton3.setBackground(Color.WHITE);
        jButton3.setIcon(imageIcont);

        Font font3 = new Font("MS", Font.BOLD, 20);

        JLabel jLabel3= new JLabel("输入Name :      ");
        jLabel3.setFont(font3);
        JTextField jTextField3 = new JTextField("", 20);
        jPanel3.add(jLabel3);
        jPanel3.add(jTextField3);
        jPanel3.add(jButton3);
        jButton3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //
                String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                Random random=new Random();
                StringBuffer sb=new StringBuffer();
                for(int i=0;i<4;i++){
                    int number=random.nextInt(62);
                    sb.append(str.charAt(number));
                }
                String s = sb.toString();
                jTextField3.setText(s);
            }
        });
        jFrame.add(jPanel3);//333
        //
        JPanel jPanel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel5.setBackground(Color.WHITE);
        Font f= new Font("MS", Font.BOLD, 20);
        JLabel jLabel4 = new JLabel("选择在校状态                    ");
        jLabel4.setFont(f);
        JComboBox jComboBox1 = new JComboBox();
        jComboBox.setBackground(Color.WHITE);
        jComboBox1.addItem("*******");
        jComboBox1.addItem("在校");
        jComboBox1.addItem("已毕业");
        jPanel5.add(jLabel4);
        jPanel5.add(jComboBox1);
        jFrame.add(jPanel5);//55
        //

        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane22 = new JScrollPane(jTextArea);
        jTextArea.setLineWrap(true);
        ImageIcon img = new ImageIcon("tijiao.png");
        img.setImage(img.getImage().getScaledInstance(214, 77, Image.SCALE_FAST));
        JButton jButton4 = new JButton();
        jButton4.setBackground(Color.WHITE);
        jButton4.setBorderPainted(false);//不绘制边框
        jButton4.setFocusPainted(false);//选中后不绘制边框
        jButton4.setIcon(img);
        //
        JPanel jPanel6 = new JPanel(new GridLayout(1,2));
        jPanel6.setBackground(Color.WHITE);

        jPanel6.add(jScrollPane22);
        jPanel6.add(jButton4);
        jFrame.add(jPanel6);
        jButton4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
                String text = jTextField.getText();//ID
                String text1 = jTextField1.getText();//PASSword
                String text2 = jTextField3.getText();//Phone
                String text3 = jComboBox1.getSelectedItem().toString();//登录方式
                //sexx性别
                System.out.println(text+text1+text2+text3);



                String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
                String user="root";
                String password="123456";
                Connection conn = null;
                try {
                    conn = DriverManager.getConnection(url, user, password);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //定义sql语句
                String sql="insert into student(studentid,son,sname,GraduatioStatus)"+"values(?,?,?,?)";
                //执行sql对象


                assert conn != null;
                try {
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setString(1,text);
                    preparedStatement.setString(2,text1);
                    preparedStatement.setString(3,text2);
                    preparedStatement.setString(4,text3);
                    int i = preparedStatement.executeUpdate();
                    System.out.println(i);
                    if (i==1){
                        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                        Date date = new Date(System.currentTimeMillis());
                        String s = new String(formatter.format(date));
                        jTextArea.append("您在"+s+"添加数据  \n"+"  studentid="+text+"  son="+text1+"  sname="+text2+"  GraduatioStatus="+text3+"\n");
                        jTextArea.append("添加成功\n");
                    }
                    else {
                        jTextArea.append("添加失败\n");
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //
            }
        });




        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
