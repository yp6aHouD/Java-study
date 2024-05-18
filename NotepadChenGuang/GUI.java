package NotepadChenGuang;

import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;


public class GUI implements ActionListener
{
    // Popup message
    PopupMessage popupMessage;
    JFrame window;
    // TextArea
    JTextPane textArea;
    JScrollPane scrollPane;
    // Top Menu Bar
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, formatMenu, viewMenu;
    JMenuItem fNew, fOpen, fSave, fSaveAs, fExit,
    eCut, eCopy, ePaste, eFind,
    fFontAndSize,
    vBackgroundColor, vZoomIn, vZoomOut;

    FileFunction fileFunction = new FileFunction(this);
    FormatFunction formatFunction = new FormatFunction(this);

    
    String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    // Создание выпадающего списка с шрифтами
    JComboBox<String> fontList = new JComboBox<>(fonts);

    public GUI()
    {
        createWindow();
        createTextPane();
        createMenuBar();
        createFileMenu();
        createFormatMenu();
        
        window.setVisible(true);
    }

    public void createWindow()
    {
        window = new JFrame("NotePad by Neliubin Daniil");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
    }

    public void createTextPane()
    {
        textArea = new JTextPane();
        scrollPane = new JScrollPane(textArea, 
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        this.scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
    }

    public void createMenuBar()
    {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        editMenu = new JMenu("Edit");
        eCut = new JMenuItem("Cut");
        eCopy = new JMenuItem("Copy");
        ePaste = new JMenuItem("Paste");
        eFind = new JMenuItem("Find");

        formatMenu = new JMenu("Format");

        viewMenu = new JMenu("View");
        vBackgroundColor = new JMenuItem("Background color");
        vZoomIn = new JMenuItem("Zoom in");
        vZoomOut = new JMenuItem("Zoom out");

        menuBar.add(fileMenu);

        menuBar.add(editMenu);
        editMenu.add(eCut);
        editMenu.add(eCopy);
        editMenu.add(ePaste);
        editMenu.addSeparator();
        editMenu.add(eFind);

        menuBar.add(formatMenu);
        
        menuBar.add(viewMenu);
        viewMenu.add(vZoomIn);
        viewMenu.add(vZoomOut);
        viewMenu.addSeparator();
        viewMenu.add(vBackgroundColor);


        this.menuBar.setBorder(BorderFactory.createEmptyBorder());
        window.setJMenuBar(menuBar);
    }

    public void createFileMenu()
    {
        fNew = new JMenuItem("New");
        fNew.addActionListener(this);
        fNew.setActionCommand("New");
        fileMenu.add(fNew);
        
        fOpen = new JMenuItem("Open");
        fOpen.addActionListener(this);
        fOpen.setActionCommand("Open");
        fileMenu.add(fOpen);

        fSave = new JMenuItem("Save");
        fSave.addActionListener(this);
        fSave.setActionCommand("Save");
        fileMenu.add(fSave);

        fSaveAs = new JMenuItem("Save as");
        fSaveAs.addActionListener(this);
        fSaveAs.setActionCommand("SaveAs");
        fileMenu.add(fSaveAs);
        fileMenu.addSeparator();

        fExit = new JMenuItem("Exit");
        fExit.addActionListener(this);
        fExit.setActionCommand("Exit");
        fileMenu.add(fExit);

    }

    public void createFormatMenu()
    {
        fFontAndSize = new JMenuItem("Font and size");
        fFontAndSize.addActionListener(this);
        fFontAndSize.setActionCommand("FontAndSize");
        formatMenu.add(fFontAndSize);      
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        switch(command)
        {
            case "New": 
                fileFunction.newFile(); break;
            case "Open":
                fileFunction.openFile(); break;
            case "Save":
                fileFunction.save(); break;
            case "SaveAs":
                fileFunction.saveAs(); break;
            case "Exit":
                fileFunction.exit(); break;
            case "FontAndSize":
                formatFunction.setTextFontAndSize(); break;
        }
    }

    public static void main(String[] args)
    {
        new GUI();
    }
}