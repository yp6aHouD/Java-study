package Lesson110524;
import java.awt.*; import javax.swing.*;
import java.awt.event.*;

class ListenerActions implements MouseListener
{ //定义事件监听器类
    public void mouseClicked(MouseEvent e){FrameForListener.s.setText("mouseClicked");}
    public void mouseEntered(MouseEvent e){FrameForListener.s.setText("mouseEntered");}
    public void mouseExited(MouseEvent e){FrameForListener.s.setText("mouseExited");}
    public void mousePressed(MouseEvent e){FrameForListener.s.setText("mousePressed");}
    public void mouseReleased(MouseEvent e){FrameForListener.s.setText("mouseReleased");}
}
class FrameForListener
{ //GUI界面类
    static JLabel s; //要跨类访问，必须声明为成员对象
    public FrameForListener()
    {
        JFrame f = new JFrame("XXX");
        f.getContentPane().setLayout(new FlowLayout());
        s = new JLabel(" ",JLabel.CENTER);
        f.add(s);
        f.addMouseListener(new ListenerActions()); //f注册监听器
        f.setBounds(300,200,200,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MouseListener1
{
    public static void main(String[] args)
    {
        new FrameForListener();
    }
}