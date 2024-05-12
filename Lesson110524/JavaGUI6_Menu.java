package Lesson110524;

import java.awt.event.*;
import java.awt.*;

public class JavaGUI6_Menu
{
    public static void main(String[] args)
    {
       new MyFrame6();
    }
}

class MyFrame6 implements ActionListener
{
    Frame f;
    MenuBar mb;
    Menu m, m4;
    MenuItem m1, m2, m3, m41, m42, m43, m5;

    public MyFrame6()
    {
        f = new Frame("XXX");
        mb = new MenuBar();
        m = new Menu("Color");
        m5 = new MenuItem("Exit");
        
        m1 = new MenuItem("Red(R)       Ctrl+R");
        m2 = new MenuItem("Green(G)    Ctrl+G");
        m3 = new MenuItem("Blue(B)      Ctrl+B");
        
        m4 = new Menu("Set");
        m41 = new MenuItem("Pink");
        m42 = new MenuItem("Cyan");
        m43 = new MenuItem("Yellow");

        f.setMenuBar(mb);
        mb.add(m);
        
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);

        m4.add(m41);
        m4.add(m42);
        m4.add(m43);
        m.addSeparator();
        m.add(m5);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m41.addActionListener(this);
        m42.addActionListener(this);
        m43.addActionListener(this);
        m5.addActionListener(this);

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
        if (e.getSource() == m1)
        {
            f.setBackground(Color.RED);
        }
        else if (e.getSource() == m2)
        {
            f.setBackground(Color.GREEN);
        }
        else if(e.getSource() == m3)
        {
            f.setBackground(Color.BLUE);
        }
        else if(e.getSource() == m41)
        {
            f.setBackground(Color.PINK);
        }
        else if(e.getSource() == m42)
        {
            f.setBackground(Color.CYAN);
        }
        else if(e.getSource() == m43)
        {
            f.setBackground(Color.YELLOW);
        }
        else if(e.getSource() == m5)
        {
            System.exit(0);
        }
    }
    
}