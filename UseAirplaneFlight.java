import java.time.LocalTime;

public class UseAirplaneFlight 
{
    public static void main(String[] args)
    {
        /* 
         * рейсы на основе родительского класса
         */
        AirplaneFlight First = new AirplaneFlight(111, 
            AirplaneFlight.Airport.MIA, AirplaneFlight.Airport.DEN);

        AirplaneFlight Second = new AirplaneFlight(222, 
            AirplaneFlight.Airport.ATL, AirplaneFlight.Airport.LAX,
            LocalTime.of(8, 30), LocalTime.of(11,45));

        First.PrintFlightInfo();
        Second.PrintFlightInfo();


        /* 
         * рейсы на основе производного класса
         * с использованием метода Duration
         * и переписанного PrintFlightInfo()
         */
         AirplaneFlight2 Third = new AirplaneFlight2(333,
                AirplaneFlight.Airport.DFW, AirplaneFlight.Airport.SFO);

        AirplaneFlight2 Fourth = new AirplaneFlight2(444,
                AirplaneFlight.Airport.ORD, AirplaneFlight.Airport.LAS,
                LocalTime.of(14, 00), LocalTime.of(19, 30));

        Third.PrintFlightInfo();
        Fourth.PrintFlightInfo();
    }
}
