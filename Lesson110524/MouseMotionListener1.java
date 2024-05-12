package Lesson110524;
import java.awt.*; import javax.swing.*;
import java.awt.event.*;

class T implements MouseMotionListener
{ //定义事件监听器类
    public void mouseDragged(MouseEvent e)
    {
        G.s.setText("mouseDragged=("+e.getX()+","+e.getY()+")");
    }
    public void mouseMoved(MouseEvent e)
    {
        G.s.setText("mouseMoved=("+e.getX()+","+e.getY()+")");
    }
}
class G
{ //GUI界面类
    static JLabel s; //要跨类访问，必须声明为成员对象
    public G()
    {
        JFrame f = new JFrame("XXX");
        f.getContentPane().setLayout(new FlowLayout());
        s = new JLabel(" "); f.add(s);
        f.addMouseMotionListener(new T()); //f注册侦听器
        f.setBounds(300,200,200,100); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MouseMotionListener1
{
    public static void main(String[] args)
    {
        new G();
    }
}