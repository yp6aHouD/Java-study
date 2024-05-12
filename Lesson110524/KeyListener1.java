package Lesson110524;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

class UseKeyListener1 implements KeyListener
{ //定义事件监听器类
public void keyPressed(KeyEvent e)
{
    System.out.println("getKeyChar()="+e.getKeyChar());
    System.out.println("getKeyCode()="+e.getKeyCode());
    System.out.println("getKeyText()="+e.getKeyText(e.getKeyCode()));
    System.out.println("getModifiers()="+e.getModifiers());
    System.out.println("getKeyModifiersText()="+e.getKeyModifiersText(e.getModifiers()));
    System.out.println("isActionKey()="+e.isActionKey());
    System.out.println("getID()="+e.getID());
    System.out.println("getWhen()="+e.getWhen());
    System.out.println("getKeyLocation()="+e.getKeyLocation());
    //System.out.println("toString()="+e.toString());
    //System.out.println("paramString()="+e.paramString());
    System.out.println("////////////////////////////////");
}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
class FrameForKeyListener1
{
    public FrameForKeyListener1()
    {
        JFrame f=new JFrame("XXX"); f.getContentPane();
        f.addKeyListener(new UseKeyListener1()); //f注册监听器
        f.setBounds(0,0,200,100); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class KeyListener1
{
    public static void main(String[] args)
    {
        new FrameForKeyListener1();
    }
}