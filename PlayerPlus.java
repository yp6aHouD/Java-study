import java.text.DecimalFormat;

public class PlayerPlus extends BaseballPlayer
{
    /* 
     * используем статические переменные для объявления их один раз
     * для всего класса, а потом увеличения переменной при создании
     * каждого объекта
     */
    private static int playerCount = 0;
    private static double totalOfAverages = .000;
    private static DecimalFormat decFormat = new DecimalFormat();

    /* 
     * статически форматируем строку decFormat, чтобы для каждого
     * вызова функции сохранилось одинаковое форматирование
     */
    static
    {
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMinimumFractionDigits(3);
        decFormat.setMaximumFractionDigits(3);
    }

    public PlayerPlus(String name, double averageBalls)
    {
        super(name, averageBalls);
        playerCount++;
        totalOfAverages += averageBalls;
    }

    /* 
     * объявляем статические методы, которые сохраняют данные
     * даже при создании других объектов класса
     * (данные привязаны к классу, не к объекту)
     */
    public static double findTeamAverage()
    {
        return totalOfAverages / playerCount;
    }

    public static String findTeamAverageString()
    {
        return decFormat.format(totalOfAverages / playerCount);
    }
}
