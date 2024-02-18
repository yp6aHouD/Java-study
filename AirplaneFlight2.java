import static java.lang.System.out;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AirplaneFlight2 extends AirplaneFlight
{
    AirplaneFlight2(int PlaneNumber, Airport DepartureAirport, Airport ArrivalAirport)
    {
        super(PlaneNumber, DepartureAirport, ArrivalAirport);
    }

    AirplaneFlight2(int PlaneNumber, 
                    Airport DepartureAirport, Airport ArrivalAirport, 
                    LocalTime DepartureTime, LocalTime ArrivalTime)
    {
        super(PlaneNumber, DepartureAirport, ArrivalAirport, DepartureTime, ArrivalTime);
    }
    long getDurationHours()
    {
        if (getArrivalTime() != null && getDepartureTime() != null)
        {
            return ChronoUnit.HOURS.between(getDepartureTime(), getArrivalTime());
        }
        else return 0L;
    }

    long getDurationMinutes()
    {
        if (getArrivalTime() != null && getDepartureTime() != null)
        {
            return ChronoUnit.MINUTES.between(getDepartureTime(),getArrivalTime());
        }
        else return 0L;
    }

    /* 
     * переписывание функции печати информации о полёте
     */
    @Override
    public void PrintFlightInfo()
    {
        String example = "\nFlight number: %d\nDeparture airport: %s\n";
        if (getDepartureTime() != null)
        {
            example += "Departure time: %s\n";
        }

        example += "Arrival airport: %s\n";
        if (getArrivalTime() != null)
        {
            example += "Arrival time: %s\n";
        }

        if (getDepartureTime() != null && getArrivalTime() != null)
        {
            example += "Duration: %d minutes";
            out.printf(example, getPlaneNumber(), getDepartureAirport(), getDepartureTime(),
                getArrivalAirport(), getArrivalTime(), getDurationMinutes());
        }
        else
        {
            out.printf(example, getPlaneNumber(), getDepartureAirport(),
                getArrivalAirport());
        }

    }
}
