/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.Scanner;
import java.util.ArrayList;

public class FlightService {

    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
    private Scanner reader;

    public FlightService(Scanner reader, ArrayList<Plane> planes, ArrayList<Flight> flights) {
        this.planes = planes;
        this.flights = flights;
        this.reader = reader;
    }

    public void startFlightService() {
        System.out.println("Flight service\n------------\n");
        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            String input = reader.nextLine();
            input = stringCleaner(input);
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();
            } else {
                System.out.println("UnKnown statement\n");
            }
        }

    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }
        return string.trim();
    }
    
    private void printPlanes(){
        for(Plane plane:this.planes){
            System.out.println(plane);
        }
    }
    
    private void printFlights(){
        for(Flight flight:this.flights){
            for(Plane plane:this.planes){
                if(flight.getPlaneID().equals(plane.getID())){
                    System.out.println(plane + " " + flight);
                }
            }
        }
        System.out.print("\n");
    }
    
    private void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        id = stringCleaner(id);
        for(Plane plane:this.planes){
            if (plane.getID().equals(id)){
                System.out.println(plane);
            }
        }
        System.out.print("\n");
    }

}
