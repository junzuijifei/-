package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Page06 {//修改学生课表
    public static void main(String[] args) {
    new Page06();
    }
    Page06(){
        JFrame jFrame = new JFrame("修改学生课表");
        jFrame.setBounds(200,200,600,250);
        jFrame.setLayout(new GridLayout(1,2,20,300));
        //
        ImageIcon imageIcon = new ImageIcon("kebiao.jpg");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(300,200,Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);
        //     jLabel.setIcon(new ImageIcon("nihao.jpg"));
        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        jFrame.add(jPanel);//one

        //
        JPanel jPanel2 = new JPanel(new GridLayout(3, 2,10,30));

        JLabel jLabel1 = new JLabel("输入ID");
        JTextField jTextField = new JTextField("", 20);
        //
        JLabel jLabel2 = new JLabel("选择要添加的科目");
        JPanel jPanel1 = new JPanel();
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("数据结构");
        jComboBox.addItem("JAVA程序设计");
        jComboBox.addItem("swing实战");
        jComboBox.addItem("c语言程序设计");
        jComboBox.addItem("练习两年半");
        jComboBox.addItem("嵌入式开发");

        jPanel1.add(jComboBox);
        //
        JButton jButton = new JButton("提交");
        JTextField jTextField2 = new JTextField("查看修改状态",20);
        jPanel2.add(jLabel1);
        jPanel2.add(jTextField);
        jPanel2.add(jLabel2);
        jPanel2.add(jPanel1);
        jPanel2.add(jButton);
        jPanel2.add(jTextField2);

        //
        jFrame.add(jPanel2);



        jButton.addActionListener(new AbstractAction() {
            String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
            String user="root";
            String password="123456";
            Connection conn = null;
            Statement statement = null;

            PreparedStatement preparedStatement=null;

              //  String xuan= jComboBox.getSelectedItem().toString().trim();

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();
                String text1 = jComboBox.getSelectedItem().toString();
                String text2="conName";
                System.out.println(text+text1);
                String  sql="update student set "+text2+"="+"'"+text1+"'"+" where studentid"+"="+"'"+text+"'";
                //
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
                        jTextField2.setText("okokok");
                       /* File file = new File("D:\\视频素材\\aikun.MP3");
                        try {
                            Player player = new Player(new FileInputStream(file));
                            player.play();
                        } catch (FileNotFoundException | JavaLayerException s) {
                            // TODO Auto-generated catch block
                            s.printStackTrace();
                        }*/
                    }else {
                        jTextField2.setText("nonon");
                        /*File file = new File("D:\\视频素材\\5月23日(1).MP3");
                        try {
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


            }
        });


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
