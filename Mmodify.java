package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Mmodify {//修改学生信息
    public static void main(String[] args) {
        new Mmodify();
    }
    Mmodify(){
        JFrame jFrame = new JFrame("修改学生信息");
        jFrame.setBounds(100,100,1000,500);
        jFrame.setLayout(new GridLayout(6,1,1,5));

        //
        ImageIcon imageIcon = new ImageIcon("ggg.png");
        jFrame.getContentPane().setBackground(Color.white); //正确显示黑色
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(150,160,Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);

        //

        //
        JLabel jLabel1 = new JLabel("ID:");

        JTextField jTextField = new JTextField( 10);
        //

        JLabel jLabel2 = new JLabel("密码:");


        JTextField jTextField1 = new JTextField(10);
        //
        JPanel jPanel = new JPanel(new GridLayout(1,5,2,2));
        jPanel.setBackground(Color.WHITE);

//
        JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton jButton = new JButton("查询");
        jButton.setBackground(Color.RED);
        jPanel2.add(jButton);
        //

        JPanel jPanel1 = new JPanel(new GridLayout(1,5,0,0));
        jPanel1.setBackground(Color.WHITE);
        jPanel1.add(jLabel);//添加图片
        jPanel1.add(jLabel1);//添加 ID
        jPanel1.add(jTextField);//添加id框

        jPanel1.add(jPanel2);
        jFrame.add(jPanel1);//111
        //
        JTextField jTextField2 = new JTextField("4  0  4",30);
        jTextField2.setBackground(Color.pink);
        jFrame.add(jTextField2);//222
        //
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(Color.WHITE);
        JLabel jLabel3 = new JLabel("选择要修改的字段");
        //
        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(Color.WHITE);
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("studentid");
        jComboBox.addItem("son");
        jComboBox.addItem("sex");
        jComboBox.addItem("phone");
        jComboBox.addItem("sname");
        jPanel4.add(jComboBox);
        jPanel3.add(jLabel3);
        jPanel3.add(jPanel4);
        jFrame.add(jPanel3);//3333


        //
        JButton jButton1 = new JButton("提交");
        jButton1.setBackground(Color.PINK);
        JPanel jPanel8 = new JPanel();
        jPanel8.setBackground(Color.WHITE);
        jPanel8.add(jButton1);
        JPanel jPanel5 = new JPanel(new GridLayout(1,3));
        jPanel5.setBackground(Color.WHITE);
        JLabel jLabel4 = new JLabel("输入修改后的内容");
        JPanel jPanel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel7.setBackground(Color.WHITE);
        JTextField jTextField3 = new JTextField("33333", 20);
        jPanel7.add(jTextField3);

        JPanel jPanel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel6.setBackground(Color.WHITE);
        jPanel6.add(jLabel4);
        jPanel5.add(jPanel6);
        jPanel5.add(jPanel7);
        jPanel5.add(jPanel8);
        jFrame.add(jPanel5);//443
        //
        JTextField jTextField4 = new JTextField("查看修改状态", 20);
        jFrame.add(jTextField4);
//
        JTextArea jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jFrame.add(jTextArea);

        //
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();


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
                String sql="select studentid,son,sex,conName,phone from student where studentid="+"'"+text+"'";
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
                        String hui=   "studentid:    "+ rs.getString(1)+"       son     "+rs.getString(2)+"        SEX:        "+rs.getString(3)+"    PHONE:"+rs.getString(5)+"\n";


                        jTextField2.setText(hui);
                    }


                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                //


            }
        });
        jButton1.addActionListener(new AbstractAction() {
            String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
            String user="root";
            String password="123456";
            Connection conn = null;
            Statement statement = null;

            PreparedStatement preparedStatement=null;

            @Override
            public void actionPerformed(ActionEvent e) {
                //
                String text = jTextField.getText();
                String text1 = jComboBox.getSelectedItem().toString();
                String text3 = jTextField3.getText();
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
                        jTextField4.setText("数据修改成功");
                        //
                        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                        Date date = new Date(System.currentTimeMillis());
                        String s = new String(formatter.format(date));
                        jTextArea.append("时间"+s+"数据提交成功"+text1+"修改为----->"+text3);
                        jTextArea.append("\n");
                    }else {
                        jTextField3.setText("数据修改失败");
                        jTextArea.append("\n");
                    }



                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //


            }
        });


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//只关闭这个页面

    }

}
