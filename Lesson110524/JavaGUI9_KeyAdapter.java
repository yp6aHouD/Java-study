package Lesson110524;

import java.awt.event.*;
import javax.swing.*;

/* 
 * GridLayout компонует компоненты в таблицу
 * с заданным числом строк и столбцов.
 */
public class JavaGUI9_KeyAdapter
{
    public static void main(String[] args)
    {
       new MyFrame9();
    }
}

class MyFrame9 extends KeyAdapter
{
    private JFrame f;
    private JButton b;
    private int x, y;
    public MyFrame9()
    {
        f = new JFrame("XXX");
        f.setBounds(500, 400, 300, 300);
        f.setLayout(null);

        b = new JButton("UESTC");
        f.add(b);

        x = f.getWidth() / 3;
        y = f.getHeight() / 3;
        b.setBounds(x, y, 80, 30);
        b.addKeyListener(this);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            x = x - 10; 
            if (x < 0)
            {
                x = f.getWidth();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            x = x + 10;
            if (x > f.getWidth())
            {
                x = 0;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            y = y - 10;
            if (y < 0)
            {
                y = f.getHeight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            y = y + 10; 
            if (y > f.getHeight())
            {
                y = 0;
            }
        }
        b.setLocation(x,y);
    }
}