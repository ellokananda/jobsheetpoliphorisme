/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author User
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeropian is Flying");
    }
    public static void main (String [] args){
        AeroPian garuda = new AeroPian();
        garuda.function();
        garuda.fuel();
        garuda.walk();
        
        
    }
    
}
