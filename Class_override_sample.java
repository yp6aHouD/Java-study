import static java.lang.System.out;
import java.util.Locale;



public class Class_override_sample
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.CHINA);
        MyThing myThing1, myThing2;
        myThing1 = new MySubThing();
        myThing2 = new MyOtherThing();

        myThing1.value = 5;
        myThing2.value = 25;

        myThing1.display();
        myThing2.display();
    }
}

class MyThing
{
    int value;

    public void display()
    {
        out.println("В MyThing значение = " + value);
    }
}

class MySubThing extends MyThing
{
    @Override
    public void display()
    {
        out.println("В MySUBThing значение = " + value);
    }
}

class MyOtherThing extends MyThing
{
    @Override
    public void display()
    {
        out.println("В MyOTHERThing значение = " + value);
    }
}