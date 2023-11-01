package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

/**
 * 删除学生详情
 *
 */
public class Page03 extends JFrame {
    public static void main(String[] args) {
        new Page03();
    }

//public static final int FRAME-H=ToolTipManager.S

    Page03(){



        setTitle("删除/学生信息");
        setLayout(new GridLayout(1,2,20,20)); //默认为1行，n列；2行3列，水平间距10，垂直间距5
        setBounds(10,10,550,300);
        //

        ImageIcon imageIcon = new ImageIcon("zi.jpg");
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
        JLabel jLabel2 = new JLabel();
        JTextField jTextField2 = new JTextField("输入这正确的ID", 20);
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);
        //
        JPanel jPanel3 = new JPanel();
        JTextField jTextField5 = new JTextField("查看删除状态");

        JButton jButton9 = new JButton("删除");


        jPanel3.add(jTextField5);

        jPanel3.add(jButton9);
//
        JPanel jPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,20));
        //jPanel4.setLayout(new GroupLayout(3,1,5,5));
        jPanel4.add(jPanel1);
        jPanel4.add(jPanel2);
        jPanel4.add(jPanel3);

        add(jPanel4);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jButton9.addActionListener(new AbstractAction() {
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
                String text = jTextField.getText();
                //定义sql语句
                String text1= jTextField2.getText();
                String text3="删除申请以提交";
               // String sql="DELETE from student where studentid='"+text+"';";
              String  sql="update student set `delete`='删除申请'where studentid=?";
                //执行sql对象
                Statement statement = null;
                try {
                    statement = conn.createStatement();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setString(1,text);

                    int i = preparedStatement.executeUpdate();


//                    int i = statement.executeUpdate(sql);
                    if (i==1){
                        jTextField5.setText("删除已提交");

                    }
                    else {
                        jTextField5.setText("删除失败！！！！！！");
                    }


                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //

            }
        });





    }


}
