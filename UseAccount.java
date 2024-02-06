import static java.lang.System.out;

public class UseAccount
{
    public static void main(String args[])
    {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setName("Daniil");
        myAccount.setAddress("成都, 电子科大");
        myAccount.setBalance(3141.5);
        
        yourAccount.setName("Noname");
        yourAccount.setAddress("北京，北京语言大学");
        yourAccount.setBalance(2718.28);

        out.println("\nName: " + myAccount.getName());
        out.println("Address: " + myAccount.getAddress());
        out.printf("Balance: $%.2f\n", myAccount.getBalance());
        out.println();
        
        out.println("Name: " + yourAccount.getName());
        out.println("Address: " + yourAccount.getAddress());
        out.printf("Balance: $%.2f\n", yourAccount.getBalance());
        out.println();

    }
}