import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings({ "unused" })
public class SimpleFrame extends JFrame
{
    public SimpleFrame()
    {
        setTitle("Don't click this button!"); // заголовок фрейма
        setLayout(new FlowLayout()); // центрует кнопки (максимум 5 в ряд)
        setDefaultCloseOperation(EXIT_ON_CLOSE); // операция при закрытии
        add(new JButton("Click here!")); // добавление кнопок
        add(new JButton("Click here!"));
        add(new JButton("Don't click here!"));
        setSize(300, 100); // размер окна
        
        setVisible(true); // видимость фрейма
    }
}