package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

/**
 * 登录与注册
 */
public class Demo00 extends JFrame {
    public static void main(String[] args) {
        new Demo00();
    }


    Demo00(){

        setTitle("登录/注册");
        setLayout(new GridLayout(1,2,20,20)); //默认为1行，n列；2行3列，水平间距10，垂直间距5
        setBounds(10,10,550,300);
        //

        ImageIcon imageIcon = new ImageIcon("nihao.jpg");
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
        jButton8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ZhuCe();
            }
        });
        jPanel3.add(jTextField5);
        jPanel3.add(jButton8);
        jPanel3.add(jButton9);
//
        JPanel jPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,20));
        //jPanel4.setLayout(new GroupLayout(3,1,5,5));
        jPanel4.add(jPanel1);
        jPanel4.add(jPanel2);
        jPanel4.add(jPanel3);

        add(jPanel4);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jButton9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //
                String text = jTextField.getText();
                String text1 = jTextField2.getText();
                System.out.println(text+"????????"+text1);
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
                String sql="select studentid,son,GraduatioStatus from student;";
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

                        System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
                        if (rs.getString(3).equals("已毕业")){
                            new biye();
                        }
                      if ( rs.getString(1).equals(text)&&rs.getString(2).equals(text1)){
                        jTextField5.setText("登录ok");
                        new Page00();
                        break;
                      }

                      else {
                          jTextField5.setText("登录失败请选择注册");
                      }

                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //执行sql

                //

            }
        });




    }


}
