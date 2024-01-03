
package com.mycompany.travel_tourism;
import java.util.Scanner;

/**
 *
 * @author 202210865
 */
public class Airline {
    Scanner getInput = new Scanner(System.in);
    
    private String [] airlineList = {"Avelo", "Asiana", "JetBlue", "Allegiant"};
    private String airlineName;
    private String departure;
    private String arrival;
    private String timeFlight;
    
    public void setFlight(){
        String depart, arrive, time;
        int option = chooseAirline();
        System.out.println("Enter departure: ");
        depart = getInput.nextLine();
        System.out.println("Enter arrival: ");
        arrive = getInput.nextLine();
        System.out.println("Enter time flight: ");
        time = getInput.nextLine();
        
        this.airlineName = airlineList[option];
        this.arrival = arrive;
        this.departure = depart;
        this.timeFlight = time; 
    }
    
    public int chooseAirline(){
        System.out.println("Avialble airlines are the following:");
        System.out.println("[1] Avelo");
        System.out.println("[2] Asiana");
        System.out.println("[3] JetBlue");
        System.out.println("[4] Allegiant");
        
        int option = Integer.parseInt(getInput.nextLine());
        return option;
    }
}
