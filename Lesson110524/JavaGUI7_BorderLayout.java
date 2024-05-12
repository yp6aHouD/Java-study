package Lesson110524;

import java.awt.event.*;
import java.awt.*;

/* 
 * BorderLayout компонует компоненты в пять областей: NORTH, SOUTH, EAST, WEST и CENTER.
 */
public class JavaGUI7_BorderLayout
{
    public static void main(String[] args)
    {
       new MyFrame7();
    }
}

class MyFrame7 implements ActionListener
{
    Frame f; // при создании фрейм имеет BorderLayout по умолчанию
    Button[] b = new Button[5];
    String[] s = {"AA", "BB", "CC", "DD", "EE"};
    String[] t = {BorderLayout.NORTH, 
        BorderLayout.SOUTH, 
        BorderLayout.EAST, 
        BorderLayout.WEST, 
        BorderLayout.CENTER};
    Panel p;

    public MyFrame7()
    {
        f = new Frame("XXX");
        f.setLayout(new BorderLayout());

        for (int i = 0; i < b.length - 1; i++)
        {
            b[i] = new Button(s[i]);
            f.add(b[i], t[i]);
        }

        p = new Panel();
        f.add(p, BorderLayout.CENTER);
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