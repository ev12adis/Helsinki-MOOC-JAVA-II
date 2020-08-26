import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        ArrayList<Flight> flights = new ArrayList<Flight>();
        ArrayList<Plane> planes = new ArrayList<Plane>();
        
        AirportPanel airportPanel = new AirportPanel(reader,planes,flights);
        airportPanel.startAirportPanel();
        System.out.print("\n");
        FlightService flightService = new FlightService(reader,planes,flights);
        flightService.startFlightService();
        
    }
}
