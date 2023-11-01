package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

/**
 * 修改学生信息
 */
public class Page05 {
    public static void main(String[] args) {
        new Page05();
    }
    Page05(){
        JFrame jFrame = new JFrame("修改学生信息");
        jFrame.setBounds(200,200,500,500);
        jFrame.setLayout(new GridLayout(5,2,10,50));
        //jFrame.setBackground(Color.RED);
        //
        JLabel jLabel = new JLabel("输入要修复改动的ID");
        JTextField jTextField = new JTextField("", 20);
        //
        JLabel jLabel1 = new JLabel("选择要修改的字段");
        JPanel jPanel = new JPanel();
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("studentid");
        jComboBox.addItem("son");
        jComboBox.addItem("sex");
        jComboBox.addItem("phone");

        jPanel.add(jComboBox);
        //
        JLabel jLabel2 = new JLabel("输入修改后的内容");
        JTextField jTextField2 = new JTextField("", 20);
        //
        JLabel jLabel3 = new JLabel("查看修改状态");
        JTextField jTextField3 = new JTextField("", 20);
        //

        JTextField jTextField4 = new JTextField("************************", 20);
        JButton jButton = new JButton("提交");
        //
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jLabel1);
        jFrame.add(jPanel);
        jFrame.add(jLabel2);
        jFrame.add(jTextField2);
        jFrame.add(jLabel3);
        jFrame.add(jTextField3);

        jFrame.add(jTextField4);
        jFrame.add(jButton);


        jButton.addActionListener(new AbstractAction() {

            String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
            String user="root";
            String password="123456";
            Connection conn = null;
            Statement statement = null;

            PreparedStatement preparedStatement=null;




            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();
                String text1 = jComboBox.getSelectedItem().toString();
                String text3 = jTextField2.getText();
                System.out.println(text+text1+text3);
//                String sql1="update student set +text1+"="+"  where studentid=?";
//                       String  sql="update student set "+"'"+text1+"'"+"="+"'"+text3+"'"+" where studentid"+"="+"'"+text;
                String  sql="update student set "+text1+"="+"'"+text3+"'"+" where studentid"+"="+"'"+text+"'";
                Connection conn = null;
                try {
                    conn = DriverManager.getConnection(url, user, password);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                Statement statement = null;
                try {
                    statement = conn.createStatement();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {

                    int i = statement.executeUpdate(sql);
                    if (i==1){
                        jTextField3.setText("okokok");
                    }else {
                        jTextField3.setText("nonon");
                    }



                } catch (SQLException ex) {
                    ex.printStackTrace();
                }


            }
        });

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    }
}
