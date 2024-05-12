package Lesson110524;

import java.awt.event.*;
import java.awt.*;

/* 
 * GridLayout компонует компоненты в таблицу
 * с заданным числом строк и столбцов.
 */
public class JavaGUI8_GridLayout
{
    public static void main(String[] args)
    {
       new MyFrame8();
    }
}

class MyFrame8 implements ActionListener
{
    Frame f; // при создании фрейм имеет BorderLayout по умолчанию
    Button[] b = new Button[9];
    Panel p;

    public MyFrame8()
    {
        f = new Frame("XXX");
        f.setLayout(new GridLayout(3, 4));

        for (int i = 0; i < b.length; i++)
        {
            b[i] = new Button("" + i);
            f.add(b[i]);
        }

        p = new Panel();
        f.add(p);
        p.setBackground(Color.YELLOW);
        
        p.add(new Button("FF"));
        p.add(new Button("GG"));
        p.add(new Button("HH"));

        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }    
        });

        f.setSize(300,200);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

    }
    
}