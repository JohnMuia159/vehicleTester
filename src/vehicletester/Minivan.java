/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *This class is called minivan and it has colour and fuel. it also has a String for what the make is of the minivan.
 * @author jomui8426
 */
public class Minivan extends Vehicle{
    private String make;
    
    public Minivan(String colour, String fuel,String brand){
    super (colour,fuel);
    make = brand;
    }
    public String toString(){
        String vanString;
        
        vanString = "The minivan is the colour: " + super.getColour() + ". \n"
                + "The minivan runs on: " + super.getFuel() + ". \n"
                + "The minivan is a: " + make + ".";
        
        return(vanString);
    } 
}
