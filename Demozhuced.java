package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Demozhuced {//注册页面
    public static void main(String[] args) {
        new Demozhuced();
    }
    Demozhuced(){
        JFrame jFrame = new JFrame("请选择注册");
        jFrame.setBackground(Color.RED);

     // jFrame.setLayout(new GridLayout(6,1,20,20)); //1,行，1，l
       jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.setBounds(100,200,1300,300);

        //开始书写页面
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel = new JLabel("请输入姓名:");
        JTextField jTextField = new JTextField("",30);
        jPanel.add(jLabel);
        jPanel.add(jTextField);


        //
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel1 = new JLabel("请输入密码:");
        JPasswordField jTextField1 = new JPasswordField("",30);
        jPanel.add(jLabel1);
        jPanel.add(jTextField1);
        //
        JPanel jPanel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel7 = new JLabel("请输入电话:");
        JTextField jTextField17 = new JTextField("",30);
        jPanel.add(jLabel7);
        jPanel.add(jTextField17);
        //
        JPanel jPanel2 = new JPanel(new GridLayout(1,3,5,0));

        JLabel jLabel2 = new JLabel("性别");
        JRadioButton jRadioButton = new JRadioButton("男");
        JRadioButton jRadioButton1 = new JRadioButton("女");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        jPanel.add(jLabel2);
        jPanel.add(jRadioButton);
        jPanel.add(jRadioButton1);
//
        JPanel jPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
     //   JLabel jLabel6 = new JLabel("爱好");
        JCheckBox box1 = new JCheckBox("唱");

     JCheckBox box2 = new JCheckBox("跳");
        JCheckBox box3 = new JCheckBox("说唱");
        JCheckBox box4 = new JCheckBox("篮球");
        JPanel jPanel3 = new JPanel();
      //  jPanel3.add(jLabel6);
        jPanel3.add(box1);
        jPanel3.add(box2);
        jPanel3.add(box3);
        jPanel3.add(box4);
        jPanel4.add(jPanel3);

        //
        JPanel jPanel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel8 = new JLabel("登录方式");
        jPanel5.add(jLabel8);
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("因特网");
        jComboBox.addItem("vpn");
        jComboBox.addItem("其他方式");
        jComboBox.addItem("篮球");
        jPanel5.add(jComboBox);
        //
     JButton jButton = new JButton("提交");

     //

        jFrame.add(jPanel);//添加第一添加用户名字
        jFrame.add(jPanel1);//添加用户密码
        jFrame.add(jPanel7);
        jFrame.add(jPanel2);//添加性别
        jFrame.add(jPanel4);//添加爱好
        jFrame.add(jPanel5);//添加登录方式
     jFrame.add(jButton);
     jButton.addActionListener(new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
          String s1 = new String(jTextField17.getText());
          String password = new String(jTextField1.getPassword());
          String text = jTextField.getText();
          System.out.println(jTextField.getText()+password);
       Component[] jcbs = jPanel3.getComponents();//将勾选的内容存入数组

       for(Component component : jcbs) {
        JCheckBox jcb = (JCheckBox) component;
        if(jcb.isSelected()) {
         System.out.println(jcb.getText());//输出爱好
        }
       }

          String s2 = jComboBox.getSelectedItem().toString();
          System.out.println(s2);
        String s = new String();
          if (jRadioButton.isSelected()){
              s="男";

       System.out.println("男");
      }else {
              s="女";
       System.out.println("女");
      }
      //
//          String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
//          String user="root";
//          String password1="123456";
//          Connection conn = null;
//          try {
//              conn = DriverManager.getConnection(url, user, password1);
//          } catch (SQLException ex) {
//              ex.printStackTrace();
//          }
//          //定义sql语句
//
//          String sql="insert into student values ("+  "'"+         text+ "'"+ ","+password+","+  "'"+ s+"'"+","+"'22'"+","+ "'"+s1+"'"+","+"'"+s2+"'"+")";
//          System.out.println(sql);
//
//          Statement statement = null;
//          try {
//              statement = conn.createStatement();
//          } catch (SQLException ex) {
//              ex.printStackTrace();
//          }
//          try {
//              long l = statement.executeLargeUpdate(sql);//执行sql语句
//              System.out.println(l);
//              if (l==1){
//                  JDialog jDialog = new JDialog(jFrame, "登录状态");
//                  jDialog.setBounds(10,10,200,200);
//                  JLabel jLabel3 = new JLabel("登录ok");
//                  jDialog.add(jLabel3);
//                  jDialog.setVisible(true);
//                  jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//              }else {
//                  JDialog jDialog = new JDialog(jFrame, "登录状态");
//                  jDialog.setBounds(10,10,200,200);
//                  JLabel jLabel3 = new JLabel("登录失败");
//                  jDialog.add(jLabel3);
//                  jDialog.setVisible(true);
//                  jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//
//              }
//
//
//          } catch (SQLException ex) {
//              ex.printStackTrace();
//          }
//


      }
     });


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(3);

    }
}
