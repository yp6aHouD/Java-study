package Lesson100524;

import java.awt.event.*;
import java.awt.*;


public class JavaGUI3_Frame
{
    public static void main(String[] args)
    {
       new MyFrame3();
    }
}

/* 
 * для действий обязательно нужно реализовать интерфейс ActionListener
 * имплементировать + реализовать метод actionPerformed
 */
class MyFrame3 implements ActionListener
{
    Frame f;
    Button btn1, btn2, btn3;
    Label s;
    static int numC = 0;
    
    public MyFrame3()
    {
        f = new Frame("HelloFirstFrame");
        
        btn1 = new Button("+");
        btn1.addActionListener(this);
        
        btn2 = new Button("-");
        btn2.addActionListener(this);
        
        btn3 = new Button("Clear");
        btn3.addActionListener(this);
        
        s = new Label("" + numC);
        s.setSize(100, 50);
        
        f.setLayout(new FlowLayout(FlowLayout.LEFT)); // установка расположения кнопок
        f.setBackground(Color.CYAN);
        
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(s);
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }    
        });
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) // метод, который будет выполняться при нажатии на кнопку                                    
    {                                          // (e - это объект, который вызвал событие)
        if (e.getSource() == btn1) 
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
        }
    }
}