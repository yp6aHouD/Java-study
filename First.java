import static java.lang.System.out;


public class First
{
    public static void main(String[] args)
    {
        second me = new second();
    //  me.balance = 100; // нельзя использовать, т. к. переменная private
        me.address = "Nobody knows where I'm living.";
        me.name = "yp6aHouD";

        out.println("nick: " + me.name);
        out.println("address: " + me.address);
    //  out.println("balance: " + me.balance);
    }
}

class second
{
    public String name; // стандартная, может использоваться везде
    protected String address; // защищенный доступ
    private int balance; // не может использоваться другими классами, 
}                        // а только внутри класса.