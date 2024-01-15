import javax.swing.JOptionPane;

public class login_password_JOptionPane
{
    public static void main(String[] args) 
    {
        String username = 
            JOptionPane.showInputDialog("Имя пользователя: ");
        String password = 
            JOptionPane.showInputDialog("Пароль: "); // Ввод символьного пароля
        // int secondPassword = Integer.parseInt(JOptionPane.showInputDialog("Настоящий числовой пароль: ")); // Ввод числового пароля
        // double thirdPassword = Double.parseDouble(JOptionPane.showInputDialog("Введите дробный пароль: ")); // Ввод дробного пароля

        if  (username != null && password != null &&
                (
                    ((username.equals("anakluo") || username.equals("ANAKLUO"))) && password.equals("anakluo") ||
                    ((username.equals("danya") || username.equals("DANYA")) && password.equals("danya"))
                )
            )
        {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему, " + username + "!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Попытайтесь ещё раз!");
        }
    }
}