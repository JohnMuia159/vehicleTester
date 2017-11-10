/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *
 * @author jomui8426
 */
public class VehicleTester {

    /**
     * This is the interface where users put in their input and where the printout statements are.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car("blue","electricity",5);
        Truck t = new Truck("black","diesel",true);
        Minivan m= new Minivan("green","gas","Mercedes");
    
    System.out.println(c);
    System.out.println(t);
    System.out.println(m);
    }   
}
