import com.allmycode.dummiesframe.DummiesFrame;

public class print_accont_fummies_frame
{
    public static void main(String[] args)
    {
        DummiesFrame frame = new DummiesFrame("Отображение счёта");
        frame.addRow("Полное имя ");
        frame.addRow("Адрес ");
        frame.addRow("Баланс ");
        frame.setButtonText("Отобразить");
        frame.go();
    }

    public static String calculate(String name, String address, double balance)
    {
        Account myAccount = new Account();
        myAccount.setName(name);
        myAccount.setAddress(address);
        myAccount.setBalance(balance);

        return myAccount.getName() + " (" + myAccount.getAddress() + 
        ") " + "имеет баланс $" + myAccount.getBalance();
    }
}