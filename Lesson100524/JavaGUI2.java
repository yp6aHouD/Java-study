package Lesson100524;

import java.awt.event.*;
import java.awt.*;

/* 
 * если нужно добавить несколько кнопок, то
 * нужно создать контейнер кнопок
 * действия кнопок считываются в java.awt.event.*
 */
public class JavaGUI2 
{
    public static void main(String[] args)
    {
       new MyFrame2();
    }
}

/* 
 * для действий обязательно нужно реализовать интерфейс ActionListener
 * имплементировать + реализовать метод actionPerformed
 */
class MyFrame2 implements ActionListener
{
    Frame f;
    Button btn1, btn2, btn3;

    
    public MyFrame2()
    {
        f = new Frame("HelloFirstFrame");
        
        btn1 = new Button("Red");
        btn1.addActionListener(this);
        
        btn2 = new Button("Green");
        btn2.addActionListener(this);
        
        btn3 = new Button("Blue");
        btn3.addActionListener(this);
        
        f.setLayout(new FlowLayout(FlowLayout.LEFT)); // установка расположения кнопок
        f.setBackground(Color.CYAN);
        
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
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
            f.setBackground(Color.RED);
        else if (e.getSource() == btn2) 
            f.setBackground(Color.GREEN);
        else 
            f.setBackground(Color.BLUE);
    }
}