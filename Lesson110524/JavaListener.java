package Lesson110524;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

class IfActionPerformed implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
    String s ="";
    s += "getActionCommand() = " + e.getActionCommand() + "\n";
    s += "getModifiers() = " + e.getModifiers() + "\n";
    s += "getWhen() = " + e.getWhen() + "\n";
    Listener1.textArea.setText(s);
}
}
class Listener1
{
    static JTextArea textArea;
    public Listener1()
    {
        JFrame f = new JFrame("XXX");
        f.getContentPane().setLayout(new FlowLayout());
        textArea = new JTextArea(5,8);
        JButton b = new JButton("OK");
        f.add(textArea); f.add(b);
        IfActionPerformed t = new IfActionPerformed();
        b.addActionListener(t);
        f.setBounds(300,200,300,200); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class JavaListener
{
    public static void main(String[] args)
    {
        new Listener1();
    }
}