package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Page00 {
    public static void main(String[] args) {
        new Page00();
    }
    Page00(){
        JFrame jFrame = new JFrame("欢迎登录学生端");
        jFrame.setBounds(200,200,700,600);


       // jFrame.setBackground(Color.orange);
        Container contentPane = jFrame.getContentPane();
        jFrame.setLayout(new GridLayout(1,3,10,20));

        //
        JPanel jList = new JPanel();

        Color bgColor2 = new Color(236, 213, 165);
        jList.setBackground(bgColor2);


        jList.setLayout(new FlowLayout(1,5,30));
       // JList jList = new JList();
       // jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.setBorder(BorderFactory.createTitledBorder("请选择以下的选项"));
        JButton jButton0 = new JButton("查询学生详情");

        JButton jButton1 = new JButton("学生申请请假");

        JButton jButton2 = new JButton("查询学生选课详情");

        JButton jButton3 = new JButton("删除学生信息");
        JButton jButton4 = new JButton("修改学生信息");
        JButton jButton5 = new JButton("添加学生课表");
        JButton jButton6 = new JButton("选择更新数据");
        JButton jButton7 = new JButton("选择登录教师端口");



        jList.add(jButton0);
        jList.add(jButton1);
        jList.add(jButton2);
        jList.add(jButton3);
        jList.add(jButton4);
        jList.add(jButton5);
        jList.add(jButton6);
        jList.add(jButton7);
      //  contentPane.add(new JScrollPane(jList));
       // String[] s2 = { "范志毅", "符兵", "周宁", "杨晨",   "高锋", "南方", "其他" };


        //


        //

        jFrame.add(jList);//第一次添加
//


//        String[] s2 = {  };
//        JList list2 = new JList(s2);
//        JScrollPane jScrollPane = new JScrollPane(list2);


       // list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   //     list2.setBorder(BorderFactory.createTitledBorder("查看学生选项"));


      //  Container contentPane1 = jFrame.getContentPane();//获取对象
        JTextArea jTextArea1 = new JTextArea();
        jTextArea1.setLineWrap(true);
        JScrollPane jScrollPane22 = new JScrollPane(jTextArea1);

        jFrame.add(jScrollPane22);//第2次添加
        ///



       // jFrame.add(list2);
        JTextArea jTextArea = new JTextArea("查看日志");
        jTextArea.append("\n");
        jTextArea.setLineWrap(true);
        jFrame.add(jTextArea);//3333333333333
        //开始输入






        jButton0.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("查询学生详情信息");
                jTextArea.append("\n");
                //
                String url="jdbc:mysql://localhost:3306/?user=root?serverTimezone=UTC";
                String user="root";
                String password="123456";
                Connection conn = null;
                try {
                    conn = DriverManager.getConnection(url, user, password);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //定义sql语句
                String sql="select studentid,son,sex,conName,phone from student;";
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
                    String hui=   "NAME:"+ rs.getString(1)+"++ID"+rs.getString(2)+"++SEX:"+rs.getString(3)+"++PHONE:"+rs.getString(4)+"\n";


                    jTextArea1.append("_______________________________");
                        jTextArea1.append("\n");
                      jTextArea1.append(hui);
                      jTextArea1.append("\n");

                    }


                } catch (SQLException ex) {
                    ex.printStackTrace();
                }


            }
        });
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("请假已发出请耐心等待");
                jTextArea.append("\n");
                new qingjia();
            }

        });
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("开始查询学生选课详情");
                jTextArea.append("\n");
                new xuanke();
            }
        });
        jButton3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("开始删除学生详情");
                jTextArea.append("\n");
                new Page03();
            }
        });
        jButton4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("开始修改学生详情");
                jTextArea.append("\n");
                new Mmodify();
                //new Page03();
            }
        });
        jButton5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("开始添加学生课表");
                jTextArea.append("\n");
                new Addkebiao();
                //new Page03();
            }
        });
        jButton6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("开始更新学生数据");
                jTextArea.append("\n");
//                //
//                String url="jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Shanghai&useTimezone=true";
//                String user="root";
//                String password="123456";
//                Connection conn = null;
//                try {
//                    conn = DriverManager.getConnection(url, user, password);
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//                //定义sql语句
//                String sql="insert into xuesclass(son, conName)  select son,conName from student ;";
//                //执行sql对象
//                Statement statement = null;
//                try {
//                    statement = conn.createStatement();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//                try {
//                    int i = statement.executeUpdate(sql);
//                    if (i>0){
//                        jTextArea.append("更新ok");
//                    }
//
//
//
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }




                //new Page03();
            }
        });
        jButton7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("开始登录教师端口");
                jTextArea.append("\n");
                new Teacher();

            }
        });






        //


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
