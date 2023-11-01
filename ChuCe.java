package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class ChuCe {
    public static void main(String[] args) {
        //charu("yuio","hhhh","nan","jisuanji","nnnn","989yj");
      new ChuCe();

    }

    ChuCe() {
        JFrame jFrame = new JFrame("注册");
        jFrame.setBounds(20, 20, 500, 500);
        jFrame.setLayout(new GridLayout(6, 2, 10, 50));
        jFrame.setBackground(Color.RED);
        //


        //
        JLabel jLabel = new JLabel("输入用户ID\t");
        JTextField jTextField = new JTextField("", 20);
        //
        JLabel jLabel1 = new JLabel("输入用户password\t");
        JTextField jTextField1 = new JTextField("", 20);
        //
        JLabel jLabel2 = new JLabel("输入用户phone\t");
        JTextField jTextField2 = new JTextField("", 20);
        //
        JLabel jLabel3 = new JLabel("选择用户SEX\t");
        //
        JPanel jPanel = new JPanel();
        JRadioButton jRadioButton = new JRadioButton("男");
        JRadioButton jRadioButton1 = new JRadioButton("女");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        jPanel.add(jRadioButton);
        jPanel.add(jRadioButton1);


        //
        JLabel jLabel4 = new JLabel("输入所学的科目\t");
        JTextField jTextField4 = new JTextField("", 20);
        //
        JButton jButton = new JButton("提交");
        JTextField jTextField3 = new JTextField("加载中》》》》》");
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        //
        jFrame.add(jLabel1);
        jFrame.add(jTextField1);
        //
        jFrame.add(jLabel2);
        jFrame.add(jTextField2);
        //
        jFrame.add(jLabel3);
        jFrame.add(jPanel);
        //
        jFrame.add(jLabel4);
        jFrame.add(jTextField4);
        //
        jFrame.add(jButton);
        jFrame.add(jTextField3);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sexx = new String();
                if (jRadioButton.isSelected()){
                    sexx="男";
                }  else { sexx="女";}


                String text = jTextField.getText();//ID
                String text1 = jTextField1.getText();//PASSword
                String text2 = jTextField2.getText();//Phone
                String text3 = jTextField4.getText();//登录方式
                //sexx性别
                System.out.println(text+text1+text2+text3+ sexx);


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
                String sql="insert into student(studentid,son,sex,conName,phone,LoginMethod,qingjia)"+"values(?,?,?,?,?,?,?)";
                //执行sql对象


                assert conn != null;
                try {
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setString(1,text);
                    preparedStatement.setString(2,text1);
                    preparedStatement.setString(3,text2);
                    preparedStatement.setString(4,text3);
                    preparedStatement.setString(5,"null");
                    preparedStatement.setString(6,"null");
                    preparedStatement.setString(7,"null");



                    int i = preparedStatement.executeUpdate();
                    System.out.println(i);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }


                //




            }
        });
        jFrame.setVisible(true);
        jFrame.setBackground(Color.RED);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }




}
