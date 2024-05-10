package Lesson100524;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/* 
 * при работе с Jframe нужно делать Container
 * Сам JFrame это рамка, а внутри нее находится контейнер
 */
public class JavaGUI4_JFrame
{
    public static void main(String[] args)
    {
       new MyFrame4();
    }
}

class MyFrame4 implements ActionListener
{
    private JFrame f;
    private Container c;
    public MyFrame4()
    {
        f = new JFrame("HelloFirstJFrame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = new JPanel();
        c = f.getContentPane();

        c.setBackground(Color.YELLOW);
        f.setSize(300, 200);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) // метод, который будет выполняться при нажатии на кнопку                                    
    {                                          // (e - это объект, который вызвал событие)
        /* if (e.getSource() == btn1) 
        {
            numC++;
            s.setText("" + numC);
        }
        else if (e.getSource() == btn2)
        {
            numC--;
            s.setText("" + numC);
        }
        else if (e.getSource() == btn3)
        {
            numC = 0;
            s.setText("" + numC);
        } */
    }
}