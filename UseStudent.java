public class UseStudent 
{
    public static void main(String[] args)
    {
        Student first = new Student("Anthony", 1);
        Student second = new Student("Tommy", 2, 2.5);
        Student third = new Student("Katy", 3, Student.Major.Math);
        Student fourth = new Student("Danny", 4, 4.0, Student.Major.Computer_Science);

        first.PrintInfo();
        second.PrintInfo();
        third.PrintInfo();
        fourth.PrintInfo();
    }   
}
