import static java.lang.System.out;

public class Student 
{
    public enum Major
    {
        Computer_Science, Math, Literature, Physics, History, NONE
    };


    private String name;
    private int id;
    private double gpa;
    private Major major;
    

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        gpa = 0.0;
        major = Major.NONE;
    }

    public Student(String name, int id, double gpa)
    {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        major = Major.NONE;
    }

    public Student(String name, int id, Major major)
    {
        this.name = name;
        this.id = id;
        this.gpa = 0.0;
        this.major = major;
    }

    public Student(String name, int id, double gpa, Major major)
    {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }


    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetId(int id)
    {
        this.id = id;
    }

    public void SetGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public void SetMajor(Major major)
    {
        this.major = major;
    }

    public String GetName()
    {
        return name;
    }

    public int GetId()
    {
        return id;
    }

    public double GetGpa()
    {
        return gpa;
    }

    public Major GetMajor()
    {
        return major;
    }

    
    public void PrintInfo()
    {   
        final String Example = "Name: %s\nID: %d\nGPA: %5.2f\nMajor: %s\n\n";
        out.printf(Example, GetName(), GetId(), GetGpa(), GetMajor());
    }
}
