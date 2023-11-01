package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.*;

public class Addkebiao {//添加课表

    public static void main(String[] args) {
        new Addkebiao();
    }
    Addkebiao(){
        JFrame jFrame = new JFrame("添加/修改学生课表");
        jFrame.setBounds(100,100,800,500);
        jFrame.setLayout(new GridLayout(6,1));
        //
        ImageIcon imageIcon = new ImageIcon("kebiao.jpg");
        jFrame.getContentPane().setBackground(Color.white); //正确显示黑色
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(170,80,Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);
       // jFrame.add(jLabel);
        //布局管理
        JPanel jPanel = new JPanel(new GridLayout(1,4));
        jPanel.setBackground(Color.WHITE);
        jPanel.add(jLabel);
        //1.需要修改的学号
        JLabel jLabel1 = new JLabel("输入要修改的学号");
        JTextField jTextField = new JTextField("", 20);
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.green);
        JButton jButton = new JButton("提交");
        jButton.setBackground(Color.yellow);
        jPanel1.add(jButton);
        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jPanel1);
        jFrame.add(jPanel);//1
        //留白
        JTextField jTextField1 = new JTextField();
        jFrame.add(jTextField1);//222
        //选择添加的科目
        JLabel jLabel2 = new JLabel("选择要添加的科目");
        JPanel jPanel3 = new JPanel();
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("数据结构");
        jComboBox.addItem("JAVA程序设计");
        jComboBox.addItem("swing实战");
        jComboBox.addItem("c语言程序设计");
        jComboBox.addItem("练习两年半");
        jComboBox.addItem("嵌入式开发");
        jPanel3.add(jComboBox);
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.pink);
        jPanel2.add(jLabel2);
        jPanel2.add(jPanel3);
        jFrame.add(jPanel2);//333
        //选择教室和上课时间
        JLabel jLabel3 = new JLabel("选择时间与地点");
        //
        JPanel jPanel4 = new JPanel();
        JComboBox jComboBox1 = new JComboBox();
        jComboBox1.addItem("知行楼");
        jComboBox1.addItem("雅行楼");
        jComboBox1.addItem("新商科");
        jComboBox1.addItem("新工课");
        jPanel4.add(jComboBox1);
        //
        JPanel jPanel6 = new JPanel();
        JComboBox jComboBox2 = new JComboBox();

        jPanel6.add(jComboBox2);

        //
        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(Color.WHITE);
        jPanel5.add(jLabel3);
        jPanel5.add(jPanel4);
        jPanel5.add(jPanel6);
        //
        jComboBox1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String s=  jComboBox1.getSelectedItem().toString();
                System.out.println( s);
                if (s.equals("知行楼")){

                   for (int i=1;i<=5;i++){
                      for (int j=1;j<=9;j++){
                          jComboBox2.addItem("知行楼"+i+"0"+j);
                      }
                   }

                }
                if (s.equals("雅行楼")){

                    for (int i=1;i<=5;i++){
                        for (int j=1;j<=9;j++){
                            jComboBox2.addItem("雅行楼"+i+"0"+j);
                        }
                    }

                }
                if (s.equals("新商科")){

                    for (int i=1;i<=3;i++){
                        for (int j=1;j<=6;j++){
                            jComboBox2.addItem("新商科"+i+"0"+j);
                        }
                    }

                }
                if (s.equals("新工课")){

                    for (int i=1;i<=4;i++){
                        for (int j=1;j<=9;j++){
                            jComboBox2.addItem("新工课4"+i+"0"+j);
                        }
                    }

                }







            }
        });
        JLabel jLabel4 = new JLabel("选择开始时间");
        //
        JPanel jPanel7= new JPanel();
        jPanel7.setBackground(Color.pink);
        JComboBox jComboBox7 = new JComboBox();
        jComboBox7.addItem("月");
        jComboBox7.addItem("1");
        jComboBox7.addItem("2");
        jComboBox7.addItem("3");
        jComboBox7.addItem("4");
        jComboBox7.addItem("5");
        jComboBox7.addItem("6");
        jComboBox7.addItem("7");
        jComboBox7.addItem("8");
        jComboBox7.addItem("9");
        jComboBox7.addItem("10");
        jComboBox7.addItem("11");
        jComboBox7.addItem("12");
        jPanel7.add(jComboBox7);
        //
        JPanel jPanel8= new JPanel();
        jPanel8.setBackground(Color.PINK);
        JComboBox jComboBox8 = new JComboBox();
        jComboBox8.addItem("日");
        for (int i=0;i<=30;i++){
            jComboBox8.addItem(""+i);
        }
        jPanel8.add(jComboBox8);
        //
        jPanel5.add(jLabel4);
        jPanel5.add(jPanel7);
        jPanel5.add(jPanel8);
        //
        JLabel jLabel5 = new JLabel("选择结束时间");
        JPanel jPanel9 = new JPanel();
        jPanel9.setBackground(Color.pink);
        JComboBox<Object> jComboBox3 = new JComboBox<>();
        jComboBox3.addItem("月");
        jComboBox3.addItem("1");
        jComboBox3.addItem("2");
        jComboBox3.addItem("3");
        jComboBox3.addItem("4");
        jComboBox3.addItem("5");
        jComboBox3.addItem("6");
        jComboBox3.addItem("7");
        jComboBox3.addItem("8");
        jComboBox3.addItem("9");
        jComboBox3.addItem("10");
        jComboBox3.addItem("11");
        jComboBox3.addItem("12");
        jPanel9.add(jComboBox3);
        jPanel5.add(jLabel5);
        jPanel5.add(jPanel9);
        //
        JPanel jPanel10 = new JPanel();
        jPanel10.setBackground(Color.pink);
        JComboBox<Object> jComboBox4 = new JComboBox<>();
        jComboBox4.addItem("日");
        for (int i=1;i<=30;i++){
            jComboBox4.addItem(""+i);
        }
        jPanel10.add(jComboBox4);
        jPanel5.add(jComboBox4);



        jFrame.add(jPanel5);//44444
        //
        JTextArea jTextArea = new JTextArea("查看提交装态");
        jTextArea.setLineWrap(true);
        JButton jButton1 = new JButton("提交 ");
        jButton1.setBackground(Color.orange);
        JPanel jPanel12 = new JPanel();
        jPanel12.setBackground(Color.white);
        jPanel12.add(jButton1);
        JPanel jPanel11 = new JPanel(new GridLayout(1,2));
        jPanel11.add(jTextArea);
        jPanel11.add(jPanel12);
        jFrame.add(jPanel11);//555

        //
        JScrollPane jScrollPane = new JScrollPane();
        JTextArea jTextArea1 = new JTextArea("");
        jTextArea1.setLineWrap(true);
        jFrame.add(jTextArea1);
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
                String sql="select studentid,son,sname,conName,conLocation,conTime from student where studentid="+"'"+text+"'";
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
                        String hui=   "studentid:    "+ rs.getString(1)+"       son     "+rs.getString(2)+"        sname:        "+rs.getString(3)+"    conName:"+rs.getString(4)+"conLocation"+rs.getString(5)+"conTime::"+rs.getString(6);


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
                String s0=  jComboBox.getSelectedItem().toString();//课程内容
                String s1=  jComboBox2.getSelectedItem().toString();//课程地点

                //
                String text = jTextField.getText();
                System.out.println(s1+text);



                String text2 = jComboBox7.getSelectedItem().toString();//开始的月
                String text3 = jComboBox8.getSelectedItem().toString();//开始的日
                //

                String text5 = jComboBox3.getSelectedItem().toString();//开始的月
                String text6 = jComboBox4.getSelectedItem().toString();//开始的日
                //
                // System.out.println(text1+text2+text3+text4+text5+text6);
                String s = "开始: " + text2 + "-" + text3 +"\n"+ "结束: " + text5 + "-" + text6+"\n";//contime//时间

                System.out.println(s);
                jTextArea1.append("\n");
                jTextArea1.append(s);
//
                String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
                String user="root";
                String password="123456";
                Connection conn = null;
                Statement statement = null;
                String sql1="update student set conName="+"'"+s0+"'"+",conTime="+   "'"+s+"'"+",conLocation="+"'"+s1+"'"+" where studentid=?";
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
                        jTextArea.append("\n");
                        File file = new File("D:\\视频素材\\xuigai.MP3");
                       /* try {
                            Player player = new Player(new FileInputStream(file));
                            player.play();
                        } catch (FileNotFoundException | JavaLayerException f) {
                            // TODO Auto-generated catch block
                            f.printStackTrace();
                        }*/
                    }
                    else {
                        jTextArea.append("修改失败");
                        jTextArea.append("\n");
                        File file = new File("D:\\视频素材\\shibai.mp3");
                       /* try {
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

            }
        });


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
