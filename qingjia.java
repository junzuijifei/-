package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class qingjia {//学生申请请假
    public static void main(String[] args) {
        new qingjia();
    }
     qingjia(){
         JFrame jFrame = new JFrame("学生申请请假");
         jFrame.setBounds(100,100,600,500);
         jFrame.setLayout(new GridLayout(5,1,1,1));
         //
         Toolkit tk = Toolkit.getDefaultToolkit();
         //获取图片 三种图片格式都可以
         java.awt.Image img = tk.getImage("qingjia.jpg");
         // 给窗体设置图标
         jFrame.setIconImage(img);


         //
         ImageIcon imageIcon = new ImageIcon("qingjia.jpg");
         jFrame.getContentPane().setBackground(Color.white); //正确显示黑色
         imageIcon.setImage(imageIcon.getImage().getScaledInstance(170,80,Image.SCALE_FAST));
         JLabel jLabel = new JLabel(imageIcon);

         //
         JLabel jLabel1 = new JLabel("输入要修改的学生的ID");
         JTextField jTextField = new JTextField("",20);
         JPanel jPanel = new JPanel();
         jPanel.setBackground(Color.WHITE);
         jPanel.add(jLabel);
         jPanel.add(jLabel1);
         jPanel.add(jTextField);
         jFrame.add(jPanel);//11111


         //
         JTextField jTextField1 = new JTextField("", 50);
         JButton jButton = new JButton("查询");
         jButton.setBackground(Color.cyan);
         JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
         jPanel1.setBackground(Color.WHITE);
         jPanel1.add(jTextField1);
         jPanel1.add(jButton);
         jFrame.add(jPanel1);
         //
         JPanel jPanel2 = new JPanel();
         jPanel2.setBackground(Color.WHITE);
         JLabel jLabel2 = new JLabel("选择开始时间:                 ");//17个
         //
         JPanel jPanel4 = new JPanel();
         jPanel4.setBackground(Color.PINK);
         JComboBox jComboBox = new JComboBox();
         jComboBox.addItem("年");
         jComboBox.addItem("2023");
         jComboBox.addItem("2024");
         jComboBox.addItem("2025");
         jComboBox.addItem("2026");
         jComboBox.addItem("2027");
         jPanel4.add(jComboBox);
         //
         JPanel jPanel5= new JPanel();
         jPanel5.setBackground(Color.pink);
         JComboBox jComboBox1 = new JComboBox();
         jComboBox1.addItem("月");
         jComboBox1.addItem("1");
         jComboBox1.addItem("2");
         jComboBox1.addItem("3");
         jComboBox1.addItem("4");
         jComboBox1.addItem("5");
         jComboBox1.addItem("6");
         jComboBox1.addItem("7");
         jComboBox1.addItem("8");
         jComboBox1.addItem("9");
         jComboBox1.addItem("10");
         jComboBox1.addItem("11");
         jComboBox1.addItem("12");
         jPanel5.add(jComboBox1);
         //
         JPanel jPanel6= new JPanel();
         jPanel6.setBackground(Color.PINK);
         JComboBox jComboBox6 = new JComboBox();
         jComboBox6.addItem("日");
         for (int i=0;i<=30;i++){
             jComboBox6.addItem(""+i);
         }
         jPanel6.add(jComboBox6);
         //
         jPanel2.add(jLabel2);
         jPanel2.add(jPanel4);
         jPanel2.add(jPanel5);
         jPanel2.add(jPanel6);
         //
         jFrame.add(jPanel2);//333
         //
         //
         //
         //
         //
         //
         JPanel jPanel3 = new JPanel();
         JLabel jLabel3 = new JLabel("选择结束时间                 ");
         //
         JPanel jPanel7 = new JPanel();
         jPanel7.setBackground(Color.PINK);
         JComboBox jComboBox7 = new JComboBox();
         jComboBox7.addItem("年");
         jComboBox7.addItem("2023");
         jComboBox7.addItem("2024");
         jComboBox7.addItem("2025");
         jComboBox7.addItem("2026");
         jComboBox7.addItem("2027");
         jPanel7.add(jComboBox7);
         //
         JPanel jPanel8 = new JPanel();
         jPanel8.setBackground(Color.PINK);
         JComboBox jComboBox8 = new JComboBox();
         jComboBox8.addItem("月");
        for (int i=1;i<=12;i++){
            jComboBox8.addItem(""+i);
        }
         jPanel8.add(jComboBox8);
        //
         JPanel jPanel9= new JPanel();
         jPanel9.setBackground(Color.PINK);
         JComboBox jComboBoxp = new JComboBox();
         jComboBoxp.addItem("日");
         for (int i=0;i<=30;i++){
             jComboBoxp.addItem(""+i);
         }
         jPanel9.add(jComboBoxp);



         //
         jPanel3.add(jLabel3);
         jPanel3.add(jPanel7);
         jPanel3.add(jPanel8);
         jPanel3.add(jPanel9);
         jFrame.add(jPanel3);//444
         JTextArea jTextArea = new JTextArea("");
         jTextArea.setLineWrap(true);

         JButton jButton1 = new JButton("提交");
         JPanel jPanel11 = new JPanel();
         jPanel11.add(jButton1);
         JPanel jPanel10 = new JPanel(new GridLayout(1,3));
         JTextArea jTextArea1 = new JTextArea();
         jTextArea1.setLineWrap(true);
         jTextArea1.setBackground(Color.orange);
         jPanel10.add(jTextArea1);
         jPanel10.add(jTextArea);
         jPanel10.add(jPanel11);
         jFrame.add(jPanel10);//5555
         jButton.addActionListener(new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 //
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
                 String sql="select studentid,sname,qingjia,qingjiaTime from student where studentid="+"'"+text+"'";
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
                         String hui=   "studentid: "+ rs.getString(1)+" sname "+rs.getString(2)+" 请假状态:"+rs.getString(3) +"  请假时间  "+rs.getString(4);
                         jTextField1.setText(hui);


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
                 //
                 String text = jTextField.getText();

                 String text1 = jComboBox.getSelectedItem().toString();//开始的年份
                 String text2 = jComboBox1.getSelectedItem().toString();//开始的月
                 String text3 = jComboBox6.getSelectedItem().toString();//开始的日
                 //
                 String text4 = jComboBox7.getSelectedItem().toString();//结束的年份
                 String text5 = jComboBox8.getSelectedItem().toString();//开始的月
                 String text6 = jComboBoxp.getSelectedItem().toString();//开始的日
                 //
                // System.out.println(text1+text2+text3+text4+text5+text6);
                 String s = new String("开始: " + text1 + "-" + text2 + "-" + text3 +"\n"+ "结束： " + text4 + "-" + text5 + "-" + text6+"\n");

                 System.out.println(s);
                 jTextArea1.append(s);

                 String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
                 String user="root";
                 String password="123456";
                 Connection conn = null;
                 Statement statement = null;
                String sql1="update student set qingjia='NotApproved' "+",qingjiaTime="+   "'"+s+"'"+" where studentid=?";
                 System.out.println(sql1);
                 PreparedStatement preparedStatement=null;
                 try {
                     conn = DriverManager.getConnection(url, user, password);
                 } catch (SQLException ex) {
                     ex.printStackTrace();
                 }
                 assert conn != null;
                 try {
                     preparedStatement = conn.prepareStatement(sql1);
                     preparedStatement.setString(1,text);




                     int i = preparedStatement.executeUpdate();
                     if (i==1){
                         jTextArea.append("修改成功");
                        /* File file = new File("D:\\视频素材\\xuigai.MP3");
                         try {
                             Player player = new Player(new FileInputStream(file));
                             player.play();
                         } catch (FileNotFoundException | JavaLayerException f) {
                             // TODO Auto-generated catch block
                             f.printStackTrace();
                         }*/
                     }
                     else {
                         jTextArea.append("修改失败");
                         /*File file = new File("D:\\视频素材\\shibai.mp3");
                         try {
                             Player player = new Player(new FileInputStream(file));
                             player.play();
                         } catch (FileNotFoundException | JavaLayerException f) {
                             // TODO Auto-generated catch block
                             f.printStackTrace();
                         }*/
                     }
                     System.out.println(i);
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
