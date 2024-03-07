import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class JavaSwingStarted
{
    private static int state = 0;
    
    public static void main(String[] args)
    {
        /* 
         * Defying text and buttons as variables
         * for removing / adding them freely
         */
        JFrame window = new JFrame();
        JButton button1 = new JButton("Text on button");
        JCheckBox checkbox1 = new JCheckBox("Text after checkbox");
        JLabel text1 = new JLabel("This is the first string");
        JLabel text2 = new JLabel("This is the second string");

        /* 
         *  Adding text and button to the frame
         */
        window.setTitle("Trying to use JFrame by myself");
        window.setLayout(new GridLayout(1,2,20,3));
        window.setDefaultCloseOperation(3); // 3 = EXIT_ON_CLOSE
        window.add(text1);
        window.add(button1);
        window.add(text2);
        window.add(checkbox1);
        window.pack();

        window.setVisible(true);

        /* 
         * Performing action while button pressed
         * using switch-case
         */
        button1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                switch (state) {
                    case 0:
                        window.setTitle("FlowLayout");
                        window.setLayout(new FlowLayout());
                        window.setSize(400, 200);
                        break;
                    case 1:
                        window.setTitle("GridLayout");
                        window.setSize(300, 150);
                        window.setLayout(new GridLayout(4, 1, 0, 5));
                        break;
                    case 2:          
                        window.setTitle("CardLayout");
                        window.setSize(400, 400);
                        window.setLayout(new CardLayout());   
                        break;
                    case 3:
                        window.setTitle("BorderLayout");
                        window.setLayout(new BorderLayout());
                        window.remove(button1);
                        window.remove(text1);
                        window.remove(text2);
                        window.remove(checkbox1);
                        
                        window.add((button1), BorderLayout.CENTER);
                        button1.setSize(100, 100);
                        window.add((text1), BorderLayout.NORTH);
                        window.add((text2), BorderLayout.EAST);
                        window.add((checkbox1), BorderLayout.SOUTH);
                        window.setSize(500, 200);
                        break;
                }       
                state = (state + 1) % 4; // Cycle back to 0 after reaching 2
            }
        });       
    }
}