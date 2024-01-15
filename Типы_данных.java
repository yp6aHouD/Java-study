import javax.swing.JFrame;
import static java.lang.System.out; // позволяет не писать System.out

public class Типы_данных 
{
    public static void main(String[] args) 
    {
        int max_weight = 635, weight_of_person = 68,
        numberOfPeople = max_weight / weight_of_person; 
        // деление двух интов это всегда инт

        out.print("Лифт может поднять ");
        out.print(numberOfPeople);
        out.println( " человек.");

        char myLittleChar = 'b';
        char myBigChar = Character.toUpperCase(myLittleChar);
        out.println(myBigChar);

        out.print("Верно ли, ");
        out.print("что лифт может поднять ");
        out.print("десять человек?");
        out.println();

        boolean allTenOk = numberOfPeople >= 10;

        out.println(allTenOk);

        JFrame myFrame = new JFrame();
        String myTitle = "Пустое окно";
        myFrame.setVisible(true);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle(myTitle);

        out.println(5/4);
        out.println(5/4.0);
        out.println(5.0/4);
        out.println(5.0/4.0);
        out.println("5" + "4");
        out.println(5 + 4);
        out.println(" " + 5 + 4); // после введения строкового формата
                        // все остальные операции тоже становятся строковыми    
        
    }
}