import static java.lang.System.out;
import java.time.LocalTime;

public class AirplaneFlight
{
    public enum Airport
    {
        LAX, JFK, DFW, ATL, ORD, SFO, MIA, SEA, LAS, DEN
    };

    private int PlaneNumber;
    private Airport DepartureAirport;
    private LocalTime DepartureTime;
    private Airport ArrivalAirport;
    private LocalTime ArrivalTime;

    public AirplaneFlight(int PlaneNumber, Airport DepartureAirport, Airport ArrivalAirport)
    {
        setPlaneNumber(PlaneNumber);
        setDepartureAirport(DepartureAirport);
        setArrivalAirport(ArrivalAirport);
    }

    public AirplaneFlight(int PlaneNumber, Airport DepartureAirport, Airport ArrivalAirport, 
        LocalTime DepartureTime, LocalTime ArrivalTime)
    {
        setPlaneNumber(PlaneNumber);
        setDepartureAirport(DepartureAirport);
        setDepartureTime(DepartureTime);
        setArrivalAirport(ArrivalAirport);
        setArrivalTime(ArrivalTime);
    }

    public void setPlaneNumber(int PlaneNumber)
    {
        this.PlaneNumber = PlaneNumber;
    }

    public void setDepartureAirport(Airport DepartureAirport)
    {
        this.DepartureAirport = DepartureAirport;
    }

    public void setDepartureTime(LocalTime DepartureTime)
    {
        this.DepartureTime = DepartureTime;
    }

    public void setArrivalAirport(Airport ArrivalAirport)
    {
        this.ArrivalAirport = ArrivalAirport;
    }

    public void setArrivalTime(LocalTime ArrivalTime)
    {
        this.ArrivalTime = ArrivalTime;
    }

    public int getPlaneNumber()
    {
        return PlaneNumber;
    }

    public Airport getDepartureAirport()
    {
        return DepartureAirport;
    }

    public LocalTime getDepartureTime()
    {
        return DepartureTime;
    }

    public Airport getArrivalAirport()
    {
        return ArrivalAirport;
    }

    public LocalTime getArrivalTime()
    {
        return ArrivalTime;
    }

    public void PrintFlightInfo()
    {
        final String example = "\nFlight number: %d\nDeparture airport: %s\n" + 
            "Departure time: %s\nArrival airport: %s\nArrival time: %s\n";
        out.printf(example, getPlaneNumber(), getDepartureAirport(), getDepartureTime(),
            getArrivalAirport(), getArrivalTime());
    }
}
