public class Student2 extends Student
{
    public Student2(String name, int id) // конструкторы на основе конструкторов суперкласса
    {
        super(name, id);
    }

    public Student2(String name, int id, double gpa)
    {
        super(name, id, gpa);
    }

    public Student2(String name, int id, Major major)
    {
        super(name, id, major);
    }

    public Student2(String name, int id, double gpa, Major major)
    {
        super(name, id, gpa, major);
    }

    public String getString()
    {
        return "Name: " + this.GetName() + "\n" +
               "id: " + this.GetId() + "\n" +
               "GPA: " + this.GetGpa() + "\n" +
               "Major: " + this.GetMajor() + "\n";  
    }   

}
