package NotepadChenGuang;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class FormatFunction
{
    private GUI gui;

    public FormatFunction(GUI gui)
    {
        this.gui = gui;
    }

    //установка шрифта и размера
    public void setTextFontAndSize() 
    {
        // Получение списка доступных шрифтов
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JComboBox<String> fontList = new JComboBox<>(fonts);
        fontList.setEditable(true);

        // Создание выпадающего списка с размерами шрифтов
        Integer[] fontSizes = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
        JComboBox<Integer> fontSizeList = new JComboBox<>(fontSizes);
        fontSizeList.setEditable(true);

        // Создание панели с выпадающими списками
        JPanel panel = new JPanel();
        panel.add(new JLabel("Font:"));
        panel.add(fontList);
        panel.add(Box.createHorizontalStrut(15)); // a spacer
        panel.add(new JLabel("Size:"));
        panel.add(fontSizeList);

        // Создание окна с выбором шрифта и размера шрифта
        JOptionPane.showMessageDialog(null, panel, "Choose Font and Size", JOptionPane.QUESTION_MESSAGE);
        String selectedFont = (String) fontList.getSelectedItem();
        Integer selectedFontSize = (Integer) fontSizeList.getSelectedItem();

        // Получение выделенного текста
        String selectedText = gui.textArea.getSelectedText();

        if (selectedText != null) 
        {
            // Получение начала и конца выделенного текста
            int start = gui.textArea.getSelectionStart();
            int end = gui.textArea.getSelectionEnd();

            // Получение StyledDocument
            StyledDocument doc = gui.textArea.getStyledDocument();

            // Создание нового стиля
            Style style = doc.addStyle("NewFontAndSizeStyle", null);
            StyleConstants.setFontFamily(style, selectedFont);
            StyleConstants.setFontSize(style, selectedFontSize);

            // Применение стиля к выделенному тексту
            doc.setCharacterAttributes(start, end - start, style, false);
        } 
        
        else 
        {
            // Установка шрифта и размера шрифта для всего текста, если ничего не выделено
            Font font = new Font(selectedFont, Font.PLAIN, selectedFontSize);
            gui.textArea.setFont(font);
        }
    }
   
}
