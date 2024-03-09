import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame
{
    public TeamFrame() throws IOException // Выбрасываем исключения в консоль
    {
        PlayerPlus player;
        Scanner hankeesData = new Scanner(new File("Hankees.txt"));

        /* 
         * считываем данные 9 раз и добавляем JLabel
         * для каждого игрока через addPlayerInfo
         */
        for (int num = 1; num <= 9; num++)
        {
            player = new PlayerPlus(hankeesData.nextLine(), hankeesData.nextDouble());
            hankeesData.nextLine();
            addPlayerInfo(player);
        }

        add (new JLabel());
        add (new JLabel(" ------"));
        add (new JLabel("Average Hankees team shots per player"));
        add (new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("Hankees team shots");
        setLayout(new GridLayout(11, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        hankeesData.close();
    }

    void addPlayerInfo(BaseballPlayer player)
    {
        add (new JLabel(" " + player.getName()));
        add (new JLabel(" " + player.getAverageBallsString()));
    }
}