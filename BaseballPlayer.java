import java.text.DecimalFormat;

public class BaseballPlayer 
{
    private String name;
    private double averageBalls;

    public BaseballPlayer(String name, double averageBalls)
    {
        this.name = name;
        this.averageBalls = averageBalls;
    }

    public String getName()
    {
        return name;
    }

    public double getAverageBalls()
    {
        return averageBalls;
    }

    public String getAverageBallsString()
    {
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
        return decFormat.format(averageBalls);
    }
}
