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

public class AirportPanel {

    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
    private Scanner reader;

    public AirportPanel(Scanner reader, ArrayList<Plane> planes, ArrayList<Flight> flights) {
        this.planes = planes;
        this.flights = flights;
        this.reader = reader;
    }

    public void startAirportPanel() {
        System.out.print("Airport panel\n--------------------\n");
        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            String input = reader.nextLine();
            input = stringCleaner(input);
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
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

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        id = stringCleaner(id);
        for (Plane plane : this.planes) {
            if (id.equals(plane.getID())) {
                System.out.print("\nPlane already registered.");
                return;
            }
        }
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        this.planes.add(new Plane(id, capacity));
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        id = stringCleaner(id);
        for (Plane plane : this.planes) {
            if (plane.getID().equals(id)) {
                System.out.print("Give departure airport code: ");
                String from = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String to = reader.nextLine();
                this.flights.add(new Flight(id, from, to));
            }
        }
    }
}
