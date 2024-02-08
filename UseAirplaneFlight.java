import java.time.LocalTime;

public class UseAirplaneFlight 
{
    public static void main(String[] args)
    {
        AirplaneFlight First = new AirplaneFlight(111, 
            AirplaneFlight.Airport.MIA, AirplaneFlight.Airport.DEN);

        AirplaneFlight Second = new AirplaneFlight(222, 
            AirplaneFlight.Airport.ATL, AirplaneFlight.Airport.LAX,
            LocalTime.of(8, 30), LocalTime.of(11,45));

        First.PrintFlightInfo();
        Second.PrintFlightInfo();
    }
}
