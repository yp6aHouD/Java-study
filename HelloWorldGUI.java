import javax.swing.*;

public class HelloWorldGUI 
{
    public static void main(String[] args)
    {
        // создание объекта фрейма и название его
        JFrame frame = new JFrame("Hello World GUI");

        // создание лейбла (текстового)
        JLabel label = new JLabel("Hello, world");

        // стандартная операция при нажатии "X"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // добавление лейбла к фрейму(окну)
        frame.getContentPane().add(label);

        // задание размера окна
        frame.setSize(300, 300);

        // отображение окна (да / нет)
        frame.setVisible(true);
    }
}
