import static java.lang.System.out;
import java.util.Locale;
import java.util.Formatter;

public class Employee
{
    private String name;
    private String jobTitle;

    public void setName(String nameIn)
    {
        name = nameIn;
    }
    
    public String getName()
    {
        return name;
    }

    public void setJobTitle(String jobTitleIn)
    {
        jobTitle = jobTitleIn;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void cutCheck(double amountPaid)
    {
        Locale.setDefault(Locale.CHINA);
        out.printf("Pay to the employee %s ", name);
        out.printf("(%s) ", jobTitle);
        out.print(new java.util.Formatter().format(java.util.Locale.CHINA, "%.2f\n", amountPaid));
    }
}