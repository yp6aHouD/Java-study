package Lesson110524;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JavaGUI5_JavaAWT
{
    public static void main(String[] args)
    {
       new MyFrame5();
    }
}

class MyFrame5 implements ActionListener
{
    private JFrame f; //声明容器对象
    private JButton b; //声明组件对象
    
    public MyFrame5()
    {
        f = new JFrame("XXX");
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        JButton b = new JButton("Exit");
        b.addActionListener(this); //给按钮b添加(注册)单击鼠标的事件监听器
        f.add(b); //等价于c.add(b);
        f.setBounds(500,400,200,150); //窗口的位置和大小
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //单击x按钮时关闭窗口
    }

    public void actionPerformed(ActionEvent e)
    { 
        if (e.getSource() == b)
        { //事件源是按钮b
            System.out.println("off");
            System.exit(0); //终止当前正在运行的Java 虚拟机
        }
    }
}