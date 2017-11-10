/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *This class is called truck and it has colour and fuel. it also has a boolean for if the truck has a trailer. 
 * @author jomui8426
 */
public class Truck extends Vehicle{
    private Boolean trailer;
    
    public Truck(String colour, String fuel, boolean hasTrailer){
    super (colour,fuel);
    trailer=hasTrailer;
      }
        public boolean hastrailer(){
        return trailer;
    }
        public String toString(){
        String truckString;
        
        truckString = "The truck is the colour: " + super.getColour() + ". \n" 
                + "The truck runs on: " + super.getFuel() + ". \n"
                + "(If true, then there is a trailer. If false there is no trailer) " + trailer + ".";
        
        return(truckString);
    } 
}
