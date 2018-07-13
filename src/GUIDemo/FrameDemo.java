package GUIDemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
    public static void main(String[] args) {
        //创建窗体对象
        Frame f = new Frame();
        //设置窗口大小 单位：像素
//        f.setSize(400, 300);
//        //设置窗体位置
//        f.setLocation(500, 200);
        //设置窗口大小和宽高
        f.setBounds(500,200,400,300);
        //添加事件监听
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }

        });
        //设置布局为流式布局
        f.setLayout(new FlowLayout());
        Button b = new Button("点我");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你再点试试。。。");
            }
        });
        //b.setSize(20,10);
        f.add(b);
        //调用一个方法，让窗体可见
        //设置窗口标题也可以用构造方法设置Frame f = new Frame("name");
        f.setTitle("HELLO");
        // f.show(); 方法过时
        f.setVisible(true);


    }
}
