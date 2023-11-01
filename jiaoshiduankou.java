package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.*;

public class jiaoshiduankou {
    public static void main(String[] args) {
    new jiaoshiduankou("测试","测试");
    }
    jiaoshiduankou(String ID,String Pass){
        JFrame jFrame = new JFrame("欢迎登录辅导员端口");
        jFrame.setBounds(200,200,950,700);
        jFrame.setLayout(new GridLayout(4,2,30,20));
        //添加jiaoshi.jpg图片
        ImageIcon imageIcon = new ImageIcon("jiaoshi.jpg");
       jFrame.getContentPane().setBackground(Color.white); //正确显示黑色
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(120,120,Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);

        //
        jFrame.add(jLabel);//1111
        //
        JLabel jLabel1 = new JLabel("ID:");
        Font font6 = new Font("MS", Font.BOLD, 24);
        jLabel1.setFont(font6);
        JTextField jTextField = new JTextField(ID, 90);
        //
        Font font7 = new Font("MS", Font.BOLD, 24);
        JLabel jLabel2 = new JLabel("Name:");
        jLabel2.setFont(font7);
        JTextField jTextField1 = new JTextField(Pass, 90);



        //
        JPanel jPanel = new JPanel(new GridLayout(2,2,10,30));
        jPanel.setBackground(Color.WHITE);
        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jLabel2);
        jPanel.add(jTextField1);

        //
        jFrame.add(jPanel);//2222
        //
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel1.setBackground(Color.PINK);
        JButton jButton = new JButton("点击查看学生详情");
        Font font2 = new Font("MS", Font.BOLD, 20);
        jButton.setFont(font2);
        jButton.setBackground(Color.YELLOW);
        JTextField jTextField3 = new JTextField("请求状态",30);
        jTextField3.setSize(200,50);


        jPanel1.add(jButton);
        jPanel1.add(jTextField3);

        //33333333
        jFrame.add(jPanel1);
        //4444
        //
//        JTextArea jTextArea1 = new JTextArea();
//        jTextArea1.setLineWrap(true);
//
//
//        jFrame.add(jScrollPane22);
        //
        JTextArea jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);//设置换行
        JScrollPane jScrollPane22 = new JScrollPane(jTextArea);
        jFrame.add(jScrollPane22);

        //5555
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.WHITE);
        Font font = new Font("MS", Font.BOLD, 24);

        JLabel jLabel3 = new JLabel("选择要批假的学生");
        jLabel3.setFont(font);
        JTextField jTextField4 = new JTextField("输入学号", 30);
        jPanel2.add(jLabel3);
        jPanel2.add(jTextField4);

        jFrame.add(jPanel2);
        //666
        JTextField jTextField2 = new JTextField("注意聆听修改状态", 20);

        //
        JPanel jPanel6 = new JPanel();
        jPanel6.setBackground(Color.PINK);
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("批准请假");
        jComboBox.addItem("不批准");
        jComboBox.addItem("同意销假");
        jComboBox.addItem("不同意销假");

        jPanel6.add(jComboBox);

        //
        JButton jButton1 = new JButton("提交");
        jButton1.setBackground(Color.orange);
        JPanel jPanel3 = new JPanel(new GridLayout(3,1,10,20));
        jPanel3.setBackground(Color.PINK);
        jPanel3.add(jTextField2);
        jPanel3.add(jPanel6);
        jPanel3.add(jButton1);
        jFrame.add(jPanel3);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
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
                String sql="select studentid,qingjia from student;";
                //执行sql对象
                Statement statement = null;
                try {
                    statement = conn.createStatement();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {


                    ResultSet rs = statement.executeQuery(sql);
                    while (rs.next()){
                        String zi="StudentID:\t"+rs.getString(1)+"  请假状态"+rs.getString(2);
                        jTextArea.append(zi);
                        jTextArea.append("\n");
                        jTextField3.setText("数据请求ok");
                        File file = new File("D:\\视频素材\\aikun.MP3");
                       /* try {
                            Player player = new Player(new FileInputStream(file));
                            player.play();
                        } catch (FileNotFoundException | JavaLayerException s) {
                            // TODO Auto-generated catch block
                            s.printStackTrace();
                        }
*/

                    }



                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //

            }
        });
jButton1.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = jTextField4.getText();
        String text1 = jComboBox.getSelectedItem().toString();
        System.out.println(text1+text);
//        UPDATE tb_courses_new SET course_name='DB',course_grade=3.5 WHERE course_id=2;
        //
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
        String  sql2="update student set "+"qingjia"+"="+"'"+text1+"'"+" where studentid"+"="+"'"+text+"'";
        //String sql2="UPDATE studentid SET qingjia='"+text1+"'"+" where studentid='"+text+"'";
        //执行sql对象
        Statement statement = null;
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {


         //   ResultSet rs = statement.executeQuery(sql2);
            int i = statement.executeUpdate(sql2);

                if (i==1){
                    File file = new File("D:\\视频素材\\xuigai.MP3");
                   /* try {
                        Player player = new Player(new FileInputStream(file));
                        player.play();
                    } catch (FileNotFoundException | JavaLayerException s) {
                        // TODO Auto-generated catch block
                        s.printStackTrace();
                    }*/
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
