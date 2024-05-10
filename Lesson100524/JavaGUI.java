package Lesson100524;

import java.awt.event.*;
import java.awt.*;


/* 
 * из библиотек для рисования интерфейса есть
 * java.awt.* - старая библиотека, с момента winXP
 * после winXP стала чаще использоваться javax.swing.*
 * которая почти полностью заменила java.awt.*
 * в которой используется множество классов для создания интерфейса:
 * -- JLabel - текстовая текстовое поле
 * -- JButton - кнопка
 * -- JTextField - текстовое поле
 * и прочие.. (почти все подклассы перекочевали из awt, в названии появилась J)
 */

 /* 
  * 
  */
public class JavaGUI 
{
    public static void main(String[] args)
    {
       new MyFrame();
    }
}

class MyFrame
{
    Frame f;
    Button button1;
    FlowLayout fl;
    Font ft;

    public MyFrame()
    {
        f = new Frame("HelloFirstFrame");
        ft = new Font("Arial", Font.BOLD + Font.ITALIC, 14); // создание шрифта
        fl = new FlowLayout(FlowLayout.CENTER);

        button1 = new Button("Hello");
        button1.setSize(100, 50);
        button1.setFont(ft); // установка шрифта
        button1.setBackground(new Color(150, 0, 200)); // создание цвета фона кнопки
        button1.setForeground(Color.red); // цвет букв в кнопке

        f.setSize(300, 200);
        f.setBackground(Color.CYAN);
        f.setLayout(fl);
        f.add(button1);
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }    
        });
        f.setVisible(true);
    }
}
