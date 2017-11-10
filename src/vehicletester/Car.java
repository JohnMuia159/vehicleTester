/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *This class is called car and it has colour and fuel. it also has an int for the number of seats in the car.
 * @author jomui8426
 */
public class Car extends Vehicle{
    private int numberSeats;
    
    
    public Car(String colour, String fuel, int seats){
    super (colour,fuel);
    numberSeats = seats;
    }
    
    public int getSeats(){
        return numberSeats;
    }
    
    public String toString(){
        String carString;
        
        carString = "The car is the colour: " + super.getColour() + ". \n"
                + "The car runs on: " + super.getFuel() + ". \n"
                + "The car has: " + numberSeats + " seats" + ".";
        
        return(carString);
    }
}


