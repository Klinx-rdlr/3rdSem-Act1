
package com.mycompany.travel_tourism;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author 202210865
 */
public class Project1 {
  
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        Bookings books = new Bookings();
        ArrayList<Bookings> bookings = new ArrayList<>();
        
        while(true){
             System.out.println("Welcome to Airlines Bookings");
        System.out.println("[1] Register");
        System.out.println("[2] View Bookings");
        System.out.println("[3] Exit");
        int option = Integer.parseInt(getInput.nextLine());
        switch(option){
            case 1 -> books.Register();
            case 3 -> {
                break;
            }
        }
        }
           
    }
}
   
