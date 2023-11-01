package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class xuanke {//选课
    public static void main(String[] args) {
        new xuanke();
    }

    xuanke() {
        JFrame jFrame = new JFrame("查询选课详情");
        jFrame.setBounds(100, 100, 650, 400);
        jFrame.setLayout(new GridLayout(4, 1, 10, 10));
        jFrame.setBackground(Color.white);
        //
        ImageIcon imageIcon = new ImageIcon("xuanke.png");
        jFrame.getContentPane().setBackground(Color.white); //正确显示黑色
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(200, 75, Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);
        jFrame.add(jLabel);//
        JLabel jLabel1 = new JLabel("输入要查询的学号");
        JButton jButton = new JButton("提交");
        jButton.setBackground(Color.PINK);
        JTextField jTextField = new JTextField("", 20);


        //  JPanel jPanel = new JPanel(new GridLayout(1,4,5,5));
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel.setBackground(Color.WHITE);
        jPanel.add(jLabel);
        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jFrame.add(jPanel);//1111
        //
        JLabel jLabel2 = new JLabel("时间:     ");
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.WHITE);
        jPanel2.add(jLabel2);
        JTextField jTextField1 = new JTextField("", 20);//时间
        JLabel jLabel3 = new JLabel("地点:        ");
        JTextField jTextField2 = new JTextField("", 20);//地点
        JLabel jLabel4 = new JLabel("课程Name:\t");
        JTextField jTextField3 = new JTextField("", 20);//name
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.WHITE);
        jPanel1.add(jPanel2);
        jPanel1.add(jTextField1);
        jFrame.add(jPanel1);//222
        //
        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(Color.WHITE);
        jPanel5.add(jLabel3);
        jPanel5.add(jTextField2);
        jFrame.add(jPanel5);//333
        //
        JPanel jPanel6 = new JPanel();
        jPanel6.setBackground(Color.WHITE);
        jPanel6.add(jLabel4);
        jPanel6.add(jTextField3);
        jFrame.add(jPanel6);//222
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();


                String url = "jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
                String user = "root";
                String password = "123456";
                Connection conn = null;
                try {
                    conn = DriverManager.getConnection(url, user, password);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //定义sql语句
                String sql = "select conLocation,conTime,conName from student where studentid=" + "'" + text + "'";
                //执行sql对象
                Statement statement = null;
                try {
                    statement = conn.createStatement();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {


                    ResultSet rs = statement.executeQuery(sql);

                    while (rs.next()) {
                       // String hui = "studentid:    " + rs.getString(1) + "       son     " + rs.getString(2) + "        sname:        " + rs.getString(3) + "    conName:" + rs.getString(4) + "conLocation" + rs.getString(5) + "conTime::" + rs.getString(6);
                        jTextField2.setText(rs.getString(1));
                        jTextField1.setText(rs.getString(2));
                        jTextField3.setText(rs.getString(3));


                    }


                } catch (SQLException ex) {
                    ex.printStackTrace();
                }


            }
        });


        //
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
