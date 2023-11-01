package Denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DemoMaim {
    public static void main(String[] args) {
//        String s = new String("不不不不");
//        String s1 = new String("她她她");
//        String s0="你你你";



      //  String sql1="update student set conName="+"'"+s0+"'"+",conTime="+   "'"+s+"'"+",conLocation"+"'"+s1+"' "+" where studentid=?";
      //  String sql="select studentid,son,sex,phone from student where studentid="+"'"+s+"'"+","+"'"+s1+"'";
//        System.out.println(sql);
//        System.out.println(sql1);
        JFrame jFrame = new JFrame("你好窗口");//新建窗口传参带代表窗口名字
        jFrame.setSize(400,300);//设置大小 默认单位是px（像素点）
        jFrame.setLocation(100,100);//位置、、左上角是0，0
        //jFrame.setBounds();可以用这个方法代替创建窗口1
        jFrame.setTitle("helllo");
        jFrame.setLayout(new FlowLayout());
        //
        //
//        JPanel jPanel = new JPanel();
//        jPanel.addAncestorListener(new AncestorListener() {
//            @Override
//            public void ancestorAdded(AncestorEvent event) {
//
//            }
//
//            @Override
//            public void ancestorRemoved(AncestorEvent event) {
//
//            }
//
//            @Override
//            public void ancestorMoved(AncestorEvent event) {
//
//            }
//        });
        ImageIcon imageIcon = new ImageIcon("kebiao.jpg");
        jFrame.getContentPane().setBackground(Color.white); //正确显示黑色
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(170,80,Image.SCALE_FAST));
        JLabel jLabel = new JLabel(imageIcon);
       // jFrame.add(jLabel);
        JButton jButton = new JButton();
        jButton.setBackground(Color.yellow);
        jButton.add(jLabel);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*File file = new File("D:\\视频素材\\aikun.MP3");
                try {
                    Player player = new Player(new FileInputStream(file));
                    player.play();
                } catch (FileNotFoundException | JavaLayerException s) {
                    // TODO Auto-generated catch block
                    s.printStackTrace();
                }*/
            }
        });

        jFrame.add(jButton);

//        jLabel.addAncestorListener(new AncestorListener() {
//            @Override
//            public void ancestorAdded(AncestorEvent event) {
//
//                File file = new File("D:\\视频素材\\aikun.MP3");
//                try {
//                    Player player = new Player(new FileInputStream(file));
//                    player.play();
//                } catch (FileNotFoundException | JavaLayerException s) {
//                    // TODO Auto-generated catch block
//                    s.printStackTrace();
//                }
//            }
//
//            @Override
//            public void ancestorRemoved(AncestorEvent event) {
//
//                File file = new File("D:\\视频素材\\aikun.MP3");
//                try {
//                    Player player = new Player(new FileInputStream(file));
//                    player.play();
//                } catch (FileNotFoundException | JavaLayerException s) {
//                    // TODO Auto-generated catch block
//                    s.printStackTrace();
//                }
//            }
//
//            @Override
//            public void ancestorMoved(AncestorEvent event) {
//
//                File file = new File("D:\\视频素材\\aikun.MP3");
//                try {
//                    Player player = new Player(new FileInputStream(file));
//                    player.play();
//                } catch (FileNotFoundException | JavaLayerException s) {
//                    // TODO Auto-generated catch block
//                    s.printStackTrace();
//                }
//            }
//        });
        //
        jFrame.setVisible(true);//是否可见
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭方式
    }
}
