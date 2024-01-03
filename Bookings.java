/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travel_tourism;

/**
 *
 * @author 202210865
 */
public class Bookings {
    public Bookings(){
        airline = new Airline();
        person = new Person();
    }
    
    Airline airline;
    Person person;
    public void Register(){
        System.out.println("User Registration: ");
        person.setDetails();
        System.out.println("Flight Registration: ");
        airline.setFlight();
    }
}
