package NotepadChenGuang;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class PopupMessage extends JWindow 
{
    private static final int FADE_TIME = 1500; // время исчезновения в миллисекундах

    GUI gui;
    JLabel label;

    public PopupMessage(GUI gui, String message) 
    {
        setAlwaysOnTop(true);
        
        // Добавление сообщения
        label = new JLabel(message, SwingConstants.CENTER);
        label.setBorder(new EmptyBorder(10, 10, 10, 10)); // Добавление отступов
        add(label);

        // Установка размера окна под содержимое
        pack();

        // Расположение окна в верхнем правом углу
        Point location = gui.textArea.getLocationOnScreen();
        Dimension screenSize = gui.textArea.getSize();
        setLocation(location.x + screenSize.width - getWidth() - 10, location.y + 10);

        // Добавление сообщения
        add(new JLabel(message, SwingConstants.CENTER));

        // Создание таймера для анимации исчезновения
        Timer timer = new Timer(FADE_TIME / 100, e -> 
        {
            float opacity = getOpacity();
            opacity -= 0.01f;
            setOpacity(Math.max(opacity, 0));
            if (opacity <= 0) 
            {
                ((Timer) e.getSource()).stop();
                dispose();
            }
        });
        timer.start();
    }
}
