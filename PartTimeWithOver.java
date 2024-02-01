// переписывание (переопределение) метода в надклассе

public class PartTimeWithOver extends PartTimeEmployee
{
    @Override // для проверки наличия метода в суперклассе
    public double findPaymentAmount(int hours)
    {
        if (hours <= 40)
        {
            return getHourlyRate() * hours;
        }
        else return getHourlyRate() * 40 + getHourlyRate() * 2 * (hours - 40);
    }
}
