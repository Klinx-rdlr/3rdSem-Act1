/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travel_tourism;

import java.util.Scanner;

/**
 *
 * @author 202210865
 */
public class Person {
    Scanner getInput = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    
    public void setDetails(){
        String fName, lName, nationality;
        int age;
        System.out.println("Enter your first name: ");
        fName = getInput.nextLine();
        System.out.println("Enter your last name: ");
        lName = getInput.nextLine();
        System.out.println("Enter your age: ");
        age = Integer.parseInt(getInput.nextLine());
        if(age < 18){
              System.out.println("Are you accompanied with a guardian? [Y/N]");
           if(getInput.next().charAt(0) == 'N'){
              System.out.println("You're not eligible to book a flight");
           }
        }
         System.out.println("Enter your nationality: ");
         nationality = getInput.nextLine();
         
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.nationality = nationality;
    }
    
}